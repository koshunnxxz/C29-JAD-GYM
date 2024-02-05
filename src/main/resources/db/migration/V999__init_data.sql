

INSERT INTO users (username, password, qrcode, age, email, mobile_number, icon, expired_date, status) VALUES ('James', '$2a$10$IpU.rTE7Olsdr.X.ku2TzeioQLJySdeuOHy5jH8ULEzkTvq1yQ0sm', 'test', '30', 'james@tecky.io', '99998888', 'image', '30 Jan 2025', false);
INSERT INTO users (username, password, qrcode, age, email, mobile_number, icon, expired_date, status) VALUES ('Alfred', '$2a$10$IpU.rTE7Olsdr.X.ku2TzeioQLJySdeuOHy5jH8ULEzkTvq1yQ0sm', 'test', '30', 'james@tecky.io', '99998888', 'image', '30 Jan 2025', true);
--
INSERT INTO admins (username, password, email) VALUES ('Navy', '$2a$10$IpU.rTE7Olsdr.X.ku2TzeioQLJySdeuOHy5jH8ULEzkTvq1yQ0sm', 'navy@tecky.io');
--
INSERT INTO gym_rooms (map, location_name, location_address, location_contact, location_max_people) VALUES ('map test', 'Hong Kong', 'Mongkok', '2688 8888', '200');
--
INSERT INTO check_in_records (user_id, gym_room_id, check_in_date) VALUES (1, 1, '30 Jan 2024');
INSERT INTO check_in_records (user_id, gym_room_id, check_in_date) VALUES (2, 1, '02 Feb 2024');
--

INSERT INTO course_lists (name, tutor, tutor_icon, max_people_limit, open_datetime, end_datetime, gym_room_id) VALUES
('yoga', 'Amy', 'Amy Icon', 8, '2024-02-05T17:00:00Z+08:00', '2024-02-05T10:00:00Z+00:00', 1),
('Program', 'Amy', 'Amy Icon', 8, '2024-02-05T17:00:00Z+08:00', '2024-02-05T10:00:00Z+00:00', 1);
--
INSERT INTO class_reservations (register_email, confirm_msg, user_id, course_id) VALUES ('james@tecky.io', 'Please click thee link to complete the reservation', 1, 1);