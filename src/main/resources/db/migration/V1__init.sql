create table users
(
    id       bigserial,
    username varchar(30) not null unique,
    password varchar(80) not null,
    email    varchar(50) unique,
    primary key (id)
);

create table roles
(
    id   serial,
    name varchar(50) not null
);

create table users_roles
(
    user_id bigint not null,
    role_id int    not null,
    primary key (user_id, role_id),
    foreign key (user_id) references users (id),
    foreign key (role_id) references roles (id)
);

insert into roles (name)
values ('ROLE_USER'),
       ('ROLE_ADMIN'),
       ('ROLE_SUPERADMIN');

insert into users(username, password, email)
values ('user', '$2a$12$RlEO0Vl3e5ot1TFsyhYl6uzNuiFtXrGWiFRHKMaqVTvgrdfVLGrdK', 'user@gmail.com'),
       ('admin', '$2a$12$RlEO0Vl3e5ot1TFsyhYl6uzNuiFtXrGWiFRHKMaqVTvgrdfVLGrdK', 'admin@gmail.com'),
       ('superadmin', '$2a$12$RlEO0Vl3e5ot1TFsyhYl6uzNuiFtXrGWiFRHKMaqVTvgrdfVLGrdK', 'superadmin@gmail.com');

insert into users_roles(user_id, role_id)
values (1, 1),
       (2, 2),
       (3, 3);