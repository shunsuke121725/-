insert into lists (list_id, name, latestBookingDate, place) 
values (1, '山田 熱也', '2025-06-02', '診察室');

insert into lists (list_id, name, latestBookingDate, place) 
values (2, '佐藤 痢子', '2025-06-03', '検査室');

insert into lists (list_id, name, latestBookingDate, place) 
values (3, '鈴木 太郎', '2025-06-03', '集中治療室');


INSERT INTO patients (
  list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place) 
  VALUES (1, '山田 熱也', 30, 'A', '風邪', '発熱、喉の痛み', '2025-06-02', '診察室');

INSERT INTO patients (
  list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place) 
  VALUES (2, '佐藤 痢子', 27, 'O', '胃腸炎', '下痢、腹痛', '2025-06-03', '検査室');

INSERT INTO patients (
  list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place) 
  VALUES (3, '鈴木 太郎', 56, 'B', '心臓病', '動悸、息切れ', '2025-06-03', '集中治療室');
  