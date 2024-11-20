package br.com.movies.ui;

import br.com.movies.dao.MovieDAO;
import br.com.movies.domain.Movie;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author 2112605
 */
public class Teste {

    public static void main(String[] args) {
//        MovieDAO dao = new MovieDAO();

        JFrame frame = new JFrame("Tela de Filmes");

        Screen screen = new Screen();
        frame.setContentPane(screen);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(960, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        Movie newMovie = new Movie(80, "Matrix", 2002, "E", "https://url.com/", "https://url.com/");
//
//        dao.add(newMovie);
//        dao.delete(3);
//        Movie newMovie = new Movie(70, "Matrix", 2002, "E", "https://url.com/", "https://url.com/");
//        dao.update(newMovie, 2);
//        List<Movie> movies = dao.getMovies();
//        
//        for (Movie movy : movies) {
//            System.out.println(movy.getTitle());
//        }

//        Movie movie = dao.getMovieById(2);
//        System.out.println(movie.getTitle());
    }
}
