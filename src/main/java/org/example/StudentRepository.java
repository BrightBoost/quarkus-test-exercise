package org.example;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class StudentRepository implements PanacheRepository<Student> {

    public List<Student> findByCountry(String country) {
        return list("SELECT m FROM Student m WHERE m.country = ?1 ORDER BY id DESC", country);
    }

    public List<Student> findByMajor(String major) {
        return list("SELECT m FROM Student m WHERE m.major = ?1 ORDER BY id DESC", major);
    }

    public boolean updateCountry(Long id, String country) {
        return update("country = ?1 where id = ?2", country, id) > 0;
    }

    public List<Student> findByMentor(String mentor) {
        return list("mentor", mentor);
    }
}
