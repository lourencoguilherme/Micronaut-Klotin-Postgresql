create table accounts(
    id serial not null primary key,
    name char(255) not null,
    description char(256) not null,
    create_at TIMESTAMP not null default now()
);