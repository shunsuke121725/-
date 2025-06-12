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
    age INT NOT NULL,
    bloodType CHAR(5),
    diseaseName varchar(100),
    symptoms varchar(100),
    latestBookingDate DATE,
    place VARCHAR(50),
    FOREIGN KEY (list_id) REFERENCES lists(list_id)
);