/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poly.cafe.ui;

import poly.cafe.util.XAuth;
import poly.cafe.util.XIcon;

/**
 *
 * @author DELL
 */
public final class PolyCafeJFrame extends javax.swing.JFrame implements PolyCafeController{

/**
 * Creates new form AppJFrame
 */
public PolyCafeJFrame() {
    initComponents();
    this.init();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeft = new javax.swing.JPanel();
        pnlLeftCenter = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblPhoto = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        pnlLeftBottom = new javax.swing.JPanel();
        btnSales = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlManager = new javax.swing.JPanel();
        pnlCenterBottom = new javax.swing.JPanel();
        btnDrinkMgr = new javax.swing.JButton();
        btnCategoryMgr = new javax.swing.JButton();
        btnCardMgr = new javax.swing.JButton();
        btnBillMgr = new javax.swing.JButton();
        btnUserMgr = new javax.swing.JButton();
        btnReportMgr = new javax.swing.JButton();
        pnlBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Poly Cafe");
        setBackground(new java.awt.Color(255, 51, 51));

        pnlLeft.setBackground(new java.awt.Color(255, 153, 102));
        pnlLeft.setLayout(new java.awt.BorderLayout(1, 1));

        pnlLeftCenter.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeftCenter.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);

        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/cafe/icons/trump-small.png"))); // NOI18N
        lblPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));

        lblFullname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFullname.setForeground(new java.awt.Color(255, 51, 0));
        lblFullname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFullname.setText("Nguyễn Văn Tèo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFullname)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pnlLeftCenter.add(jPanel1, java.awt.BorderLayout.CENTER);

        pnlLeft.add(pnlLeftCenter, java.awt.BorderLayout.CENTER);

        pnlLeftBottom.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeftBottom.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlLeftBottom.setPreferredSize(new java.awt.Dimension(310, 150));
        pnlLeftBottom.setLayout(new java.awt.GridLayout(0, 2, 5, 5));

        btnSales.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnSales.setText("BÁN HÀNG");
        btnSales.setPreferredSize(new java.awt.Dimension(90, 60));
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });
        pnlLeftBottom.add(btnSales);

        btnHistory.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnHistory.setText("LỊCH SỬ");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });
        pnlLeftBottom.add(btnHistory);

        btnChangePassword.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnChangePassword.setText("ĐỔI MẬT KHẨU");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        pnlLeftBottom.add(btnChangePassword);

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnExit.setText("KẾT THÚC");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlLeftBottom.add(btnExit);

        pnlLeft.add(pnlLeftBottom, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlCenter.setLayout(new javax.swing.OverlayLayout(pnlCenter));

        pnlManager.setOpaque(false);
        pnlManager.setLayout(new java.awt.BorderLayout());

        pnlCenterBottom.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlCenterBottom.setOpaque(false);
        pnlCenterBottom.setPreferredSize(new java.awt.Dimension(693, 150));
        pnlCenterBottom.setLayout(new java.awt.GridLayout(0, 3, 5, 5));

        btnDrinkMgr.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnDrinkMgr.setText("ĐỒ UỐNG");
        btnDrinkMgr.setPreferredSize(new java.awt.Dimension(200, 60));
        btnDrinkMgr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDrinkMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkMgrActionPerformed(evt);
            }
        });
        pnlCenterBottom.add(btnDrinkMgr);

        btnCategoryMgr.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCategoryMgr.setText("LOẠI ĐỒ UỐNG");
        btnCategoryMgr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCategoryMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryMgrActionPerformed(evt);
            }
        });
        pnlCenterBottom.add(btnCategoryMgr);

        btnCardMgr.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCardMgr.setText("THẺ ĐỊNH DANH");
        btnCardMgr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCardMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardMgrActionPerformed(evt);
            }
        });
        pnlCenterBottom.add(btnCardMgr);

        btnBillMgr.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnBillMgr.setText("PHIẾU BÁN HÀNG");
        btnBillMgr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBillMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillMgrActionPerformed(evt);
            }
        });
        pnlCenterBottom.add(btnBillMgr);

        btnUserMgr.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnUserMgr.setText("NGƯỜI SỬ DỤNG");
        btnUserMgr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUserMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserMgrActionPerformed(evt);
            }
        });
        pnlCenterBottom.add(btnUserMgr);

        btnReportMgr.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnReportMgr.setText("DOANH THU");
        btnReportMgr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReportMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportMgrActionPerformed(evt);
            }
        });
        pnlCenterBottom.add(btnReportMgr);

        pnlManager.add(pnlCenterBottom, java.awt.BorderLayout.PAGE_END);

        pnlCenter.add(pnlManager);

        pnlBackground.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/cafe/icons/coffee-shop.jpg"))); // NOI18N
        pnlBackground.add(jLabel1);

        pnlCenter.add(pnlBackground);

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        this.showChangePasswordJDialog(this);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
        this.showHistoryJDialog(this);
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        // TODO add your handling code here:
        this.showSalesJDialog(this);
    }//GEN-LAST:event_btnSalesActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDrinkMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkMgrActionPerformed
        // TODO add your handling code here:
        this.showDrinkManagerJDialog(this);
    }//GEN-LAST:event_btnDrinkMgrActionPerformed

    private void btnCategoryMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryMgrActionPerformed
        // TODO add your handling code here:
        this.showCategoryManagerJDialog(this);
    }//GEN-LAST:event_btnCategoryMgrActionPerformed

    private void btnCardMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardMgrActionPerformed
        // TODO add your handling code here:
        this.showCardManagerJDialog(this);
    }//GEN-LAST:event_btnCardMgrActionPerformed

    private void btnBillMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillMgrActionPerformed
        // TODO add your handling code here:
        this.showBillManagerJDialog(this);
    }//GEN-LAST:event_btnBillMgrActionPerformed

    private void btnUserMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserMgrActionPerformed
        // TODO add your handling code here:
        this.showUserManagerJDialog(this);
    }//GEN-LAST:event_btnUserMgrActionPerformed

    private void btnReportMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportMgrActionPerformed
        // TODO add your handling code here:
        this.showRevenueManagerJDialog(this);
    }//GEN-LAST:event_btnReportMgrActionPerformed

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
            java.util.logging.Logger.getLogger(PolyCafeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PolyCafeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PolyCafeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PolyCafeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PolyCafeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBillMgr;
    private javax.swing.JButton btnCardMgr;
    private javax.swing.JButton btnCategoryMgr;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnDrinkMgr;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnReportMgr;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnUserMgr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlCenterBottom;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlLeftBottom;
    private javax.swing.JPanel pnlLeftCenter;
    private javax.swing.JPanel pnlManager;
    // End of variables declaration//GEN-END:variables

@Override
public void init() {
    this.setIconImage(XIcon.getIcon("trump-small.png").getImage());
    this.setLocationRelativeTo(null);

    this.showWelcomeJDialog(this);
    this.showLoginJDialog(this);

    XIcon.setIcon(lblPhoto, "photos/" + XAuth.user.getPhoto());
    lblFullname.setText(XAuth.user.getFullname());

    if(!XAuth.user.isManager()){
        pnlCenter.remove(pnlManager);
    }
}
}