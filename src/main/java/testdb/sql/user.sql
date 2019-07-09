CREATE TABLE public.users
(
    id SERIAL NOT NULL,
    name TEXT,
    email VARCHAR(20),
    address_id INT PRIMARY KEY,
    CONSTRAINT users_address_id_fk FOREIGN KEY (address_id) REFERENCES address (id)
);
CREATE UNIQUE INDEX users_id_uindex ON public.users (id);

select * from users