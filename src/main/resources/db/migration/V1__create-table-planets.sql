CREATE TABLE planets (
    id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(100) NOT NULL UNIQUE,
    climate VARCHAR(100),
    terrain VARCHAR(100),
    film_count varchar(20),
    PRIMARY KEY (id)
);
