CREATE TABLE student_table
(id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(20) NOT NULL,
email VARCHAR(100) NOT NULL, 
password VARCHAR(100),
mobile BIGINT NOT NULL,
UNIQUE(email),
CHECK(LENGTH(password)>=8 AND LENGTH(mobile)=10));

INSERT INTO student_table(name,email,password,mobile) values
 ('Lavanya','klavanya1997@gmail.com','lalu@123',8778804219);