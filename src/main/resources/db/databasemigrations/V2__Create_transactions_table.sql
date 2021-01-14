create table transactions(
    id serial not null primary key,
    title char(128) not null,
    description char(256) not null,
    value numeric(100, 2) not null,
    create_at TIMESTAMP not null default now()
);