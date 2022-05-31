


DROP SCHEMA IF EXISTS students;
CREATE SCHEMA students;

use students;
create table students(
id int NOT NULL AUTO_INCREMENT,
first_name VARCHAR(50),
last_name VARCHAR(50),
PRIMARY KEY (id));

INSERT INTO students.students (first_name, last_name) VALUES
('Maya', 'Charlotte'),
('James', 'Fields'),
('Michael', 'Alcocer'),
('Tomas', 'Lacroix'),
('Sara', 'Bisat'),
('Helena', 'Sepulvida'),
('Michael', 'Goodman'),
('Jacob', 'Armas'),
('Luceilla', 'Sepulvida');