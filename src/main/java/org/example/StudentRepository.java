package org.example;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class StudentRepository implements PanacheRepository<Student> {

    public List<Student> findByCountry(String country) {
        return list("SELECT m FROM Student m WHERE m.country = ?1 ORDER BY id DESC", country);
    }
}
