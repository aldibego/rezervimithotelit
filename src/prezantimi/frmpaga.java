/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prezantimi;

import data.vdhoma;
import data.vpaga;
import data.vrezervimi;
import login.fkonsumatori;
import login.fdhoma;
import login.fpaga;
import login.fprodukti;
import  login.frezervimi;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @autor geraldo ;
 */
public class frmpaga extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmpaga
     */
    public frmpaga() {
        initComponents();
        moster(idrezervimi);
        inavantazh();
        txtidrezervimi.setText(idrezervimi);
        txtklienti.setText(klienti);
        txtdhoma.setText(dhoma);
        txtiddhoma.setText(iddhoma);
        txttotalrezervimi.setText(Double.toString(totalrezervimi));
        
        fkonsumatori func = new fkonsumatori();
        func.moster(idrezervimi);
        
        txtpagaa_totale.setText(Double.toString(totalrezervimi + func.totalkonsumatori));
        
        
    }
    
    private String accion = "ruaj";
    public static String idrezervimi;
    public static String klienti;
    public static String iddhoma;
    public static String dhoma;
    public static Double totalrezervimi;
    

    void ocultar_columnas() {
        listtabele.getColumnModel().getColumn(0).setMaxWidth(0);
        listtabele.getColumnModel().getColumn(0).setMinWidth(0);
        listtabele.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        listtabele.getColumnModel().getColumn(1).setMaxWidth(0);
        listtabele.getColumnModel().getColumn(1).setMinWidth(0);
        listtabele.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    void ocultar_columnasconsumo() {
        listtabelekonsumatori.getColumnModel().getColumn(0).setMaxWidth(0);
        listtabelekonsumatori.getColumnModel().getColumn(0).setMinWidth(0);
        listtabelekonsumatori.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        listtabelekonsumatori.getColumnModel().getColumn(1).setMaxWidth(0);
        listtabelekonsumatori.getColumnModel().getColumn(1).setMinWidth(0);
        listtabelekonsumatori.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        listtabelekonsumatori.getColumnModel().getColumn(2).setMaxWidth(0);
        listtabelekonsumatori.getColumnModel().getColumn(2).setMinWidth(0);
        listtabelekonsumatori.getColumnModel().getColumn(2).setPreferredWidth(0);
    }
    
    
    
    void inavantazh() {
        txtidpaga.setVisible(false);
        
        txtidrezervimi.setVisible(false);
        txtklienti.setEnabled(false);
        txtnum_kuponit.setEnabled(false);
        cbotipi_kuponit.setEnabled(false);
        txtigv.setEnabled(false);
        txtpagaa_totale.setEnabled(false);
        txttotalrezervimi.setEnabled(false);
        dcdat_leshimi.setEnabled(false);
        dcdat_pagese.setEnabled(false);
        
        txtiddhoma.setVisible(false);
        txtdhoma.setEnabled(false);
         
        btnruaj.setEnabled(false);
        btnkancelo.setEnabled(false);
        btnelimino.setEnabled(false);
        txtidpaga.setText("");
        txtnum_kuponit.setText("");
        txtigv.setText("");
        txtpagaa_totale.setText("");

    }

    void avantazh() {
        txtidpaga.setVisible(false);
        
        txtidrezervimi.setVisible(true);
        txtklienti.setEnabled(true);
        txtnum_kuponit.setEnabled(true);
        cbotipi_kuponit.setEnabled(true);
        txtigv.setEnabled(true);
        txtpagaa_totale.setEnabled(true);
        txttotalrezervimi.setEnabled(true);
        dcdat_leshimi.setEnabled(true);
        dcdat_pagese.setEnabled(true);
        
        txtiddhoma.setVisible(true);
        txtdhoma.setEnabled(true);
         
        btnruaj.setEnabled(true);
        btnkancelo.setEnabled(true);
        btnelimino.setEnabled(true);
        txtidpaga.setText("");
        txtnum_kuponit.setText("");
        txtigv.setText("");
        //txttotal_pago.setText("");

    }

    void moster(String kerko) {
        try {
            DefaultTableModel model;
            fpaga func = new fpaga();
            model = func.moster(kerko);

            listtabele.setModel(model);
            ocultar_columnas();
            lbltotalregjister.setText("paga totale " + Integer.toString(func.totalregjister));
            
            //Mostrar los datos de los consumos
            fkonsumatori func2 = new fkonsumatori();
            model= func2.moster(kerko);
            listtabelekonsumatori.setModel(model);
            ocultar_columnasconsumo();
            
            lbltotalregjisterkonsumatori.setText("konsumi total " + func2.totalregjister);
            lbltotalkonsumatori.setText("konsumi total: $." + func2.totalkonsumatori );
            

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

        txttotal_reserva = new javax.swing.JPanel();
        txtidpaga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidrezervimi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnum_kuponit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbotipi_kuponit = new javax.swing.JComboBox();
        btne_re = new javax.swing.JButton();
        btnruaj = new javax.swing.JButton();
        btnkancelo = new javax.swing.JButton();
        txtklienti = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttotalrezervimi = new javax.swing.JTextField();
        txtiddhoma = new javax.swing.JTextField();
        txtdhoma = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtigv = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtpagaa_totale = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dcdat_leshimi = new com.toedter.calendar.JDateChooser();
        dcdat_pagese = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listtabele = new javax.swing.JTable();
        btnelimino = new javax.swing.JButton();
        btnshtepi = new javax.swing.JButton();
        lbltotalregjister = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listtabelekonsumatori = new javax.swing.JTable();
        lbltotalregjisterkonsumatori = new javax.swing.JLabel();
        lbltotalkonsumatori = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txttotal_reserva.setBackground(new java.awt.Color(255, 204, 102));
        txttotal_reserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Regjistri i pages"));

        jLabel2.setText("Rezervimi:");

        txtidrezervimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidrezervimiActionPerformed(evt);
            }
        });

        jLabel4.setText("Dhoma:");

        jLabel6.setText("Num Comprobante:");

        txtnum_kuponit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum_kuponitActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipi kuponit:");

        cbotipi_kuponit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "shkruajtur me dore", "Faturuar", "me kesh", "tjeter" }));
        cbotipi_kuponit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipi_kuponitActionPerformed(evt);
            }
        });

        btne_re.setBackground(new java.awt.Color(51, 51, 51));
        btne_re.setForeground(new java.awt.Color(255, 255, 255));
        btne_re.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/e re.GIF"))); // NOI18N
        btne_re.setText("e re");
        btne_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btne_reActionPerformed(evt);
            }
        });

        btnruaj.setBackground(new java.awt.Color(51, 51, 51));
        btnruaj.setForeground(new java.awt.Color(255, 255, 255));
        btnruaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/ruaj.png"))); // NOI18N
        btnruaj.setText("ruaj");
        btnruaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnruajActionPerformed(evt);
            }
        });

        btnkancelo.setBackground(new java.awt.Color(51, 51, 51));
        btnkancelo.setForeground(new java.awt.Color(255, 255, 255));
        btnkancelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/kancelo.png"))); // NOI18N
        btnkancelo.setText("kancelo");
        btnkancelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkanceloActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Rezervimi:");

        txtiddhoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiddhomaActionPerformed(evt);
            }
        });

        jLabel8.setText("Igv:");

        txtigv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtigvActionPerformed(evt);
            }
        });

        jLabel10.setText("Total Pago:");

        txtpagaa_totale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpagaa_totaleActionPerformed(evt);
            }
        });

        jLabel5.setText("Dat leshimi:");

        jLabel11.setText("Dat pagese:");

        javax.swing.GroupLayout txttotal_reservaLayout = new javax.swing.GroupLayout(txttotal_reserva);
        txttotal_reserva.setLayout(txttotal_reservaLayout);
        txttotal_reservaLayout.setHorizontalGroup(
            txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txttotal_reservaLayout.createSequentialGroup()
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtidpaga, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txttotal_reservaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                    .addComponent(btne_re)
                                    .addGap(42, 42, 42)
                                    .addComponent(btnruaj)
                                    .addGap(58, 58, 58)
                                    .addComponent(btnkancelo))
                                .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbotipi_kuponit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3)
                                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnum_kuponit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtpagaa_totale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(txttotal_reservaLayout.createSequentialGroup()
                                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dcdat_leshimi, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(dcdat_pagese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(99, 99, 99)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(101, 101, 101))
            .addGroup(txttotal_reservaLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                        .addComponent(txtidrezervimi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtklienti, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txttotalrezervimi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(txttotal_reservaLayout.createSequentialGroup()
                        .addComponent(txtiddhoma, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdhoma, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txttotal_reservaLayout.setVerticalGroup(
            txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txttotal_reservaLayout.createSequentialGroup()
                .addComponent(txtidpaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidrezervimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtklienti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttotalrezervimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtiddhoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtdhoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbotipi_kuponit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnum_kuponit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtpagaa_totale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dcdat_leshimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(dcdat_pagese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(txttotal_reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btne_re)
                    .addComponent(btnruaj)
                    .addComponent(btnkancelo))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Paga");

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista e pages"));

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

        btnelimino.setBackground(new java.awt.Color(51, 51, 51));
        btnelimino.setForeground(new java.awt.Color(255, 255, 255));
        btnelimino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/elimino.png"))); // NOI18N
        btnelimino.setText("elimino");
        btnelimino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminoActionPerformed(evt);
            }
        });

        btnshtepi.setBackground(new java.awt.Color(51, 51, 51));
        btnshtepi.setForeground(new java.awt.Color(255, 255, 255));
        btnshtepi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file/shtepi.gif"))); // NOI18N
        btnshtepi.setText("shtepi");
        btnshtepi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshtepiActionPerformed(evt);
            }
        });

        lbltotalregjister.setText("Regjister");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbltotalregjister, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnelimino)
                                .addGap(18, 18, 18)
                                .addComponent(btnshtepi)))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnelimino)
                    .addComponent(btnshtepi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(lbltotalregjister))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista e konsumatorit"));

        listtabelekonsumatori.setModel(new javax.swing.table.DefaultTableModel(
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
        listtabelekonsumatori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listtabelekonsumatoriMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listtabelekonsumatori);

        lbltotalregjisterkonsumatori.setText("Regjister");

        lbltotalkonsumatori.setText("jLabel12");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbltotalkonsumatori)
                        .addGap(48, 48, 48)
                        .addComponent(lbltotalregjisterkonsumatori, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalregjisterkonsumatori)
                    .addComponent(lbltotalkonsumatori)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttotal_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txttotal_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidrezervimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidrezervimiActionPerformed
        // TODO add your handling code here:
        txtidrezervimi.transferFocus();
    }//GEN-LAST:event_txtidrezervimiActionPerformed

    private void txtnum_kuponitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum_kuponitActionPerformed
        // TODO add your handling code here:
        txtnum_kuponit.transferFocus();
    }//GEN-LAST:event_txtnum_kuponitActionPerformed

    private void cbotipi_kuponitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipi_kuponitActionPerformed
        // TODO add your handling code here:
        cbotipi_kuponit.transferFocus();
    }//GEN-LAST:event_cbotipi_kuponitActionPerformed

    private void btne_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btne_reActionPerformed
        // TODO add your handling code here:
        avantazh();
        btnruaj.setText("ruaj");
        accion = "ruaj";
    }//GEN-LAST:event_btne_reActionPerformed

    private void btnruajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnruajActionPerformed
        // TODO add your handling code here:
        if (txtigv.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "jepni ivg e pageses");
            txtigv.requestFocus();
            return;
        }
        if (txtpagaa_totale.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "jepni pagesen totale");
            txtpagaa_totale.requestFocus();
            return;
        }

        if (txtnum_kuponit.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "jepni numrin e kuponit te pages");
            txtnum_kuponit.requestFocus();
            return;
        }

        vpaga dts = new vpaga();
        fpaga func = new fpaga();

        dts.setIdrezervimi(Integer.parseInt(txtidrezervimi.getText()));


        int seleccionado = cbotipi_kuponit.getSelectedIndex();
        dts.setTipi_kuponit((String) cbotipi_kuponit.getItemAt(seleccionado));
        
        dts.setNum_kuponit(txtnum_kuponit.getText());
        dts.setIgv(Double.parseDouble(txtigv.getText()));
        dts.setPagaa_totale(Double.parseDouble(txtpagaa_totale.getText()));
        
        Calendar cal;
        int d,m,a;
        
        cal=dcdat_pagese.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR) - 1900;
        
        dts.setDat_pagese(new Date (a,m,d));
        
        
        cal=dcdat_leshimi.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR) - 1900;
        
        dts.setDat_leshimi(new Date (a,m,d));
        
        
        

        if (accion.equals("ruaj")) {
            if (func.shto(dts)) {
                JOptionPane.showMessageDialog(rootPane, " paga $. " + txtpagaa_totale.getText() + 
                        " del Sr. " + txtklienti.getText() + " e realizuar");
                moster(idrezervimi);
                inavantazh();
                
                //Desocupar la Habitación
                fdhoma func2 = new fdhoma();
                vdhoma dts2 = new vdhoma();
                
                dts2.setIddhoma(Integer.parseInt(txtiddhoma.getText()));
                func2.joezene(dts2);
                
                //Cancelar o pagar la reserva
                
                frezervimi func3 = new frezervimi();
                vrezervimi dts3 = new vrezervimi();
                
                dts3.setIdrezervimi(Integer.parseInt(txtidrezervimi.getText()));
                func3.pagesa(dts3);
                
            }

        }
        else if (accion.equals("shkruaj")){
            dts.setIdpaga(Integer.parseInt(txtidpaga.getText()));

            if (func.shkruaj(dts)) {
                JOptionPane.showMessageDialog(rootPane, "paga e Sr. " + 
                        txtklienti.getText() + " klienti eshte modifikuar me sukses");
                moster(idrezervimi);
                inavantazh();
            }
        }
    }//GEN-LAST:event_btnruajActionPerformed

    private void btnkanceloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkanceloActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnkanceloActionPerformed

    private void listtabeleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listtabeleMouseClicked
        // TODO add your handling code here:
        btnruaj.setText("shkruaj");
        avantazh();
        btnelimino.setEnabled(true);
        accion="shkruaj";

        int fila = listtabele.rowAtPoint(evt.getPoint());

        txtidpaga.setText(listtabele.getValueAt(fila, 0).toString());
        //txtidreserva.setText(tablalistado.getValueAt(fila, 1).toString());
        
        cbotipi_kuponit.setSelectedItem(listtabele.getValueAt(fila, 2).toString());
        txtnum_kuponit.setText(listtabele.getValueAt(fila, 3).toString());
        txtigv.setText(listtabele.getValueAt(fila, 4).toString());
        txtpagaa_totale.setText(listtabele.getValueAt(fila, 5).toString());
        
        dcdat_leshimi.setDate(Date.valueOf(listtabele.getValueAt(fila, 6).toString()));
        dcdat_pagese.setDate(Date.valueOf(listtabele.getValueAt(fila, 7).toString()));
       

    }//GEN-LAST:event_listtabeleMouseClicked

    private void btneliminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminoActionPerformed
        // TODO add your handling code here:
        if (!txtidpaga.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "a je i sigurt se do te fshish pagesen e seleksionuar?","konfirmo",2);

            if (confirmacion==0) {
                fpaga func = new fpaga ();
                vpaga dts= new vpaga();

                dts.setIdpaga(Integer.parseInt(txtidpaga.getText()));
                func.elimino(dts);
                moster(idrezervimi);
                inavantazh();

            }

        }
    }//GEN-LAST:event_btneliminoActionPerformed

    private void btnshtepiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshtepiActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnshtepiActionPerformed

    private void txtiddhomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiddhomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiddhomaActionPerformed

    private void txtigvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtigvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtigvActionPerformed

    private void txtpagaa_totaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpagaa_totaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpagaa_totaleActionPerformed

    private void listtabelekonsumatoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listtabelekonsumatoriMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listtabelekonsumatoriMouseClicked

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
            java.util.logging.Logger.getLogger(frmpaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmpaga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btne_re;
    private javax.swing.JButton btnelimino;
    private javax.swing.JButton btnkancelo;
    private javax.swing.JButton btnruaj;
    private javax.swing.JButton btnshtepi;
    private javax.swing.JComboBox cbotipi_kuponit;
    private com.toedter.calendar.JDateChooser dcdat_leshimi;
    private com.toedter.calendar.JDateChooser dcdat_pagese;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbltotalkonsumatori;
    private javax.swing.JLabel lbltotalregjister;
    private javax.swing.JLabel lbltotalregjisterkonsumatori;
    private javax.swing.JTable listtabele;
    private javax.swing.JTable listtabelekonsumatori;
    private javax.swing.JTextField txtdhoma;
    private javax.swing.JTextField txtiddhoma;
    private javax.swing.JTextField txtidpaga;
    private javax.swing.JTextField txtidrezervimi;
    private javax.swing.JTextField txtigv;
    private javax.swing.JTextField txtklienti;
    private javax.swing.JTextField txtnum_kuponit;
    private javax.swing.JTextField txtpagaa_totale;
    private javax.swing.JPanel txttotal_reserva;
    private javax.swing.JTextField txttotalrezervimi;
    // End of variables declaration//GEN-END:variables
}
