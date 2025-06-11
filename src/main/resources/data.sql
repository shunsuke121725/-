insert into lists (list_id, name, latestBookingDate, place) 
values (1, '山田 太郎', '2025-06-01', '診察室');

INSERT INTO patients (
  list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place) 
  VALUES (1, '山田 太郎', 30, 'A', 'cold', 'cough', '2025-06-01', '診察室');
