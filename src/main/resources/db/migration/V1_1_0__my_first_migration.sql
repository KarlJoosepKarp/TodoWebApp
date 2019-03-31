CREATE TABLE todos (
    id   long         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) NOT NULL,
    description varchar(255) not null,
    done boolean default false
);

insert into todos (name, description) values ( 'Korista', 'Tuba');
insert into todos (name, description) values ( 'Kodutoo', 'Tehisintellekt');
insert into todos (name, description) values ( 'Kodutoo2', 'EX08');
insert into todos (name, description) values ( 'Noud', 'pese neid');
insert into todos (name, description) values ( 'Tangi', 'oma auto');
insert into todos (name, description) values ( 'Korista', 'tuba');