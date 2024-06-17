package Formularios;

import Classes.Dados;
import Classes.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmUsuários extends javax.swing.JInternalFrame {
        private Dados msDados;
        private int usrAtual = 0;
        private boolean novo = false;
        private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    
    public frmUsuários() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        btnPrimeiro = new javax.swing.JButton();
        cmbPerfil = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        pasSenha = new javax.swing.JPasswordField();
        pasConfirmar = new javax.swing.JPasswordField();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Cadastro");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("ID Usuário :");
        jLabel1.setToolTipText("");

        jLabel2.setText("Nome :");
        jLabel2.setToolTipText("");

        jLabel3.setText("Sobrenome :");
        jLabel3.setToolTipText("");

        jLabel4.setText("Senha :");
        jLabel4.setToolTipText("");

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtId.setEnabled(false);

        txtSobrenome.setEnabled(false);
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });

        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setToolTipText("Navegar para o próximo cadastro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Administrador", "Funcionário", " " }));
        cmbPerfil.setEnabled(false);
        cmbPerfil.setName(""); // NOI18N
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        jLabel5.setText("Perfil :");

        jLabel6.setText("Confirmar senha :");

        btnAnterior.setText("Anterior");
        btnAnterior.setToolTipText("Clique para ir ao primeiro perfil");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText("Próximo");
        btnProximo.setToolTipText("Clique para ir ao último perfil");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setText("Último");
        btnUltimo.setToolTipText("Perfil anterior");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        pasSenha.setEnabled(false);

        pasConfirmar.setEnabled(false);
        pasConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasConfirmarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Criar nova conta");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Editar alterações");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar dados");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar alterações");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Pesquisar perfil");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir perfil");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblTabela);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastro.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNome)
                                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pasSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pasConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pasSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(pasConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProximo)
                        .addComponent(btnUltimo)
                        .addComponent(btnPesquisar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnterior)
                        .addComponent(btnPrimeiro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void pasConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasConfirmarActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        usrAtual = msDados.numeroUsuarios()-1;
        mostrarCadastro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        usrAtual--;
        if(usrAtual == -1){
            usrAtual = msDados.numeroUsuarios()-1;    
        }
        mostrarCadastro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnAnterior.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnPrimeiro.setEnabled(false);
        btnProximo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        // Caixa de textos
        txtId.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        pasSenha.setEnabled(true);
        pasConfirmar.setEnabled(true);
        cmbPerfil.setEnabled(true);
        // Limpar caixas de texto
        txtId.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        pasSenha.setText("");
        pasConfirmar.setText("");
        cmbPerfil.setSelectedIndex(0);
        novo = true;
        txtId.requestFocus(); 
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnAnterior.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnPrimeiro.setEnabled(false);
        btnProximo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        // Caixa de textos
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        pasSenha.setEnabled(true);
        pasConfirmar.setEnabled(true);
        cmbPerfil.setEnabled(true);
        novo = false;
        txtNome.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(
                    rootPane, "Insira um número de ID válido!");
            txtId.requestFocusInWindow();
            return;
        }
        
        if(cmbPerfil.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Insira um perfil válido!");
            cmbPerfil.requestFocusInWindow();
            return;
        }
        
        if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira um nome válido!");
            txtNome.requestFocusInWindow();
            return;
        }
        
        if(txtSobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(
                    rootPane, "Insira um sobrenome válido!");
            txtSobrenome.requestFocusInWindow();
            return;
        }
        
        String senha = new String(pasSenha.getPassword());
        String confirmar = new String(pasConfirmar.getPassword()); 
        
        if(senha.equals("")){
            JOptionPane.showMessageDialog(
                    rootPane, "Insira uma senha válida válido!");
            pasSenha.requestFocusInWindow();
            return;
        }
        
        if(confirmar.equals("")){
            JOptionPane.showMessageDialog(
                    rootPane, "Insira um número de ID válido");
            pasConfirmar.requestFocusInWindow();
            return;
        }
        
        if(!senha.equals(confirmar)){
            JOptionPane.showMessageDialog(
                    rootPane, "As senhas não coincidem! Digite uma senha que seja igual a de confirmação.");
            pasSenha.setText("");
            pasConfirmar.setText("");
            pasSenha.requestFocusInWindow();
            return;
        }
        
        int pos = msDados.posicaoUsuario(txtId.getText());
        if(novo){
            if(pos != -1){
                JOptionPane.showMessageDialog(rootPane, "Este usuário já existe!");
                txtId.requestFocusInWindow();
                return;
            }else{
                if(pos == -1){
                    JOptionPane.showMessageDialog(rootPane, "Este usuário ainda não existe.");
                    txtId.requestFocusInWindow();
                    return;
                }
            }
            Usuario mUsuario = new Usuario(txtId.getText(),txtNome.getText(),txtSobrenome.getText(),senha,cmbPerfil.getSelectedIndex());
            String msg;
            if(novo){
                msg = msDados.adicionarUsuario(mUsuario);
            }else{
                msg = msDados.editarUsr(mUsuario, pos); 
            }
        JOptionPane.showMessageDialog(rootPane, msg); 
        }
        
        btnAnterior.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnPrimeiro.setEnabled(true);
        btnProximo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        // Desabilitar os campos
        txtId.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        pasSenha.setEnabled(false);
        pasConfirmar.setEnabled(false);
        cmbPerfil.setEnabled(false);
        preencherTabela();
        mostrarCadastro();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnAnterior.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnPrimeiro.setEnabled(true);
        btnProximo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarCadastro();
        preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        usrAtual = 0;
        mostrarCadastro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        usrAtual++;
        if(usrAtual == msDados.numeroUsuarios()){
            usrAtual = 0;
        }
        mostrarCadastro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String usuario = JOptionPane.showInputDialog("Insira o código do usuario: ");
        if(usuario.equals("")){
            return;
        }
        int pos = msDados.posicaoUsuario(usuario);
        if(pos == -1){
            JOptionPane.showMessageDialog(rootPane,"Este usuário não existe!");
            return;
        }
            usrAtual = pos;
            mostrarCadastro();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente excluir esse perfil?");
        if(resposta != 0){
            return;
        }
        String msg;
        msg = msDados.deletarUsuario(usrAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        usrAtual = 0;
        mostrarCadastro();
        preencherTabela();
                
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    private void mostrarCadastro(){
        txtId.setText(msDados.getUsuarios()[usrAtual].getIdUsuário());
        txtNome.setText(msDados.getUsuarios()[usrAtual].getNome());
        txtSobrenome.setText(msDados.getUsuarios()[usrAtual].getSobrenome());
        pasSenha.setText(msDados.getUsuarios()[usrAtual].getSenha());
        pasConfirmar.setText(msDados.getUsuarios()[usrAtual].getSenha());
        cmbPerfil.setSelectedIndex(msDados.getUsuarios()[usrAtual].getPerfil()); 
    }
    
    private void preencherTabela(){
        String titulos[] = {"ID Usuário","Nome","Sobrenome", "Perfil"};
        String registro[] = new String[4];
        mTabela = new DefaultTableModel(null,titulos);
        for(int  i = 0; i < msDados.numeroUsuarios(); i++){
            registro[0] = msDados.getUsuarios()[i].getIdUsuário();
            registro[1] = msDados.getUsuarios()[i].getNome();
            registro[2] = msDados.getUsuarios()[i].getSobrenome();
            registro[3] = perfil(msDados.getUsuarios()[i].getPerfil());
            mTabela.addRow(registro);
        }
        
        tblTabela.setModel(mTabela);
        
    }
    
    private String perfil(int idPerfil){
        if(idPerfil == 1){
            return"administrador";
        }else{
            return"Usuário";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField pasConfirmar;
    private javax.swing.JPasswordField pasSenha;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
