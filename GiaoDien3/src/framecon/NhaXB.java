/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framecon;

import DuLieu.DbUtils;
import DuLieu.NhaXuatBanData;
import DuLieu.Regex;
import Object.NhaXuatBan;
import giaodien.NewJFrame;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author trung
 */
public class NhaXB extends javax.swing.JPanel {

    /**
     * Creates new form nxb
     */
    NhaXuatBanData nxbdt = new NhaXuatBanData();

    public NhaXB() {
        initComponents();
        this.setBackground(Color.CYAN);
        CapNhat();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablenxb = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmanxb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttennxb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdiachinxb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsodienthoai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnxbemail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nhapnxb = new javax.swing.JButton();
        themnxb = new javax.swing.JButton();
        suanxb = new javax.swing.JButton();
        bt_xoanxb = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();

        tablenxb.setBackground(new java.awt.Color(255, 255, 153));
        tablenxb.setModel(new javax.swing.table.DefaultTableModel(
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
        tablenxb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablenxbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablenxb);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin"));

        jLabel1.setText("Mã NXB");

        jLabel2.setText("Tên NXB");

        jLabel3.setText("Địa Chỉ");

        jLabel4.setText("So Dien Thoai");

        jLabel5.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmanxb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txttennxb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txtnxbemail))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdiachinxb, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(txtsodienthoai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtmanxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(txtdiachinxb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txttennxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnxbemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Điều Khiển"));

        nhapnxb.setBackground(new java.awt.Color(0, 153, 153));
        nhapnxb.setIcon(new javax.swing.ImageIcon("E:\\imgg\\nhapnhaxuatban.png")); // NOI18N
        nhapnxb.setText("Nhập NXB");

        themnxb.setBackground(new java.awt.Color(0, 153, 153));
        themnxb.setIcon(new javax.swing.ImageIcon("E:\\imgg\\themnxb.png")); // NOI18N
        themnxb.setText("Thêm NXB");
        themnxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themnxbActionPerformed(evt);
            }
        });

        suanxb.setBackground(new java.awt.Color(0, 153, 153));
        suanxb.setIcon(new javax.swing.ImageIcon("E:\\imgg\\updatenxb.png")); // NOI18N
        suanxb.setText("Sửa NXB");
        suanxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suanxbActionPerformed(evt);
            }
        });

        bt_xoanxb.setBackground(new java.awt.Color(0, 153, 153));
        bt_xoanxb.setIcon(new javax.swing.ImageIcon("E:\\imgg\\xoanhaxuatban.png")); // NOI18N
        bt_xoanxb.setText("Xóa NXB");
        bt_xoanxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoanxbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nhapnxb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(themnxb, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(suanxb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_xoanxb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(nhapnxb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(themnxb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(suanxb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_xoanxb, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon("E:\\yeu\\image\\timkiemnxb.png")); // NOI18N
        jButton1.setText("Tìm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_timkiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_timkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents
   public void set() {
    }
    private void suanxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suanxbActionPerformed
        String ma = txtmanxb.getText();
        String tennxb = txttennxb.getText();
        String diachinxb = txtdiachinxb.getText();
        String phonenxb = txtsodienthoai.getText();
        String emailnxb = txtnxbemail.getText();
        NhaXuatBan nxb = new NhaXuatBan(ma, tennxb, diachinxb, phonenxb, emailnxb);
        boolean f = nxbdt.updatenxb(nxb);
        if (f) {
            JOptionPane.showMessageDialog(this, "Chinh sua Thanh Cong");
        } else {
            JOptionPane.showMessageDialog(this, "Chỉnh Sửa Thất Bại");
        }
        CapNhat();

    }//GEN-LAST:event_suanxbActionPerformed
    public void CapNhat() {
        ResultSet rs = nxbdt.HienThi();
        tablenxb.setModel(DbUtils.resultSetToTableModel(rs));
    }
    private void themnxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themnxbActionPerformed

        try {
            String ma = txtmanxb.getText();
            String tennxb = txttennxb.getText();
            String diachinxb = txtdiachinxb.getText();
            String phonenxb = txtsodienthoai.getText();
            String emailnxb = txtnxbemail.getText();
            if (!Regex.validate(emailnxb)) 
                JOptionPane.showMessageDialog(this, "Email Khong Hop Le");
            
            if (!Regex.checkphone(phonenxb)) 
                JOptionPane.showMessageDialog(this, "Phone Khong Hop Le");
            
            NhaXuatBan nxb1 = new NhaXuatBan(ma, tennxb, diachinxb, phonenxb, emailnxb);
            if (Regex.validate(emailnxb) && Regex.checkphone(phonenxb)) 
                if (nxbdt.KiemTraMaNXB(ma)) {
                    boolean f = nxbdt.ThemNXB(nxb1);
                    if (f) 
                        JOptionPane.showMessageDialog(this, "Thêm Nhà Xuât Bản Thành Công");
                        pane1.cb_tennxb.addItem(tennxb);

                } else 
                    JOptionPane.showMessageDialog(this, "Trung ma");
                
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        CapNhat();

    }//GEN-LAST:event_themnxbActionPerformed

    private void bt_xoanxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoanxbActionPerformed

        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            String ma = txtmanxb.getText();
            boolean f = nxbdt.XoaNXB(ma);
            if (f) {
                JOptionPane.showMessageDialog(this, "Xoa Nha Xuat Ban Thanh Cong");
            } else {
                JOptionPane.showMessageDialog(this, "Xoa Nha Xuat Ban That Bai");
            }
        } else {

        }
        CapNhat();

    }//GEN-LAST:event_bt_xoanxbActionPerformed

    private void tablenxbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablenxbMouseClicked
        int row = tablenxb.getSelectedRow();
        if (row != -1) {
            txtmanxb.setText(tablenxb.getValueAt(row, 0).toString());
            txttennxb.setText(tablenxb.getValueAt(row, 1).toString());
            txtdiachinxb.setText(tablenxb.getValueAt(row, 2).toString());
            txtsodienthoai.setText(tablenxb.getValueAt(row, 3).toString());
            txtnxbemail.setText(tablenxb.getValueAt(row, 4).toString());
        }
    }//GEN-LAST:event_tablenxbMouseClicked

    private void txt_timkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemKeyReleased
       String tim=txt_timkiem.getText();
        
        ResultSet rs=nxbdt.TimKiemThongTin(tim);
        tablenxb.setModel(DbUtils.resultSetToTableModel(rs));
    }//GEN-LAST:event_txt_timkiemKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String tim=txt_timkiem.getText();
        
        ResultSet rs=nxbdt.TimKiemThongTin(tim);
        tablenxb.setModel(DbUtils.resultSetToTableModel(rs));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_xoanxb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nhapnxb;
    private javax.swing.JButton suanxb;
    private javax.swing.JTable tablenxb;
    private javax.swing.JButton themnxb;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JTextField txtdiachinxb;
    private javax.swing.JTextField txtmanxb;
    private javax.swing.JTextField txtnxbemail;
    private javax.swing.JTextField txtsodienthoai;
    private javax.swing.JTextField txttennxb;
    // End of variables declaration//GEN-END:variables
}