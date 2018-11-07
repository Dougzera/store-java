/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import conf.Conexao;
import data.TabelaProduto;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author doug
 */
public class FormProduto extends javax.swing.JFrame {

  public Conexao conexao;
  public static Statement stmt;

  private TabelaProduto tabelaProduto;

  public FormProduto() throws SQLException {
    conexao = new Conexao();
    stmt = conexao.getConexao().createStatement();

    tabelaProduto = new TabelaProduto(select());

    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabelDescProduto = new javax.swing.JLabel();
    jFormattedTextFieldDescProduto = new javax.swing.JFormattedTextField();
    jLabel2 = new javax.swing.JLabel();
    jFormattedTextFieldQntProduto = new javax.swing.JFormattedTextField();
    jLabel3 = new javax.swing.JLabel();
    jFormattedTextFieldPrecoProduto = new javax.swing.JFormattedTextField();
    jButtonNovo = new javax.swing.JButton();
    jButtonSalvar = new javax.swing.JButton();
    jButtonExcluir = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTableProdutos = new javax.swing.JTable();
    jButtonPesquisar = new javax.swing.JButton();
    jLabelid = new javax.swing.JLabel();
    jFormattedTextFieldid = new javax.swing.JFormattedTextField();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabelDescProduto.setText("Descriçao");

    jFormattedTextFieldDescProduto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFormattedTextFieldDescProdutoActionPerformed(evt);
      }
    });

    jLabel2.setText("Quantidade");

    jLabel3.setText("Preço Venda");

    jButtonNovo.setText("Novo");
    jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonNovoActionPerformed(evt);
      }
    });

    jButtonSalvar.setText("Salvar");
    jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonSalvarActionPerformed(evt);
      }
    });

    jButtonExcluir.setText("Excluir");
    jButtonExcluir.setEnabled(false);
    jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonExcluirActionPerformed(evt);
      }
    });

    jTableProdutos.setModel(tabelaProduto);
    jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTableProdutosMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(jTableProdutos);

    jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/search.png"))); // NOI18N
    jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonPesquisarActionPerformed(evt);
      }
    });

    jLabelid.setText("ID");

    jFormattedTextFieldid.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFormattedTextFieldidActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabelid)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jFormattedTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jLabelDescProduto))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jFormattedTextFieldDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jFormattedTextFieldQntProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jFormattedTextFieldPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabelid)
            .addComponent(jFormattedTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelDescProduto)
          .addComponent(jFormattedTextFieldDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jFormattedTextFieldQntProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2)
          .addComponent(jLabel3)
          .addComponent(jFormattedTextFieldPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonNovo)
          .addComponent(jButtonSalvar)
          .addComponent(jButtonExcluir))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 104, Short.MAX_VALUE))
    );

    jLabel1.setText("Produtos");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(371, 371, 371)
        .addComponent(jLabel1)
        .addContainerGap(512, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    setSize(new java.awt.Dimension(943, 534));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jFormattedTextFieldDescProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDescProdutoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFormattedTextFieldDescProdutoActionPerformed

  private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
    // TODO add your handling code here:
    jFormattedTextFieldid.setText("");
    jFormattedTextFieldDescProduto.setText("");
    jFormattedTextFieldQntProduto.setText("");
    jFormattedTextFieldPrecoProduto.setText("");
    jButtonExcluir.setEnabled(false);
  }//GEN-LAST:event_jButtonNovoActionPerformed

  private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
    // TODO add your handling code here:
    if (jFormattedTextFieldid.getText().equals("")) {
      insert();
    } else {
      update();
    }

    try {
      tabelaProduto.setResult(select());
    } catch (SQLException ex) {
      Logger.getLogger(FormProduto.class.getName()).log(Level.SEVERE, null, ex);
    }

    jFormattedTextFieldDescProduto.setText("");
    jFormattedTextFieldQntProduto.setText("");
    jFormattedTextFieldPrecoProduto.setText("");
  }//GEN-LAST:event_jButtonSalvarActionPerformed

  private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
    // TODO add your handling code here:
    jFormattedTextFieldid.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0).toString());
    jFormattedTextFieldDescProduto.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 1).toString());
    jFormattedTextFieldQntProduto.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 2).toString());
    jFormattedTextFieldPrecoProduto.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 3).toString());

    jButtonExcluir.setEnabled(true);
  }//GEN-LAST:event_jTableProdutosMouseClicked

  private void jFormattedTextFieldidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldidActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFormattedTextFieldidActionPerformed

  private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
    // TODO add your handling code here:
    int opcao = JOptionPane.showConfirmDialog(this,
            "Deseja realmente excluir este registro?",
            "Registro Excluido!",
            JOptionPane.YES_NO_OPTION);
    if (opcao == JOptionPane.YES_OPTION) {

      delete(jFormattedTextFieldid.getText());

      jFormattedTextFieldid.setText("");
      jFormattedTextFieldDescProduto.setText("");
      jFormattedTextFieldQntProduto.setText("");
      jFormattedTextFieldPrecoProduto.setText("");
      try {
        tabelaProduto.setResult(select());
      } catch (SQLException ex) {
        Logger.getLogger(FormProduto.class.getName()).log(Level.SEVERE, null, ex);
      }

      jButtonExcluir.setEnabled(false);

    }
  }//GEN-LAST:event_jButtonExcluirActionPerformed

  private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
    // TODO add your handling code here:
    if (jFormattedTextFieldid.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Campo ID em branco!", "Atençao!", JOptionPane.INFORMATION_MESSAGE);
    } else {
      search(jFormattedTextFieldid.getText());
    }
  }//GEN-LAST:event_jButtonPesquisarActionPerformed

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
      java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          new FormProduto().setVisible(true);
        } catch (SQLException ex) {
          Logger.getLogger(FormProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    });
  }

  public ResultSet select() {
    ResultSet rs = null;
    String SQL = "select * from produto";
    try {
      rs = stmt.executeQuery(SQL);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return rs;
  }

  public void delete(String id) {
    String SQL = "DELETE FROM produto WHERE id = " + id;
    try {
      this.stmt.executeUpdate(SQL);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public void insert() {
    String SQL = "INSERT INTO produto(descricao,quantidade, preco_und, data_cad, data_atlz) " + "VALUES (?,?,?,now(),now())";
    try {
      PreparedStatement ps = this.conexao.getConexao().prepareStatement(SQL);

      ps.setString(1, jFormattedTextFieldDescProduto.getText());
      ps.setInt(2, Integer.parseInt(jFormattedTextFieldQntProduto.getText()));

      BigDecimal d = new BigDecimal(jFormattedTextFieldPrecoProduto.getText());
      ps.setBigDecimal(3, d);

      ps.executeUpdate();
      ps.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public void update() {
    String SQL = "update produto set descricao=?, quantidade=?, preco_und=?, data_atlz=now() "
            + "where id = ?";
    try {

      PreparedStatement ps = this.conexao.getConexao().prepareStatement(SQL);

      ps.setString(1, jFormattedTextFieldDescProduto.getText());
      ps.setString(2, jFormattedTextFieldQntProduto.getText());
      ps.setString(3, jFormattedTextFieldPrecoProduto.getText());
      ps.setString(4, jFormattedTextFieldid.getText());

      ps.executeUpdate();
      ps.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public ResultSet search(String id) {
    ResultSet rs = null;
    String SQL = "select * from produto where id="+id;
    try {
      rs = stmt.executeQuery(SQL);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return rs;
   
    }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonExcluir;
  private javax.swing.JButton jButtonNovo;
  private javax.swing.JButton jButtonPesquisar;
  private javax.swing.JButton jButtonSalvar;
  private javax.swing.JFormattedTextField jFormattedTextFieldDescProduto;
  private javax.swing.JFormattedTextField jFormattedTextFieldPrecoProduto;
  private javax.swing.JFormattedTextField jFormattedTextFieldQntProduto;
  private javax.swing.JFormattedTextField jFormattedTextFieldid;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabelDescProduto;
  private javax.swing.JLabel jLabelid;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTableProdutos;
  // End of variables declaration//GEN-END:variables
}
