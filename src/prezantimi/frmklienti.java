/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prezantimi;

import data.vklienti;
import login.fprodukti;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.fklienti;

/**
 *
 * @author geraldo
 */
public class frmklienti extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmklienti
     */
    public frmklienti() {
        initComponents();
        moster("");
        inavantazh();
    }
private String accion = "ruaj";

    void fshehje_kolone() {
        listtabele.getColumnModel().getColumn(0).setMaxWidth(0);
        listtabele.getColumnModel().getColumn(0).setMinWidth(0);
        listtabele.getColumnModel().getColumn(0).setPreferredWidth(0);
    } void inavantazh() {
        txtidpersoni.setVisible(false);
        
        txtemri.setEnabled(false);
        txtatesia.setEnabled(false);
        txtmbiemri.setEnabled(false);
        cbotipi_dokumentit.setEnabled(false);
        txtnum_dokumentit.setEnabled(false);
        txtadresa.setEnabled(false);
        txttelefoni.setEnabled(false);
        txtemail.setEnabled(false);
        txtkodi_klientit.setEnabled(false);

        btnruaj.setEnabled(false);
        btnkancelo.setEnabled(false);
        btnelimino.setEnabled(false);
        txtidpersoni.setText("");
        txtemri.setText("");
        txtatesia.setText("");
        txtmbiemri.setText("");
        txtnum_dokumentit.setText("");
        txtadresa.setText("");
        txttelefoni.setText("");
        txtemail.setText("");
        txtkodi_klientit.setText("");
    }

    void avantazh() {
        txtidpersoni.setVisible(false);
        
        txtemri.setEnabled(true);
        txtatesia.setEnabled(true);
        txtmbiemri.setEnabled(true);
        cbotipi_dokumentit.setEnabled(true);
        txtnum_dokumentit.setEnabled(true);
        txtadresa.setEnabled(true);
        txttelefoni.setEnabled(true);
        txtemail.setEnabled(true);
        txtkodi_klientit.setEnabled(true);

        btnruaj.setEnabled(true);
        btnkancelo.setEnabled(true);
        btnelimino.setEnabled(true);
       
        txtemri.setText("");
        txtatesia.setText("");
        txtmbiemri.setText("");
        txtnum_dokumentit.setText("");
        txtadresa.setText("");
        txttelefoni.setText("");
        txtemail.setText("");
        txtkodi_klientit.setText("");
        

    }

    void moster(String kerko) {
        try {
            DefaultTableModel model;
            fklienti func = new fklienti();
            model = func.moster(kerko);

            listtabele.setModel(model);
            fshehje_kolone();
            lbltotalregjister.setText("Total Regjister " + Integer.toString(func.totalregjister));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtkerko = new javax.swing.JTextField();
        btnkerko = new javax.swing.JButton();
        btnelimino = new javax.swing.JButton();
        btnshtepi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listtabele = new javax.swing.JTable();
        lbltotalregjister = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtidpersoni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtemri = new javax.swing.JTextField();
        btne_re = new javax.swing.JButton();
        btnruaj = new javax.swing.JButton();
        btnkancelo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtatesia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmbiemri = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbotipi_dokumentit = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtnum_dokumentit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtadresa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttelefoni = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtkodi_klientit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista e klientit"));

        jLabel9.setText("Kerko");

        txtkerko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkerkoActionPerformed(evt);
            }
        });

        btnkerko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/kerko.png"))); // NOI18N
        btnkerko.setText("kerko");
        btnkerko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkerkoActionPerformed(evt);
            }
        });

        btnelimino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/elimino.png"))); // NOI18N
        btnelimino.setText("elimino");
        btnelimino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminoActionPerformed(evt);
            }
        });

        btnshtepi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/shtepi.gif"))); // NOI18N
        btnshtepi.setText("shtepi");
        btnshtepi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshtepiActionPerformed(evt);
            }
        });

        listtabele.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listtabele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listtabeleMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listtabele);

        lbltotalregjister.setText("Regjister");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(61, 61, 61)
                        .addComponent(txtkerko, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnkerko)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnelimino)
                        .addGap(18, 18, 18)
                        .addComponent(btnshtepi)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregjister)
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtkerko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkerko)
                    .addComponent(btnelimino)
                    .addComponent(btnshtepi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbltotalregjister)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Regjistri i klientit"));

        txtidpersoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpersoniActionPerformed(evt);
            }
        });

        jLabel2.setText("Emer:");

        txtemri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemriActionPerformed(evt);
            }
        });

        btne_re.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/e re.GIF"))); // NOI18N
        btne_re.setText("e re");
        btne_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btne_reActionPerformed(evt);
            }
        });

        btnruaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/ruaj.png"))); // NOI18N
        btnruaj.setText("ruaj");
        btnruaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnruajActionPerformed(evt);
            }
        });

        btnkancelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/kancelo.png"))); // NOI18N
        btnkancelo.setText("kancelo");
        btnkancelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkanceloActionPerformed(evt);
            }
        });

        jLabel3.setText("Atesia:");

        txtatesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtatesiaActionPerformed(evt);
            }
        });

        jLabel4.setText("Mbiemri:");

        txtmbiemri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmbiemriActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipi Dok:");

        cbotipi_dokumentit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DNI", "LM", "CE", "tjeter" }));
        cbotipi_dokumentit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipi_dokumentitActionPerformed(evt);
            }
        });

        jLabel6.setText("Num dok:");

        txtnum_dokumentit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum_dokumentitActionPerformed(evt);
            }
        });

        jLabel8.setText("Adresa:");

        txtadresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadresaActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefoni:");

        txttelefoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoniActionPerformed(evt);
            }
        });

        jLabel11.setText("Email:");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel12.setText("kodi:");

        txtkodi_klientit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodi_klientitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtemri, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btne_re)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(74, 74, 74)
                                .addComponent(txtatesia, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmbiemri)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtadresa, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtnum_dokumentit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbotipi_dokumentit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnruaj)
                        .addGap(66, 66, 66)
                        .addComponent(btnkancelo)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(72, 72, 72)
                                .addComponent(txttelefoni, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkodi_klientit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtidpersoni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtidpersoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtemri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtatesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmbiemri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbotipi_dokumentit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtnum_dokumentit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtadresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txttelefoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtkodi_klientit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btne_re)
                    .addComponent(btnruaj)
                    .addComponent(btnkancelo))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Klienti");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkerkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkerkoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkerkoActionPerformed

    private void btnkerkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkerkoActionPerformed
        // TODO add your handling code here:
        moster(txtkerko.getText());
    }//GEN-LAST:event_btnkerkoActionPerformed

    private void btneliminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminoActionPerformed
        // TODO add your handling code here:
        if (!txtidpersoni.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "ne qofte se doni ta eliminoni kete dhome?","konfirmoje",2);

            if (confirmacion==0) {
                fklienti func = new fklienti ();
                vklienti dts= new vklienti();

                dts.setIdpersoni(Integer.parseInt(txtidpersoni.getText()));
                func.elimino((vklienti) dts);
                moster("");
                inavantazh();

            }

        }
    }//GEN-LAST:event_btneliminoActionPerformed

    private void btnshtepiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshtepiActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_btnshtepiActionPerformed

    private void listtabeleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listtabeleMouseClicked
        // TODO add your handling code here:
        btnruaj.setText("shkruaje");
        avantazh();
        btnelimino.setEnabled(true);
        accion="shkruaje";

        int fila = listtabele.rowAtPoint(evt.getPoint());
      txtidpersoni.setText(listtabele.getValueAt(fila, 0).toString());
        txtemri.setText(listtabele.getValueAt(fila, 1).toString());
        txtatesia.setText(listtabele.getValueAt(fila, 2).toString());
        txtmbiemri.setText(listtabele.getValueAt(fila, 3).toString());
        cbotipi_dokumentit.setSelectedItem(listtabele.getValueAt(fila, 4).toString());
        txtnum_dokumentit.setText(listtabele.getValueAt(fila, 5).toString());

        txtadresa.setText(listtabele.getValueAt(fila, 6).toString());
        txttelefoni.setText(listtabele.getValueAt(fila, 7).toString());
        txtemail.setText(listtabele.getValueAt(fila, 8).toString());
        txtkodi_klientit.setText(listtabele.getValueAt(fila, 9).toString());


    }//GEN-LAST:event_listtabeleMouseClicked

    private void btnkanceloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkanceloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkanceloActionPerformed

    private void btnruajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnruajActionPerformed
        // TODO add your handling code here:
        if (txtemri.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Ju lutem jepni emrin e klientit");
            txtemri.requestFocus();
            return;

        }
       if (txtatesia.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "jepni atesin e klientit");
            txtatesia.requestFocus();
            return;
        }
         if (txtmbiemri.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "jepni mbiemrin e klientit");
            txtmbiemri.requestFocus();
            return;
        }
        

        if (txtnum_dokumentit.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "jepni numrin e dokumentit te klientit");
            txtnum_dokumentit.requestFocus();
            return;
        }
        
        if (txtkodi_klientit.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "jepni kodin e klientit");
            txtkodi_klientit.requestFocus();
            return;
        }
      

        vklienti dts = new vklienti();
        fklienti func = new fklienti();

        dts.setEmri(txtemri.getText());

        
        dts.setMbiemri(txtmbiemri.getText());
        dts.setAtesia(txtatesia.getText());
        
        int seleccionado = cbotipi_dokumentit.getSelectedIndex();
        dts.setTipi_dokumentit((String) cbotipi_dokumentit.getItemAt(seleccionado));
        dts.setNum_dokumentit(txtnum_dokumentit.getText());
        dts.setAdresa(txtadresa.getText());
        dts.setTelefoni(txttelefoni.getText());
        dts.setEmail(txtemail.getText());
        dts.setKodi_klientit(txtkodi_klientit.getText());
       
        if (accion.equals("ruaj")) {
            if (func.shto(dts)) {
                JOptionPane.showMessageDialog(rootPane, "klienti u regjistrua me sukses");
                moster("");
                inavantazh();

            }

        }
        else if (accion.equals("shkruaj")){
            dts.setIdpersoni(Integer.parseInt(txtidpersoni.getText()));

            if (func.shkruaj(dts)) {
                JOptionPane.showMessageDialog(rootPane, "klienti u shkrua me sukses");
                moster("");
                inavantazh();
            }
        }
    }//GEN-LAST:event_btnruajActionPerformed

    private void btne_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btne_reActionPerformed
        // TODO add your handling code here:
        avantazh();
        btnruaj.setText("ruaj");
        accion = "ruaj";
    }//GEN-LAST:event_btne_reActionPerformed

    private void txtemriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemriActionPerformed
        // TODO add your handling code here:
        txtemri.transferFocus();
    }//GEN-LAST:event_txtemriActionPerformed

    private void txtatesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtatesiaActionPerformed
        // TODO add your handling code here:
        txtatesia.transferFocus();
    }//GEN-LAST:event_txtatesiaActionPerformed

    private void txtmbiemriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmbiemriActionPerformed
        // TODO add your handling code here:
        txtmbiemri.transferFocus();
    }//GEN-LAST:event_txtmbiemriActionPerformed

    private void cbotipi_dokumentitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipi_dokumentitActionPerformed
        // TODO add your handling code here:
        cbotipi_dokumentit.transferFocus();
    }//GEN-LAST:event_cbotipi_dokumentitActionPerformed

    private void txtnum_dokumentitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum_dokumentitActionPerformed
        // TODO add your handling code here:
        txtnum_dokumentit.transferFocus();
    }//GEN-LAST:event_txtnum_dokumentitActionPerformed

    private void txtadresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadresaActionPerformed
        // TODO add your handling code here:
        txtadresa.transferFocus();
    }//GEN-LAST:event_txtadresaActionPerformed

    private void txttelefoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoniActionPerformed
        // TODO add your handling code here:
        txttelefoni.transferFocus();
    }//GEN-LAST:event_txttelefoniActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
        txtemail.transferFocus();
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtkodi_klientitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodi_klientitActionPerformed
        // TODO add your handling code here:
        txtkodi_klientit.transferFocus();
    }//GEN-LAST:event_txtkodi_klientitActionPerformed

    private void txtidpersoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpersoniActionPerformed
        // TODO add your handling code here:
        txtidpersoni.transferFocus();
    }//GEN-LAST:event_txtidpersoniActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmklienti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmklienti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmklienti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmklienti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmklienti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btne_re;
    private javax.swing.JButton btnelimino;
    private javax.swing.JButton btnkancelo;
    private javax.swing.JButton btnkerko;
    private javax.swing.JButton btnruaj;
    private javax.swing.JButton btnshtepi;
    private javax.swing.JComboBox cbotipi_dokumentit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbltotalregjister;
    private javax.swing.JTable listtabele;
    private javax.swing.JTextField txtadresa;
    private javax.swing.JTextField txtatesia;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtemri;
    private javax.swing.JTextField txtidpersoni;
    private javax.swing.JTextField txtkerko;
    private javax.swing.JTextField txtkodi_klientit;
    private javax.swing.JTextField txtmbiemri;
    private javax.swing.JTextField txtnum_dokumentit;
    private javax.swing.JTextField txttelefoni;
    // End of variables declaration//GEN-END:variables
}