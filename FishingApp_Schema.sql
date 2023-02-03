USE FishingApp;

DROP TABLE IF EXISTS FishLocation;
DROP TABLE IF EXISTS Fish;
DROP TABLE IF EXISTS BodyOfWater;
DROP TABLE IF EXISTS Fisher;
DROP TABLE IF EXISTS FishSpecies;



CREATE TABLE Fisher(
fisher_id int NOT NULL AUTO_INCREMENT,
fisher_first_name varchar(45) NOT NULL,
fisher_last_name varchar(45) NOT NULL,
PRIMARY KEY (fisher_id)
);


CREATE TABLE FishSpecies(
fish_species_id int NOT NULL AUTO_INCREMENT,
species_name varchar(45) NOT NULL,
game_fish bool,
PRIMARY KEY (fish_species_id)
);

CREATE TABLE BodyOfWater(
body_of_water_id int NOT NULL AUTO_INCREMENT,
state varchar(45) NOT NULL,
depth_in_feet int,
PRIMARY KEY (body_of_water_id)
);

CREATE TABLE Fish(
fish_id int NOT NULL AUTO_INCREMENT,
fisher int NOT NULL,
fish_species int NOT NULL,
body_of_water int NOT NULL,
weight decimal(9, 2) NOT NULL, 
length decimal(9, 2) NOT NULL, 
FOREIGN KEY (body_of_water) REFERENCES BodyOfWater(body_of_water_id),
FOREIGN KEY (fish_species) REFERENCES FishSpecies(fish_species_id),
FOREIGN KEY (fisher) REFERENCES Fisher (fisher_id),
PRIMARY KEY (fish_id)
);

CREATE TABLE FishLocation(
fish_species_fk int NOT NULL,
body_of_water_fk int NOT NULL,
FOREIGN KEY (fish_species_fk) REFERENCES FishSpecies (fish_species_id),
FOREIGN KEY (body_of_water_fk) REFERENCES BodyOfWater (body_of_water_id)
);


SET foreign_key_checks = 1;