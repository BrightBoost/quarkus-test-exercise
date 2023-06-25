INSERT INTO student(id, name, major, mentor, country)
VALUES (1, 'Henk', 'Computer Science', 'Me', 'Nederland');

INSERT INTO student(id, name, major, mentor, country)
VALUES (2, 'Cees', 'Math', 'Me', 'Belgie');

INSERT INTO student(id, name, major, mentor, country)
VALUES (3, 'Maria', 'Math', 'Me', 'Nederland');

ALTER TABLE student ALTER COLUMN id RESTART WITH 4;
