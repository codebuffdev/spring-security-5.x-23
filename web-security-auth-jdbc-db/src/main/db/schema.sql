-- database schema - username | password | role
create database spring_security;
use spring_security;

-- Spring default schema [fixed structure] -
create table users
(
    username varchar(50) not null primary key,
    password varchar(150) not null,
    enabled  boolean     not null
);

create table authorities
(
    username varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key (username) references users (username)
);

# insert into users
insert into spring_security.users (username, password, enabled)
values ('dora', 'mon', 1);
insert into spring_security.users (username, password, enabled)
values ('jerry', 'tom', 1);
insert into spring_security.users (username, password, enabled)
values ('sp', 'sp1234', 1);

create unique index ix_auth_username on authorities (username,authority) ;

# insert into authorities
insert into spring_security.authorities values ('dora', 'ADMIN');
insert into spring_security.authorities values ('dora', 'USER');
insert into spring_security.authorities values ('jerry', 'USER');
insert into spring_security.authorities values ('sp', 'USER');

select * from spring_security.users;
select * from spring_security.authorities;