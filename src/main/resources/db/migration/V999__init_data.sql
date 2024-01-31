

INSERT INTO users (username, password, qrcode, age, email, mobile_number, icon, expired_date, status) VALUES ('James', '123', 'test', '30', 'james@tecky.io', '99998888', 'image', '30 Jan 2025', false);

INSERT INTO admins (username, password, email) VALUES ('Navy', '123', 'navy@tecky.io');

INSERT INTO gym_rooms (map, location_name, location_address, location_contact, location_max_people) VALUES ('map test', 'Hong Kong', 'Mongkok', '2688 8888', '200');

INSERT INTO check_in_records (check_in_date) VALUES ('30 Jan 2024');

INSERT INTO course_lists (name, tutor, tutor_icon, date, time) VALUES ('yoga', 'Amy', 'Amy image', 'Wednesday', '18:00-20:00');

INSERT INTO class_reservations (register_email, confirm_msg) VALUES ('james@tecky.io', 'Please click thee link to complete the reservation');