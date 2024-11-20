package br.com.movies.dao;

import br.com.movies.domain.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {

    public boolean add(Movie movie) {
        boolean hasWorked = false;

        Connection connection = DBConnection.connect();
        String query = "INSERT INTO movies(title,release_year,duration,age_rating,trailer_url,image_url) values(?,?,?,?,?,?);";

        try {
            PreparedStatement command = connection.prepareStatement(query);
            command.setString(1, movie.getTitle());
            command.setInt(2, movie.getReleaseYear());
            command.setInt(3, movie.getDuration());
            command.setString(4, movie.getAgeRating());
            command.setString(5, movie.getTrailerUrl());
            command.setString(6, movie.getImageUrl());

            int affectedRows = command.executeUpdate();

            if (affectedRows > 0) {
                hasWorked = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DBConnection.disconnect();
        }
        return hasWorked;
    }

    public boolean delete(int id) {
        boolean hasWorked = false;

        String query = "DELETE FROM movies WHERE id= ?;";
        Connection connection = DBConnection.connect();

        try {
            PreparedStatement comando = connection.prepareStatement(query);
            comando.setInt(1, id);

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                hasWorked = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DBConnection.disconnect();
        }
        return hasWorked;

    }

    public boolean update(Movie movie, int id) {
        boolean hasWorked = false;

        Connection connection = DBConnection.connect();
        String query = "UPDATE movies set title = ?, release_year= ?, duration = ?, age_rating = ?, trailer_url = ?, image_url = ? where id = ?;";

        try {
            PreparedStatement command = connection.prepareStatement(query);
            command.setString(1, movie.getTitle());
            command.setInt(2, movie.getReleaseYear());
            command.setInt(3, movie.getDuration());
            command.setString(4, movie.getAgeRating());
            command.setString(5, movie.getTrailerUrl());
            command.setString(6, movie.getImageUrl());
            command.setInt(7, id);

            int affectedRows = command.executeUpdate();

            if (affectedRows > 0) {
                hasWorked = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DBConnection.disconnect();
        }
        return hasWorked;
    }

    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList();
        String sql = "SELECT id,title,release_year,duration,age_rating,trailer_url,image_url FROM movies;";

        Connection connection = DBConnection.connect();
        try {
            PreparedStatement command = connection.prepareStatement(sql);
            ResultSet rs = command.executeQuery();

            while (rs.next()) {

                Movie current = new Movie();
                current.setId(rs.getInt("id"));
                current.setTitle(rs.getString("title"));
                current.setReleaseYear(rs.getInt("release_year"));
                current.setAgeRating(rs.getString("age_rating"));
                current.setDuration(rs.getInt("duration"));
                current.setImageUrl(rs.getString("image_url"));
                current.setTrailerUrl(rs.getString("trailer_url"));

                movies.add(current);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DBConnection.disconnect();
        }

        return movies;
    }

    public Movie getMovieById(int id) {
        Movie movie = null;
        String query = "SELECT id,title,release_year,duration,age_rating,trailer_url,image_url FROM movies WHERE id = ?;";

        Connection conexao = DBConnection.connect();
        try {
            PreparedStatement comando = conexao.prepareStatement(query);
            comando.setInt(1, id);
            ResultSet rs = comando.executeQuery();

            if (rs.next()) {

                movie = new Movie();
                movie.setId(rs.getInt("id"));
                movie.setTitle(rs.getString("title"));
                movie.setReleaseYear(rs.getInt("release_year"));
                movie.setAgeRating(rs.getString("age_rating"));
                movie.setDuration(rs.getInt("duration"));
                movie.setImageUrl(rs.getString("image_url"));
                movie.setTrailerUrl(rs.getString("trailer_url"));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DBConnection.disconnect();
        }

        return movie;
    }
}
