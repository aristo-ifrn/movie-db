/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.movies.ui;

import br.com.movies.dao.MovieDAO;
import br.com.movies.domain.Movie;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author arist
 */
public final class Screen extends javax.swing.JPanel {

    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();
        loadTable();
        customizeTableAlignment();
    }

    public void customizeTableAlignment() {
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);

        TableColumnModel columnModel = table.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            columnModel.getColumn(i).setCellRenderer(leftRenderer);
        }
    }

    public void loadAllDataIntoTable(List<Movie> movies) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();

        dtm.setRowCount(0);

        for (Movie movie : movies) {
            ArrayList<Object> rowData = new ArrayList<>();
            rowData.add(movie.getId());
            rowData.add(movie.getTitle());
            rowData.add(movie.getDuration() + " minutos");
            rowData.add(movie.getAgeRating());

            dtm.addRow(rowData.toArray());
        }
    }

    public void loadTable() {
        MovieDAO dao = new MovieDAO();

        List<Movie> movies = dao.getMovies();
        loadAllDataIntoTable(movies);
    }

    public Movie returnDataToTextFields(int id) {
        Movie movie = null;

        try {
            MovieDAO dao = new MovieDAO();
            movie = dao.getMovieById(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }

        return movie;
    }

    public void clearFields() {
        id = 0;
        title.setText("");
        release.setText("");
        rating.setSelectedIndex(1);
        duration.setText("");
        trailer.setText("");
        image.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        release = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rating = new javax.swing.JComboBox<>();
        trailer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        image = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel2.setText("Filmes");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 26, 90, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setText("Adicione um novo filme");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 62, -1, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel4.setLabelFor(title);
        jLabel4.setText("Título");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 108, -1, -1));

        title.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        title.setToolTipText("");
        title.setAutoscrolls(false);
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 129, 346, 29));

        release.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        release.setToolTipText("");
        release.setAutoscrolls(false);
        release.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releaseActionPerformed(evt);
            }
        });
        add(release, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 185, 167, 29));

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel5.setLabelFor(release);
        jLabel5.setText("Lançamento");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 164, -1, -1));

        duration.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        duration.setToolTipText("");
        duration.setAutoscrolls(false);
        duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationActionPerformed(evt);
            }
        });
        add(duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 185, 167, 29));

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel6.setLabelFor(duration);
        jLabel6.setText("Duração");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 164, -1, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel7.setLabelFor(rating);
        jLabel7.setText("Classificação");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 214, -1, -1));

        rating.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        rating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre (L)", "10 anos", "12 anos", "14 anos", "16 anos", "18 anos" }));
        rating.setOpaque(true);
        rating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingActionPerformed(evt);
            }
        });
        add(rating, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 235, 167, 31));

        trailer.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        trailer.setToolTipText("");
        trailer.setAutoscrolls(false);
        trailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trailerActionPerformed(evt);
            }
        });
        add(trailer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 237, 167, 29));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel8.setLabelFor(trailer);
        jLabel8.setText("Trailer URL");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 216, -1, -1));

        image.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        image.setToolTipText("");
        image.setAutoscrolls(false);
        image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageActionPerformed(evt);
            }
        });
        add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 293, 346, 29));

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel9.setLabelFor(image);
        jLabel9.setText("Imagem URL");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 272, -1, -1));

        Update.setBackground(new java.awt.Color(19, 20, 22));
        Update.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Atualizar");
        Update.setFocusable(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 334, 167, 32));

        table.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(13, 14, 15));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Título", "Duração", "Classificação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setToolTipText("");
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setIntercellSpacing(new java.awt.Dimension(6, 6));
        table.setName(""); // NOI18N
        table.setRequestFocusEnabled(false);
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.setUpdateSelectionOnSort(false);
        table.setVerifyInputWhenFocusTarget(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 108, 484, -1));

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel10.setText("Filmes já adicionados");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 62, -1, -1));

        Clear.setBackground(new java.awt.Color(19, 20, 22));
        Clear.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Limpar");
        Clear.setFocusable(false);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 167, 32));

        Add.setBackground(new java.awt.Color(19, 20, 22));
        Add.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Adicionar");
        Add.setFocusable(false);
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 334, 167, 32));

        Delete.setBackground(new java.awt.Color(19, 20, 22));
        Delete.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Deletar");
        Delete.setFocusable(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 167, 32));
    }// </editor-fold>//GEN-END:initComponents

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void releaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_releaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_releaseActionPerformed

    private void durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationActionPerformed

    private void trailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trailerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trailerActionPerformed

    private void imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imageActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String movieTitle = title.getText().trim();
        int movieRelease = Integer.parseInt(release.getText().trim());
        int movieDuration = Integer.parseInt(duration.getText().trim());
        String movieRating = (String) rating.getSelectedItem();
        String movieTrailer = trailer.getText().trim();
        String movieImage = image.getText().trim();

        if (movieTitle.isEmpty() || String.valueOf(movieRelease).trim().isEmpty() || String.valueOf(movieDuration).trim().isEmpty() || movieRating.isEmpty() || movieTrailer.isEmpty() || movieImage.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Movie movie = new Movie(movieDuration, movieTitle, movieRelease, movieRating, movieTrailer, movieImage);
        MovieDAO dao = new MovieDAO();

        dao.update(movie, id);
        loadTable();
    }//GEN-LAST:event_UpdateActionPerformed

    private void ratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        clearFields();
    }//GEN-LAST:event_ClearActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String movieTitle = title.getText().trim();
        String movieRelease = release.getText().trim();
        String movieDuration = duration.getText().trim();
        String movieRating = (String) rating.getSelectedItem();
        String movieTrailer = trailer.getText().trim();
        String movieImage = image.getText().trim();

        if (movieTitle.isEmpty() || movieRelease.isEmpty() || movieDuration.isEmpty() || movieRating.isEmpty() || movieTrailer.isEmpty() || movieImage.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {

            int durationValue = Integer.parseInt(movieDuration);

            Movie newMovie = new Movie();
            newMovie.setTitle(movieTitle);
            newMovie.setReleaseYear(Integer.parseInt(movieRelease));
            newMovie.setDuration(durationValue);
            newMovie.setAgeRating(movieRating);
            newMovie.setTrailerUrl(movieTrailer);
            newMovie.setImageUrl(movieImage);

            MovieDAO dao = new MovieDAO();
            dao.add(newMovie);

            loadTable();
            clearFields();
            
            JOptionPane.showMessageDialog(this, "Filme adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A duração deve ser um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o filme: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        MovieDAO dao = new MovieDAO();

        dao.delete(id);
        clearFields();
        loadTable();
    }//GEN-LAST:event_DeleteActionPerformed
    int id = 0;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int selectedRow = table.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione algum filme para atualização");
        } else {
            id = (int) table.getValueAt(selectedRow, 0);
            Movie movie = returnDataToTextFields(id);

            title.setText(movie.getTitle());
            release.setText(String.valueOf(movie.getReleaseYear()));
            duration.setText(String.valueOf(movie.getDuration()));
            rating.setSelectedItem(movie.getAgeRating());
            trailer.setText(movie.getTrailerUrl());
            image.setText(movie.getImageUrl());
        }
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JTextField duration;
    private javax.swing.JTextField image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> rating;
    private javax.swing.JTextField release;
    private javax.swing.JTable table;
    private javax.swing.JTextField title;
    private javax.swing.JTextField trailer;
    // End of variables declaration//GEN-END:variables
}
