<p id="title" align="center">
  <a href="#title">
    <img width="80" height="80" src="./.github/logo.png">
    <h1 align="center">Movie DB</h1>
  </a>
</p>

<p align="center">
  <a aria-label="Made By Aristofany Herderson" href="https://github.com/aristofany-herderson/">
    <img src="https://img.shields.io/badge/MADE%20BY%20Aristofany%20Herderson-000000.svg?style=for-the-badge&labelColor=000&logo=starship&logoColor=fff&logoWidth=20">
  </a>
  <a aria-label="Project version" href="https://github.com/aristofany-herderson/movie-db">
    <img alt="Version" src="https://img.shields.io/badge/VERSION-1.0.0-000000.svg?style=for-the-badge&labelColor=000">
  </a>
  <a aria-label="License" href="https://github.com/aristofany-herderson/movie-db/blob/main/LICENSE.md">
    <img alt="License" src="https://img.shields.io/badge/LICENSE-MIT-000000.svg?style=for-the-badge&labelColor=000">
  </a>
  <a aria-label="Built with Java" href="#">
    <img alt="Java" src="https://img.shields.io/badge/BUILT%20WITH%20JAVA-000000.svg?style=for-the-badge&labelColor=000&logo=java&logoColor=fff&logoWidth=20">
  </a>
</p>

<p align="center">🎥 A Java Swing-based movie manager system integrated with a MySQL database.</p>

<br>

## 🧪 Technologies

This project was developed using the following technologies:

- [Java 11+](https://dev.java/)
- [MySQL](https://www.mysql.com/)
- [Swing (GUI library)](https://docs.oracle.com/javase/8/docs/technotes/guides/swing/)

Dependency used:

- [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)

<br>

## 🧑🏻‍💻 Getting Started

#### Clone the project and access the root folder:

```bash
$ git clone https://github.com/aristo-ifrn/movie-db
$ cd movie-db
```

#### Setting up the environment:

1. Set up the database:

   - Create a MySQL database with the required tables, using `db.sql` file.

2. Download the `.jar` file from the [official MySQL Connector page](https://dev.mysql.com/downloads/connector/j/).

   - Add the `.jar` file to the project's classpath.
   - Place the file in the `lib/` folder or configure it in your IDE.

3. Project Configuration:
   - Open the project in NetBeans or your preferred IDE.
   - Configure database credentials in the `MovieDAO` file:

```java
private static final String URL = "jdbc:mysql://localhost:3306/movie_db";
private static final String USER = "your_username";
private static final String PASSWORD = "your_password";
```

#### Running the project:

- Execute the `Teste.java` class to launch the application.
- Ensure the MySQL server is running locally.

<br>

## 💻&nbsp; Project

**Resume:** 🎥 A movie management system that allows you to register, update, delete, and query movies stored in a MySQL database.

#### 🎨&nbsp; Project Structure

- `src/:` Contains the source code for the application.
- `lib/:` External dependencies like MySQL Connector/J.
- `build/:` Compiled Java files.
- `test/:` Unit tests for the application.

#### 🚀&nbsp; Features

- [x] Add new movies with details such as title, release year, duration, age rating, trailer URL, and image URL.
- [x] Edit movie records easily using a graphical interface.
- [x] Delete movies from the database.
- [x] Search movies by name or apply filters like release year or genre.
- [x] Improved error handling with user-friendly messages.

<br />

## 🧑🏻&nbsp; Author

<p align="center">
<img width="14%" src="https://images.weserv.nl/?url=github.com/aristofany-herderson.png?v=4&h=300&w=300&fit=cover&mask=circle&maxage=7d" alt="aristofany-herderson">
<p align="center">
  Aristofany Herderson
</p>
<p align="center">
  <a  href="https://www.linkedin.com/in/aristofany-herderson/" target="_blank">
  <img align="center" src="https://img.shields.io/badge/LINKEDIN-000000.svg?style=for-the-badge&labelColor=0a66c2&logo=linkedin&logoColor=fff&logoWidth=20" alt="linkedin"/>
  </a>
  <a href="https://twitter.com/aristofanyherde" target="_blank">
    <img align="center" src="https://img.shields.io/badge/TWITTER-000000.svg?style=for-the-badge&labelColor=1d9bf0&logo=x&logoColor=fff&logoWidth=20" alt="linkedin"/>
  </a>
  <a href="https://www.instagram.com/aristofany_herderson/" target="_blank">
    <img align="center" src="https://img.shields.io/badge/INSTAGRAM-000000.svg?style=for-the-badge&labelColor=dd326f&logo=instagram&logoColor=fff&logoWidth=20" alt="linkedin"/>
  </a>
</p>
</p>

<br>
