package org.example;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

import static jakarta.ws.rs.core.Response.Status.BAD_REQUEST;
import static jakarta.ws.rs.core.Response.Status.NOT_FOUND;

@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {

    @Inject StudentRepository studentRepository;

    @GET
    public Response getAll() {
        List<Student> students = studentRepository.listAll();
        return Response.ok(students).build();
    }

    @GET
    @Path("{id}")
    public Response getById(@PathParam("id") Long id) {
        return studentRepository
                .findByIdOptional(id)
                .map(s -> Response.ok(s).build())
                .orElse(Response.status(NOT_FOUND).build());
    }

    @GET
    @Path("name/{name}")
    public Response getByName(@PathParam("name") String name) {
        return studentRepository
                .find("name", name)
                .singleResultOptional()
                .map(s -> Response.ok(s).build())
                .orElse(Response.status(NOT_FOUND).build());
    }

    @GET
    @Path("country/{country}")
    public Response getByCountry(@PathParam("country") String country) {
        List<Student> students = studentRepository.findByCountry(country);
        if(students.size() == 0) {
            return Response.status(NOT_FOUND).build();
        }
        return Response.ok(students).build();
    }

    @POST
    @Transactional
    public Response create(Student student) {
        studentRepository.persist(student);
        if (studentRepository.isPersistent(student)) {
            return Response.created(URI.create("/students/" + student.getId())).build();
        }
        return Response.status(NOT_FOUND).build();
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Response updateById(@PathParam("id") Long id, Student student) {
        return studentRepository
                .findByIdOptional(id)
                .map(
                        m -> {
                            m.setName(student.getName());
                            return Response.ok(m).build();
                        })
                .orElse(Response.status(NOT_FOUND).build());
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response deleteById(@PathParam("id") Long id) {
        boolean deleted = studentRepository.deleteById(id);
        return deleted ? Response.noContent().build() : Response.status(NOT_FOUND).build();
    }
}