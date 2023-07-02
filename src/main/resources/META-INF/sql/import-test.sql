INSERT INTO student(id, name, major, mentor, country)
VALUES (1, 'Henk', 'Computer Science', 'Me', 'Nederland');

INSERT INTO student(id, name, major, mentor, country)
VALUES (2, 'Cees', 'Math', 'Me', 'Belgie');

INSERT INTO student(id, name, major, mentor, country)
VALUES (3, 'Maria', 'Math', 'Me', 'Nederland');

INSERT INTO student(id, name, major, mentor, country)
VALUES (4, 'Tom', 'Physics', 'You', 'UK');

INSERT INTO student(id, name, major, mentor, country)
VALUES (5, 'Anna', 'Chemistry', 'You', 'USA');

INSERT INTO student(id, name, major, mentor, country)
VALUES (6, 'John', 'Biology', 'Them', 'Australia');

INSERT INTO student(id, name, major, mentor, country)
VALUES (7, 'Sarah', 'Art', 'Them', 'Italy');

INSERT INTO student(id, name, major, mentor, country)
VALUES (8, 'Bill', 'Computer Science', 'Them', 'Canada');

INSERT INTO student(id, name, major, mentor, country)
VALUES (9, 'Emma', 'Computer Science', 'Us', 'Germany');

INSERT INTO student(id, name, major, mentor, country)
VALUES (10, 'Charlie', 'Art', 'Us', 'France');

ALTER TABLE student ALTER COLUMN id RESTART WITH 11;
