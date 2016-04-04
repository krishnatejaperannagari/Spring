DROP TABLE TEST.ADDRESS;
DROP TABLE TEST.EMPLOYEE;


CREATE TABLE TEST.EMPLOYEE(

E_ID INT PRIMARY KEY AUTO_INCREMENT,
FIRST_NAME VARCHAR(20) NOT NULL,
LAST_NAME VARCHAR(20) NOT NULL,
GENDER VARCHAR(20) NOT NULL
);


CREATE TABLE TEST.ADDRESS (

A_ID INT PRIMARY KEY AUTO_INCREMENT,
E_ID INT,
ADDRESS_LINE_1 VARCHAR(20) NOT NULL,
ADDRESS_LINE_2 VARCHAR(20),
CITY VARCHAR(20) NOT NULL,
STATE VARCHAR(20) NOT NULL,
COUNTRY VARCHAR(20) NOT NULL,
ZIP_CODE VARCHAR(20) NOT NULL

);
ALTER TABLE TEST.ADDRESS ADD CONSTRAINT FK_EM_ADD_E_ID FOREIGN KEY(E_ID) REFERENCES TEST.EMPLOYEE (E_ID) ON DELETE CASCADE ON UPDATE CASCADE;

