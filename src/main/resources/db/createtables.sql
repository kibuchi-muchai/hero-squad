SET MODE PostgreSQL;

--create two tables for heroes and squads. NB; always use plural

create TABLE IF NOT EXISTS heroes(
id int PRIMARY KEY auto_increment,
heroName VARCHAR,
heroPower VARCHAR,
heroWeakness VARCHAR,
heroGender VARCHAR,
squadId INTEGER,
heroAge INTEGER,
);

create TABLE IF NOT EXISTS squads(
id int PRIMARY KEY auto_increment,
squadName VARCHAR,
squadPurpose VARCHAR,
squadNumber INTEGER,
squadGroup VARCHAR,
);