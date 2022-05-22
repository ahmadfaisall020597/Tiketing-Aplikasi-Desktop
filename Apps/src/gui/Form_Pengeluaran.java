/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ahmad Faisal
 */
public class Form_Pengeluaran extends javax.swing.JFrame {

    /**
     * Creates new form Form_Pengeluaran
     */
    public Form_Pengeluaran() {
        initComponents();
        getData();
        a.setText(Integer.toString(getSum()));
        this.setLocationRelativeTo(null);
    }
    private int getSum() {
        int jumlah = TabPengeluaran.getRowCount();
        int sum=0;
        for (int i = 0; i < jumlah; i++) {
        sum = sum+Integer.parseInt(TabPengeluaran.getValueAt(i,2).toString());
        }
        return sum;
    }
    public void getData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tanggal Pengeluaran");
        model.addColumn("Keterangan");
        model.addColumn("Total Pengeluaran");
        
        try {
            Statement stat = (Statement) koneksi.getKoneksi().createStatement();
            String sql = "Select * from pengeluaran";
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                model.addRow (new Object[] {
                res.getString(1),
                res.getString(2),
                res.getString(3)
                }); 
            } TabPengeluaran.setModel(model);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
                    
}
    }
        public void bersih(){
        tgl_pengeluaran.setDate(null);
        keterangan.setText("");
        pengeluaran.setText("");
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendarCombo2 = new org.freixas.jcalendar.JCalendarCombo();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        keterangan = new javax.swing.JTextArea();
        pengeluaran = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabPengeluaran = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        cmbbln = new com.toedter.calendar.JMonthChooser();
        tgl_pengeluaran = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Tanggal");

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel2.setText("FORM PENGELUARAN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Katerangan");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Total Pengeluaran");

        keterangan.setColumns(20);
        keterangan.setRows(5);
        jScrollPane1.setViewportView(keterangan);

        pengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengeluaranActionPerformed(evt);
            }
        });

        TabPengeluaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        TabPengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabPengeluaranMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabPengeluaran);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Rp.");

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Save_20px.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Maintenance_20px.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Broom_20px.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Trash_Can_20px.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Search_20px.png"))); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Print_20px.png"))); // NOI18N
        jButton5.setText("PRINT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Enter_20px.png"))); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total Pengeluaran / Bulan      Rp. :");

        a.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a.setText("TOTAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Save))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tgl_pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(2, 2, 2)))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(a)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbln, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(22, 22, 22)
                        .addComponent(jButton6)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbbln, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tgl_pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Save)
                            .addComponent(btnedit)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(21, 21, 21)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(a))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        String tampilan="yyyy-MM-dd";
        SimpleDateFormat fm=new SimpleDateFormat(tampilan);
        String Tanggal=String.valueOf(fm.format(tgl_pengeluaran.getDate()));
        String Keterangan = keterangan.getText();
        String Total = pengeluaran.getText();

    try{
        Statement statement = (Statement) koneksi.getKoneksi().createStatement();
        statement.executeUpdate("insert into pengeluaran VALUES ('" + Tanggal + "','" + Keterangan +"','"+ Total +"');");
        statement.close();
        JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        getData();
        bersih();
    }catch (Exception t){
        JOptionPane.showMessageDialog(null, t);
    }
    }//GEN-LAST:event_SaveActionPerformed

    private void pengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengeluaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pengeluaranActionPerformed

    private void TabPengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabPengeluaranMouseClicked
        // TODO add your handling code here:
        try {
        int table=TabPengeluaran.getSelectedRow();
            java.util.Date a= new SimpleDateFormat("yyyy-MM-dd").parse((String)TabPengeluaran.getValueAt(table, 0).toString());
            String b=TabPengeluaran.getValueAt(table, 1).toString();
            String c=TabPengeluaran.getValueAt(table, 2).toString();
            
            tgl_pengeluaran.setDate(a);
            keterangan.setText(b);
            pengeluaran.setText(c);
        } catch (ParseException ex) {
            Logger.getLogger(Form_Pengeluaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TabPengeluaranMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            HashMap param = new HashMap(1);
            InputStream url=getClass().getResourceAsStream("/iReport/rptpengeluaran.jrxml");
            JasperDesign jdes=JRXmlLoader.load(url);
            java.util.Locale lok= new Locale ("id","ID");
            param.put("bln",(cmbbln.getMonth()+1));
            param.put(JRParameter.REPORT_LOCALE, lok);
            JasperReport jrp = JasperCompileManager.compileReport(jdes);
            JasperPrint jprint = JasperFillManager.fillReport(jrp, param, koneksi.getKoneksi());
            JasperViewer.viewReport(jprint, false);
            this.dispose();
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e);  
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        String tampilan="yyyy-MM-dd";
        SimpleDateFormat fm=new SimpleDateFormat(tampilan);
        String Tanggal=String.valueOf(fm.format(tgl_pengeluaran.getDate()));
           if(btnedit.getText() == "edit"){
        }else{
            String Keterangan = keterangan.getText();
            String Total = pengeluaran.getText();
            
        try{
            Statement statement = (Statement) koneksi.getKoneksi().createStatement();
            String sql= "update pengeluaran SET Tanggal='"+Tanggal+"',"+"Keterangan='"+Keterangan+"',"+"Total='"+Total+"'"+"WHERE Tanggal = '" +Tanggal +"'";;
            statement.executeUpdate(sql);
             statement.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil diubah");
        }catch (Exception t){
            JOptionPane.showMessageDialog(null, "Data Gagal diubah");
        }
        getData();
        } 
    }//GEN-LAST:event_btneditActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
        String tampilan="yyyy-MM-dd";
        SimpleDateFormat fm=new SimpleDateFormat(tampilan);
        String tanggal=String.valueOf(fm.format(tgl_pengeluaran.getDate()));
        Statement statement = (Statement) koneksi.getKoneksi().createStatement();
        String sql = "delete from pengeluaran where Tanggal='"+tanggal+"'";
        statement.executeUpdate(sql);
        getData();
        bersih();
        JOptionPane.showMessageDialog(null,"Data berhasil di hapus");
        }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
 
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    int mnth=cmbbln.getMonth()+1;
        try
        {
            Statement statement = (Statement) koneksi.getKoneksi().createStatement();
            ResultSet rs = statement.executeQuery ("SELECT * FROM pengeluaran WHERE month(Tanggal)='"+mnth+"'");
            DefaultTableModel dtm = (DefaultTableModel) TabPengeluaran.getModel();
            dtm.setRowCount(0);
            String [] data = new String[3];
            int i = 1;
            while(rs.next())
            {
                data[0] = rs.getString("Tanggal");
                data[1] = rs.getString("Keterangan");
                data[2] = rs.getString("Total");
                dtm.addRow(data);
                i++;
            }
            rs.close();
            
            a.setText(Integer.toString(getSum()));
        }
        catch(Exception ex)  {
            JOptionPane.showMessageDialog(null,ex);
            System.err.println("error (search) : " +ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new MenuLaporan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Pengeluaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JTable TabPengeluaran;
    private javax.swing.JLabel a;
    private javax.swing.JButton btnedit;
    private com.toedter.calendar.JMonthChooser cmbbln;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private org.freixas.jcalendar.JCalendarCombo jCalendarCombo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea keterangan;
    private javax.swing.JTextField pengeluaran;
    private com.toedter.calendar.JDateChooser tgl_pengeluaran;
    // End of variables declaration//GEN-END:variables
}
