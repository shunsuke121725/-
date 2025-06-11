insert into lists (list_id, name, latestBookingDate, place) values
   (1, '山田 太郎', '2025-06-01', '診察室A');

insert into patients (list_id, name, age, bloodType, diseaseName, symptoms, latestBookingDate) values
   (1, '山田 太郎', 30, 'A', 'cold', 'cough', '2025-06-01');

   -- PW は「track」
INSERT INTO users (username, password) VALUES ('sample', '$2a$08$hBocxV325GV9RKzHR.lHreJr8DsMrkg6vg0kRTbNnBvUFknu670GC');
