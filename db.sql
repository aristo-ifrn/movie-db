CREATE DATABASE IF NOT EXISTS `movie_db`;

USE `movie_db`;

DROP TABLE IF EXISTS `movies`;

CREATE TABLE
  movies (
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    title VARCHAR(255) NOT NULL,
    release_year INT NOT NULL,
    duration INT NOT NULL,
    age_rating VARCHAR(50) NOT NULL,
    trailer_url VARCHAR(500) NOT NULL,
    image_url VARCHAR(500) NOT NULL
  );