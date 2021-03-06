package forms;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import forms.LoginReg;

public class book2 extends javax.swing.JFrame {

        /** Creates new form book1 */
        public book2() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jTextField2 = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jTextField3 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();

                jTextField2.setForeground(new java.awt.Color(0, 0, 102));
                jTextField2.setText(" Novel, Fiction");
                jTextField2.setSize(250, 150);
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(157, 220, 255));
                setForeground(new java.awt.Color(204, 204, 255));

                jLabel1.setBackground(new java.awt.Color(204, 204, 255));

                jTextField1.setFont(new java.awt.Font("Apple Chancery", 1, 18)); // NOI18N
                jTextField1.setForeground(new java.awt.Color(0, 0, 153));
                jTextField1.setText("AND THE MOUNTAINS ECHOED");
                jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                                new java.awt.Color(51, 0, 204)));
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });
                jTextField3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField3ActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 0, 102));
                jLabel2.setText("GENRE");

                jLabel3.setText("<html><p>And the Mountains Echoed is the third novel by Afghan-American author Khaled Hosseini. Published in 2013 by Riverhead Books, it deviates from Hosseini's style in his first two works through his choice to avoid focusing on any one character.</p></html>");

                jLabel4.setFont(new java.awt.Font("Marker Felt", 1, 10)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(0, 0, 102));
                jLabel4.setText("<html><p>AUTHOR</p></html>");

                jLabel5.setText("KHALEED HOSSEINI");

                jLabel6.setFont(new java.awt.Font("Marker Felt", 1, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(0, 0, 102));
                jLabel6.setText("PUBLICATION YEAR:");

                jLabel7.setText("21 MAY 2013");

                jLabel8.setFont(new java.awt.Font("Marker Felt", 1, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(51, 0, 255));
                jLabel8.setText("ADD YOUR REVIEWS");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout
                                                .createSequentialGroup().addComponent(jTextField3).addContainerGap()));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE));

                jButton1.setFont(new java.awt.Font("Marker Felt", 1, 10)); // NOI18N
                jButton1.setForeground(new java.awt.Color(0, 0, 255));
                jButton1.setText("<html><p>CLICK TO SEE REVIEWS FOR THIS BOOK</p></html>");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                fileread(evt);

                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2).addComponent(
                                                                                                jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                48,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                257,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGap(8, 8, 8))))
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel7))
                                                                .addComponent(jLabel8,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                216,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                313,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                333,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2).addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                208,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel4).addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel6).addComponent(jLabel7))
                                                .addGap(51, 51, 51).addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap()));

                pack();
        }// </editor-fold>

        private void fileread(java.awt.event.ActionEvent evt) {
                final JTextArea edit = new JTextArea(30, 60);

                JButton read = new JButton("Read Review");
                read.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                try {
                                        FileReader reader = new FileReader("src/forms/BOOK2.txt");
                                        BufferedReader br = new BufferedReader(reader);
                                        edit.read(br, null);
                                        br.close();
                                        edit.requestFocus();
                                } catch (Exception e2) {
                                        System.out.println(e2);
                                }
                        }
                });

                JButton write = new JButton("Write Review");
                write.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                try {
                                        FileWriter writer = new FileWriter("src/forms/BOOK2.txt", true);
                                        BufferedWriter bw = new BufferedWriter(writer);

                                        bw.append(jTextField3.getText());
                                        Path path = Paths.get("src/forms/BOOK2.txt");
                                        Files.write(path, jTextField3.getText().getBytes(StandardCharsets.UTF_8),
                                                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);

                                        edit.requestFocus();
                                } catch (Exception e2) {
                                }
                        }
                });

                JFrame frame = new JFrame("Review");
                frame.getContentPane().add(new JScrollPane(edit), BorderLayout.NORTH);
                frame.getContentPane().add(read, BorderLayout.WEST);
                frame.getContentPane().add(write, BorderLayout.EAST);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
        }

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {

        }

        /**
         * @param args the command line arguments
         */

        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        // End of variables declaration

}