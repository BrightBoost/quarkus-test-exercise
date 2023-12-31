package org.example;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;
import jakarta.json.*;
import jakarta.ws.rs.core.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.Test;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentResourceTestExercise {
    @Test
    @Order(1)
    void getAll() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students"
        // 2. Ensures the response has a content type of JSON
        // 3. Checks the response status code
        // 4. Validates the response body contains the expected data
    }

    @Test
    @Order(1)
    void getById() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students/{id}"
        // 2. Checks the response status code
        // 3. Validates the response body contains the expected data for the given id
    }

    @Test
    @Order(1)
    void getByIdKO() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students/{id}" where id does not exist
        // 2. Checks that the response status code is NOT_FOUND
    }

    @Test
    @Order(1)
    void getByName() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students/name/{name}"
        // 2. Checks the response status code
        // 3. Validates the response body contains the expected data for the given name
    }

    @Test
    @Order(1)
    void getByNameKO() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students/name/{name}" where name does not exist
        // 2. Checks that the response status code is NOT_FOUND
    }

    @Test
    @Order(2)
    void getByCountry() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students/country/{country}"
        // 2. Checks the response status code
        // 3. Validates the response body contains the expected data for the given country
    }

    @Test
    @Order(2)
    void getByCountryKO() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students/country/{country}" where country does not exist
        // 2. Checks that the response status code is OK
        // 3. Validates that the response body is empty
    }

    @Test
    @Order(3)
    void create() {
        // You should implement a test that:
        // 1. Creates a new student JsonObject with the necessary data
        // 2. Makes a POST request to "/students" with the created JsonObject
        // 3. Checks that the response status code is CREATED
    }

    @Test
    @Order(4)
    void updateById() {
        // You should implement a test that:
        // 1. Creates a JsonObject with the data to update
        // 2. Makes a PUT request to "/students/{id}" with the created JsonObject
        // 3. Checks the response status code
        // 4. Validates the response body contains the updated data for the given id
    }

    @Test
    @Order(4)
    void updateByIdKO() {
        // You should implement a test that:
        // 1. Creates a JsonObject with the data to update
        // 2. Makes a PUT request to "/students/{id}" where id does not exist
        // 3. Checks that the response status code is NOT_FOUND
    }

    @Test
    @Order(5)
    void deleteById() {
        // You should implement a test that:
        // 1. Makes a DELETE request to "/students/{id}"
        // 2. Checks that the response status code is NO_CONTENT
        // 3. Makes a GET request to "/students/{id}" and checks that the response status code is NOT_FOUND
    }

    @Test
    @Order(5)
    void deleteByIdKO() {
        // You should implement a test that:
        // 1. Makes a DELETE request to "/students/{id}" where id does not exist
        // 2. Checks that the response status code is NOT_FOUND
    }

    // week 5 exercises!
    @Test
    @Order(6)
    void getByMajor() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students/major/{major}"
        // 2. Checks the response status code
        // 3. Validates the response body contains the expected data for the given major
    }

    @Test
    @Order(6)
    void getByMajorKO() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students/major/{major}" where major does not exist
        // 2. Checks that the response status code is OK
        // 3. Validates that the response body is empty
    }

    @Test
    @Order(7)
    void updateCountry() {
        // You should implement a test that:
        // 1. Makes a PUT request to "/students/country/{id}" with the new country data
        // 2. Checks that the response status code is OK
        // 3. Validates the response body contains the updated data for the given id
    }

    @Test
    @Order(7)
    void updateCountryKO() {
        // You should implement a test that:
        // 1. Makes a PUT request to "/students/country/{id}" where id does not exist
        // 2. Checks that the response status code is NOT_FOUND
    }

    @Test
    @Order(8)
    void createWithInvalidData() {
        // You should implement a test that:
        // 1. Creates a new student JsonObject with invalid or malformed data
        // 2. Makes a POST request to "/students" with the created JsonObject
        // 3. Checks that the response status code is BAD_REQUEST or another appropriate error status
    }

    @Test
    @Order(9)
    void testPagination() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students?page=0&size=10"
        // 2. Checks that the response status code is OK
        // 3. Validates the response body contains the expected data and size
    }

    @Test
    @Order(9)
    void testPaginationNoResults() {
        // You should implement a test that:
        // 1. Makes a GET request to "/students?page=1&size=10"
        // 2. Checks that the response status code is OK
        // 3. Validates the response body contains the expected data and size
    }

    // add at least 4 tests to ensure the correct functioning of the two new endpoints at the end of the StudentResource file





}
