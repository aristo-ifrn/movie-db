package br.com.movies.ui;

import br.com.movies.dao.MovieDAO;
import br.com.movies.domain.Movie;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe de teste para inicializar a interface gráfica do sistema de filmes.
 */
public class Teste {

    public static void main(String[] args) {
        try {
            JFrame frame = new JFrame("Tela de Filmes");

            Screen screen = new Screen();
            frame.setContentPane(screen);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(960, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inicializar a interface: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
