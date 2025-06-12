insert into lists (list_id, name, latestBookingDate, place) 
values (1, '山田 熱也', '2025-06-02', '診察室');

insert into patients (list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place) 
VALUES (1, '山田 熱也', 30, 'A', '風邪', '発熱、喉の痛み', '2025-06-02', '診察室');

insert into lists (list_id, name, latestBookingDate, place) 
values (2, '山田 テスト', '2025-06-02', '治療室');

insert into patients (list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate, place) 
VALUES (2, '山田　テスト', 30, 'A', '風邪', '発熱、喉の痛み', '2025-06-02', '治療室');

   -- PW は「track」
INSERT INTO users (username, password) VALUES ('sample', '$2a$08$hBocxV325GV9RKzHR.lHreJr8DsMrkg6vg0kRTbNnBvUFknu670GC');
