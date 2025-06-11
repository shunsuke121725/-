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
    place VARCHAR(20),
    FOREIGN KEY (list_id) REFERENCES lists(list_id) ON DELETE CASCADE
);