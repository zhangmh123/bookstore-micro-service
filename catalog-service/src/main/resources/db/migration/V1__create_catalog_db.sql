CREATE SEQUENCE IF NOT EXISTS product_id_seq START WITH 1 INCREMENT BY 50;

create table products
(
    id bigint default nextval('product_id_seq') not null,
    code        text not null unique,
    name        text not null,
    description text,
    image_url   text,
    price       numeric not null,
    primary key (id)
);

ALTER TABLE products
    ADD CONSTRAINT uc_products_code UNIQUE (code);