CREATE TABLE lists (
    list_id INTEGER auto_increment PRIMARY KEY,
    name varchar(100) NOT NULL,
    latestBookingDate DATE,
    place varchar(100)
);

CREATE TABLE patients (
    patient_id INTEGER auto_increment PRIMARY KEY,
    list_id INTEGER NOT NULL,
    name varchar(100) NOT NULL,
    age CHAR(3) NOT NULL,
    bloodType CHAR(2),
    diseaseName varchar(100),
    symptoms varchar(100),
    latestBookingDate DATE,
    FOREIGN KEY (list_id) REFERENCES lists(list_id)
);

CREATE TABLE users (
    user_id INTEGER AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(60) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
 );
