BEGIN;
CREATE TABLE users(
     id SERIAL PRIMARY KEY,
     fullname varchar(64) not null,
     username varchar(64) not null,
     password varchar(255) not null,
     qrcode varchar(255),
     age int,
     gender varchar(64) not null,
     email varchar(255),
     mobile_number int,
     icon varchar(255),
     expired_date varchar(255),
     status boolean,
     is_admin boolean,
     created_at TIMESTAMP WITH TIME ZONE default NOW(),
     updated_at TIMESTAMP WITH TIME ZONE default NOW()
 );



COMMIT