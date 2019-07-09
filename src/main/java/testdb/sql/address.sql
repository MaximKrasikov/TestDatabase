CREATE TABLE public.address
(
    id SERIAL PRIMARY KEY NOT NULL,
    city TEXT,
    street TEXT,
    home_number VARCHAR(5)
);
CREATE UNIQUE INDEX address_id_uindex ON public.address (id);

select * from address