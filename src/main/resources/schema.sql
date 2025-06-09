create table lists (
    list_id integer auto_increment primary key,
    name varchar(100) not null,
    latestBookingDate date,
    place varchar (100),
);

create table patients (
    patient_id integer auto_increment primary key,
    name varchar(100) not null,
    age char(3) not null,
    bloodType char(2),
    diseaseName varchar(100),
    symptoms varchar(100),
    latestBookingDate date,
    foreign key (patient_id) refereces patients(patient_id)
);
