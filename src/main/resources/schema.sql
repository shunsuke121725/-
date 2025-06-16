CREATE TABLE lists (
    list_id INTEGER auto_increment PRIMARY KEY,
    name varchar(50) NOT NULL,
    latestBookingDate DATE,
    place VARCHAR(50)
);

CREATE TABLE patients (
    patient_id INTEGER auto_increment PRIMARY KEY,
    list_id INTEGER NOT NULL,
    name varchar(50) NOT NULL,
    age INT NOT NULL,
    gender CHAR(10),
    bloodType CHAR(5),
    diseaseName varchar(50),
    symptoms varchar(50),
    latestBookingDate DATE,
    place varchar(50),
    FOREIGN KEY (list_id) REFERENCES lists(list_id)
);

CREATE TABLE users (
    user_id INTEGER AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(60) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
 );
