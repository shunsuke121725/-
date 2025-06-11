insert into lists (list_id, name, latestBookingDate, place) 
values (1, '山田 太郎', '2025-06-01', '診察室');

insert into lists (list_id, name, latestBookingDate, place) 
values (2, '佐藤 痢子', '2025-06-02', '検査室');


INSERT INTO patients (
  list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place) 
  VALUES (1, '山田 太郎', 30, 'A', 'cold', 'cough', '2025-06-01', '診察室');

INSERT INTO patients (
  list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place) 
  VALUES (2, '佐藤 痢子', 27, 'O', '胃腸炎', '下痢、腹痛', '2025-06-02', '検査室');

  