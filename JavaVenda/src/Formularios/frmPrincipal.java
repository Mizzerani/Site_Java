package Formularios;

import Classes.Dados;

public class frmPrincipal extends javax.swing.JFrame {
        private Dados msDados;
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    
    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        dpnDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MArquivo = new javax.swing.JMenu();
        MAClientes = new javax.swing.JMenuItem();
        MAProdutos = new javax.swing.JMenuItem();
        MAUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MAAlterarSenha = new javax.swing.JMenuItem();
        MATrocarUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MASair = new javax.swing.JMenuItem();
        MMovimentação = new javax.swing.JMenu();
        MNovaVenda = new javax.swing.JMenuItem();
        MRelatoriodeVendas = new javax.swing.JMenuItem();
        Info = new javax.swing.JMenu();
        IAjuda = new javax.swing.JMenuItem();
        ISobre = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de vendas");

        dpnDesktop.setBackground(java.awt.SystemColor.controlHighlight);

        javax.swing.GroupLayout dpnDesktopLayout = new javax.swing.GroupLayout(dpnDesktop);
        dpnDesktop.setLayout(dpnDesktopLayout);
        dpnDesktopLayout.setHorizontalGroup(
            dpnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        dpnDesktopLayout.setVerticalGroup(
            dpnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        MArquivo.setText("Arquivo");

        MAClientes.setText("Clientes");
        MAClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAClientesActionPerformed(evt);
            }
        });
        MArquivo.add(MAClientes);

        MAProdutos.setText("Produtos");
        MArquivo.add(MAProdutos);

        MAUsuarios.setText("Usuários");
        MAUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAUsuariosActionPerformed(evt);
            }
        });
        MArquivo.add(MAUsuarios);
        MArquivo.add(jSeparator1);

        MAAlterarSenha.setText("Alterar senha");
        MAAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAAlterarSenhaActionPerformed(evt);
            }
        });
        MArquivo.add(MAAlterarSenha);

        MATrocarUsuario.setText("Trocar usuário");
        MATrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATrocarUsuarioActionPerformed(evt);
            }
        });
        MArquivo.add(MATrocarUsuario);
        MArquivo.add(jSeparator2);

        MASair.setText("Sair");
        MASair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASairActionPerformed(evt);
            }
        });
        MArquivo.add(MASair);

        jMenuBar1.add(MArquivo);

        MMovimentação.setText("Movimentação");

        MNovaVenda.setText("Nova Venda");
        MMovimentação.add(MNovaVenda);

        MRelatoriodeVendas.setText("Relatório de vendas");
        MRelatoriodeVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRelatoriodeVendasActionPerformed(evt);
            }
        });
        MMovimentação.add(MRelatoriodeVendas);

        jMenuBar1.add(MMovimentação);

        Info.setText("Info");

        IAjuda.setText("Ajuda");
        Info.add(IAjuda);

        ISobre.setText("Sobre");
        Info.add(ISobre);

        jMenuBar1.add(Info);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MAClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MAClientesActionPerformed

    private void MAUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAUsuariosActionPerformed
        frmUsuários mUsuarios = new frmUsuários();
        mUsuarios.setDados(msDados);
        dpnDesktop.add(mUsuarios);
        mUsuarios.show();
    }//GEN-LAST:event_MAUsuariosActionPerformed

    private void MAAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAAlterarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MAAlterarSenhaActionPerformed

    private void MATrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATrocarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MATrocarUsuarioActionPerformed

    private void MASairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MASairActionPerformed

    private void MRelatoriodeVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRelatoriodeVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MRelatoriodeVendasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem IAjuda;
    private javax.swing.JMenuItem ISobre;
    private javax.swing.JMenu Info;
    private javax.swing.JMenuItem MAAlterarSenha;
    private javax.swing.JMenuItem MAClientes;
    private javax.swing.JMenuItem MAProdutos;
    private javax.swing.JMenuItem MASair;
    private javax.swing.JMenuItem MATrocarUsuario;
    private javax.swing.JMenuItem MAUsuarios;
    private javax.swing.JMenu MArquivo;
    private javax.swing.JMenu MMovimentação;
    private javax.swing.JMenuItem MNovaVenda;
    private javax.swing.JMenuItem MRelatoriodeVendas;
    private javax.swing.JDesktopPane dpnDesktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
