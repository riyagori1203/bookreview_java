package forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import forms.LoginReg;

public class Homepage extends javax.swing.JFrame {

        /**
         * Creates new form books
         */
        public Homepage() {
                initComponents();
                scaleImage();

        }

        public void scaleImage() {
                ImageIcon icon = new ImageIcon("src/forms/thousand_splendid.jpg");
                Image img = icon.getImage();
                Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(imgScale);
                jLabel1.setIcon(scaledIcon);

                ImageIcon icon1 = new ImageIcon("src/forms/and_the_mountains.jpg");
                Image img1 = icon1.getImage();
                Image imgScale1 = img1.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
                jLabel2.setIcon(scaledIcon1);

                ImageIcon icon2 = new ImageIcon("src/forms/giver_of_stars.jpg");
                Image img2 = icon2.getImage();
                Image imgScale2 = img2.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
                jLabel3.setIcon(scaledIcon2);

                ImageIcon icon3 = new ImageIcon("src/forms/kite_runner.jpg");
                Image img3 = icon3.getImage();
                Image imgScale3 = img3.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
                jLabel4.setIcon(scaledIcon3);

                ImageIcon icon4 = new ImageIcon("src/forms/GOT.jpg");
                Image img4 = icon4.getImage();
                Image imgScale4 = img4.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon4 = new ImageIcon(imgScale4);
                jLabel5.setIcon(scaledIcon4);

                ImageIcon icon5 = new ImageIcon("src/forms/gone_girl.jpg");
                Image img5 = icon5.getImage();
                Image imgScale5 = img5.getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon5 = new ImageIcon(imgScale5);
                jLabel11.setIcon(scaledIcon5);

                ImageIcon icon6 = new ImageIcon("src/forms/the_dutch_house.jpg");
                Image img6 = icon6.getImage();
                Image imgScale6 = img6.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon6 = new ImageIcon(imgScale6);
                jLabel6.setIcon(scaledIcon6);

                ImageIcon icon7 = new ImageIcon("src/forms/the_silent_patient.jpg");
                Image img7 = icon7.getImage();
                Image imgScale7 = img7.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon7 = new ImageIcon(imgScale7);
                jLabel7.setIcon(scaledIcon7);

                ImageIcon icon8 = new ImageIcon("src/forms/pride_and_prejudice.jpg");
                Image img8 = icon8.getImage();
                Image imgScale8 = img8.getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon8 = new ImageIcon(imgScale8);
                jLabel8.setIcon(scaledIcon8);

                ImageIcon icon9 = new ImageIcon("src/forms/krishna_key.jpg");
                Image img9 = icon9.getImage();
                Image imgScale9 = img9.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon9 = new ImageIcon(imgScale9);
                jLabel9.setIcon(scaledIcon9);

                ImageIcon icon10 = new ImageIcon("src/forms/me_before_you.jpg");
                Image img10 = icon10.getImage();
                Image imgScale10 = img10.getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(),
                                Image.SCALE_SMOOTH);
                ImageIcon scaledIcon10 = new ImageIcon(imgScale10);
                jLabel10.setIcon(scaledIcon10);

                ImageIcon icon11 = new ImageIcon("src/forms/where_the_crawdads.jpg");
                Image img11 = icon11.getImage();
                Image imgScale11 = img11.getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(),
                                Image.SCALE_SMOOTH);
                ImageIcon scaledIcon11 = new ImageIcon(imgScale11);
                jLabel12.setIcon(scaledIcon11);

        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jPanel4 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jPanel5 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jPanel6 = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                jPanel7 = new javax.swing.JPanel();
                jLabel7 = new javax.swing.JLabel();
                jPanel8 = new javax.swing.JPanel();
                jLabel8 = new javax.swing.JLabel();
                jPanel9 = new javax.swing.JPanel();
                jLabel9 = new javax.swing.JLabel();
                jPanel10 = new javax.swing.JPanel();
                jLabel10 = new javax.swing.JLabel();
                jPanel11 = new javax.swing.JPanel();
                jLabel11 = new javax.swing.JLabel();
                jPanel12 = new javax.swing.JPanel();
                jLabel12 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();
                jButton7 = new javax.swing.JButton();
                jButton8 = new javax.swing.JButton();
                jButton9 = new javax.swing.JButton();
                jButton10 = new javax.swing.JButton();
                jButton11 = new javax.swing.JButton();
                jButton12 = new javax.swing.JButton();
                textField1 = new java.awt.TextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setBackground(new java.awt.Color(255, 204, 204));
                setBackground(new java.awt.Color(0, 0, 0));

                jPanel1.setBackground(new java.awt.Color(255, 204, 204));
                jButton1.setBackground(new java.awt.Color(223, 18, 114));
                jButton2.setBackground(new java.awt.Color(223, 18, 114));
                jButton3.setBackground(new java.awt.Color(223, 18, 114));
                jButton4.setBackground(new java.awt.Color(223, 18, 114));
                jButton5.setBackground(new java.awt.Color(223, 18, 114));
                jButton6.setBackground(new java.awt.Color(223, 18, 114));
                jButton7.setBackground(new java.awt.Color(223, 18, 114));
                jButton8.setBackground(new java.awt.Color(223, 18, 114));
                jButton9.setBackground(new java.awt.Color(223, 18, 114));
                jButton10.setBackground(new java.awt.Color(223, 18, 114));
                jButton11.setBackground(new java.awt.Color(223, 18, 114));
                jButton12.setBackground(new java.awt.Color(223, 18, 114));
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton2.setForeground(new java.awt.Color(255, 255, 255));
                jButton3.setForeground(new java.awt.Color(255, 255, 255));
                jButton4.setForeground(new java.awt.Color(255, 255, 255));
                jButton5.setForeground(new java.awt.Color(255, 255, 255));
                jButton6.setForeground(new java.awt.Color(255, 255, 255));
                jButton7.setForeground(new java.awt.Color(255, 255, 255));
                jButton8.setForeground(new java.awt.Color(255, 255, 255));
                jButton9.setForeground(new java.awt.Color(255, 255, 255));
                jButton10.setForeground(new java.awt.Color(255, 255, 255));
                jButton11.setForeground(new java.awt.Color(255, 255, 255));
                jButton12.setForeground(new java.awt.Color(255, 255, 255));

                jLabel1.setText("");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel2.setBackground(new java.awt.Color(255, 204, 204));

                jLabel2.setText("");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel2Layout.setVerticalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel3.setBackground(new java.awt.Color(255, 204, 204));

                jLabel3.setText("");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(jPanel3Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3,
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel3Layout.setVerticalGroup(jPanel3Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel4.setBackground(new java.awt.Color(255, 204, 204));

                jLabel4.setText("");

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel4Layout.setVerticalGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel5.setBackground(new java.awt.Color(255, 204, 204));

                jLabel5.setText("");

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(jPanel5Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel5Layout.setVerticalGroup(jPanel5Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel6.setBackground(new java.awt.Color(255, 204, 204));

                jLabel6.setText("");

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(jPanel6Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel6Layout.setVerticalGroup(jPanel6Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel7.setBackground(new java.awt.Color(255, 204, 204));

                jLabel7.setText("");

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(jPanel7Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel7Layout.setVerticalGroup(jPanel7Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel8.setBackground(new java.awt.Color(255, 204, 204));

                jLabel8.setText("");

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(jPanel8Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel8,
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel8Layout.setVerticalGroup(jPanel8Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel8,
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel9.setBackground(new java.awt.Color(255, 204, 204));

                jLabel9.setText("");

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(jPanel9Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel9Layout.setVerticalGroup(jPanel9Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel10.setBackground(new java.awt.Color(255, 204, 204));

                jLabel10.setText("");

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(jPanel10Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel10Layout.setVerticalGroup(jPanel10Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel11.setBackground(new java.awt.Color(255, 204, 204));

                jLabel11.setText("");

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(jPanel11Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel11Layout.setVerticalGroup(jPanel11Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jPanel12.setBackground(new java.awt.Color(255, 204, 204));

                jLabel12.setText("");

                javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
                jPanel12.setLayout(jPanel12Layout);
                jPanel12Layout.setHorizontalGroup(jPanel12Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
                jPanel12Layout.setVerticalGroup(jPanel12Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));

                jButton1.setText("A THOUSAND SPLENDID SUNS");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book1handler(evt);

                        }
                });
                // NOI18N

                jButton2.setText("AND THE MOUNTAINS ECHOED");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book2handler(evt);

                        }
                });

                jButton3.setText("THE GIVER OF STARS");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book3handler(evt);

                        }
                });

                jButton4.setText("THE KITE RUNNER");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book4handler(evt);

                        }
                });

                jButton5.setText("GAME OF THRONES");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book5handler(evt);

                        }
                });

                jButton6.setText("GONE GIRL");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book6handler(evt);

                        }
                });

                jButton7.setText("THE DUTCH HOUSE");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book7handler(evt);

                        }
                });

                jButton8.setText("THE SILENT PATIENT");
                jButton8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book8handler(evt);

                        }
                });

                jButton9.setText("PRIDE AND PREJUDICE");
                jButton9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book9handler(evt);

                        }
                });

                jButton10.setText("THE KRISHNA KEY");
                jButton10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book10handler(evt);

                        }
                });

                jButton11.setText("ME BEFORE YOU");
                jButton11.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book11handler(evt);

                        }
                });

                jButton12.setText("WHERE THE CRAWDADS SING");
                jButton12.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                book12handler(evt);

                        }
                });

                textField1.setBackground(new java.awt.Color(165, 10, 10));
                textField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                textField1.setFont(new java.awt.Font("ComicSans", 3, 30)); // NOI18N
                textField1.setForeground(new java.awt.Color(255, 255, 255));
                textField1.setLocation(new java.awt.Point(-35000, -35000));
                textField1.setText("WELCOME TO GOODREADS! ");
                textField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                textField1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                .addComponent(jButton7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                1, Short.MAX_VALUE)
                                                                .addComponent(jPanel6,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jPanel7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(9, 9, 9)
                                                                                                .addComponent(jPanel8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(9, 9, 9))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jButton8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                92,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jButton9,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                94,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)))
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jButton10,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                1, Short.MAX_VALUE)
                                                                                .addComponent(jPanel9,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jButton11,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                1, Short.MAX_VALUE)
                                                                                .addComponent(jPanel10,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(10, 10, 10)
                                                                                                .addComponent(jPanel12,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jButton12,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                103,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                0, Short.MAX_VALUE)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                1, Short.MAX_VALUE)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jButton3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                1, Short.MAX_VALUE)
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addComponent(jButton4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                1, Short.MAX_VALUE)
                                                                                .addComponent(jPanel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jButton5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                1, Short.MAX_VALUE)
                                                                                .addComponent(jPanel5,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jPanel11,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton6)))
                                                .addGroup(layout.createSequentialGroup().addGap(50, 50, 50)
                                                                .addComponent(textField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                534,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(10, Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton1)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton2)
                                                                                .addComponent(jButton3)
                                                                                .addComponent(jButton4)
                                                                                .addComponent(jButton5)
                                                                                .addComponent(jButton6)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jPanel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jPanel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jPanel8,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jPanel9,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jPanel10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jPanel12,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton7).addComponent(jButton8)
                                                                .addComponent(jButton9).addComponent(jButton10)
                                                                .addComponent(jButton11).addComponent(jButton12))
                                                .addGap(39, 39, 39)
                                                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(23, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>

        private void book1handler(java.awt.event.ActionEvent evt) {
                new book1().setVisible(true);
                this.dispose();
        }

        private void book2handler(java.awt.event.ActionEvent evt) {
                new book2().setVisible(true);
                this.dispose();
        }

        private void book3handler(java.awt.event.ActionEvent evt) {
                new book3().setVisible(true);
                this.dispose();
        }

        private void book4handler(java.awt.event.ActionEvent evt) {
                new book4().setVisible(true);
                this.dispose();
        }

        private void book5handler(java.awt.event.ActionEvent evt) {
                new book5().setVisible(true);
                this.dispose();
        }

        private void book6handler(java.awt.event.ActionEvent evt) {
                new book6().setVisible(true);
                this.dispose();
        }

        private void book7handler(java.awt.event.ActionEvent evt) {
                new book7().setVisible(true);
                this.dispose();
        }

        private void book8handler(java.awt.event.ActionEvent evt) {
                new book8().setVisible(true);
                this.dispose();
        }

        private void book9handler(java.awt.event.ActionEvent evt) {
                new book9().setVisible(true);
                this.dispose();
        }

        private void book10handler(java.awt.event.ActionEvent evt) {
                new book10().setVisible(true);
                this.dispose();
        }

        private void book11handler(java.awt.event.ActionEvent evt) {
                new book11().setVisible(true);
                this.dispose();
        }

        private void book12handler(java.awt.event.ActionEvent evt) {
                new book12().setVisible(true);
                this.dispose();
        }

        private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        /**
         * @param args the command line arguments
         */

        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton11;
        private javax.swing.JButton jButton12;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JButton jButton9;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel12;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private java.awt.TextField textField1;
        // End of variables declaration
}