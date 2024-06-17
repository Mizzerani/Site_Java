package Formularios;

import Classes.Cliente;
import Classes.Dados;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmClientes extends javax.swing.JInternalFrame {
        private Dados msDados;
        private int cliAtual = 0;
        private boolean novo = false;
        private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    
    public frmClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        txtEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbId = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DData = new com.toedter.calendar.JDateChooser();
        DNascimento = new com.toedter.calendar.JCalendar();
        jLabel11 = new javax.swing.JLabel();

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
        setTitle("Cadastro de Clientes");
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

        jLabel1.setText("Sobrenome:");
        jLabel1.setToolTipText("");

        jLabel2.setText("ID do Cliente:");
        jLabel2.setToolTipText("");

        jLabel3.setText("Nome");
        jLabel3.setToolTipText("");

        jLabel4.setText("Endereço:");
        jLabel4.setToolTipText("");

        txtIdCliente.setEnabled(false);
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        txtSobrenome.setEnabled(false);
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setToolTipText("Navegar para o próximo cadastro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

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

        jLabel5.setText("Telefone:");

        jLabel7.setText("Identificação:");

        cmbId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "CNH", "Identidade", "Passaporte" }));

        jLabel8.setText("Cidade:");

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "São Paulo", "Rio de Janeiro", "Belo Horizonte" }));

        jLabel9.setText("Nascimento:");

        jLabel10.setText("Data:");

        DData.setEnabled(false);

        DNascimento.setEnabled(false);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cliente.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmbId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DData, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSobrenome, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdCliente, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(179, 179, 179))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addComponent(DData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrimeiro)
                            .addComponent(btnAnterior)
                            .addComponent(btnProximo)
                            .addComponent(btnUltimo)
                            .addComponent(btnPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo)
                            .addComponent(btnEditar)
                            .addComponent(btnSalvar)
                            .addComponent(btnExcluir)
                            .addComponent(btnCancelar))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        cliAtual = msDados.numeroClientes()-1;
        mostrarCadastro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        cliAtual--;
        if(cliAtual == -1){
            cliAtual = msDados.numeroClientes()-1;    
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
        txtIdCliente.setEnabled(true);
        cmbId.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        DNascimento.setEnabled(true);
        // Limpar caixas de texto
        txtIdCliente.setText("");
        cmbId.setSelectedIndex(0);
        txtNome.setText("");
        txtSobrenome.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        DNascimento.setDate(new Date());
        DData.setDate(new Date());
        
        novo = true;
        
        txtSobrenome.requestFocus(); 
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
        txtIdCliente.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        DNascimento.setEnabled(true);
        novo = false;
        cmbId.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtIdCliente.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira o ID do cliente.");
            txtIdCliente.requestFocusInWindow();
            return;
        }
        
        if(cmbId.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Insira uma Identificação!");
            cmbId.requestFocusInWindow();
            return;
        }
        
        if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira um Nome!");
            txtNome.requestFocusInWindow();
            return;
        }
        
        if(txtSobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira um sobrenome!");
            txtSobrenome.requestFocusInWindow();
            return;
        }
        
        if(DNascimento.getDate().after(new Date())){
            JOptionPane.showMessageDialog(rootPane, "Digite uma data de nascimento que seja antes de hoje!");
            DNascimento.requestFocusInWindow();
            return;
        }
        
        int pos = msDados.posicaoCliente(txtIdCliente.getText());
        if(novo){
            if(pos != -1){
                JOptionPane.showMessageDialog(rootPane, "Este cliente já existe!");
                txtIdCliente.requestFocusInWindow();
                return;
            }else{
                if(pos == -1){
                    JOptionPane.showMessageDialog(rootPane, "Este cliente ainda não existe.");
                    txtIdCliente.requestFocusInWindow();
                    return;
                }
            }
            Cliente mCliente = new Cliente(txtIdCliente.getText(),cmbId.getSelectedIndex(),txtNome.getText(),txtSobrenome.getText(),txtEndereco.getText(),txtTelefone.getText(),cmbCidade.getSelectedIndex(),DNascimento.getDate(),DData.getDate());
            String msg;
            if(novo){
                msg = msDados.adicionarCliente(mCliente);
            }else{
                msg = msDados.editarCliente(mCliente, pos); 
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
        txtIdCliente.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        DNascimento.setEnabled(false);
        DData.setEnabled(false);
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
        // Desabilitar os campos
        txtIdCliente.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        DNascimento.setEnabled(false);
        DData.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarCadastro();
        preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        cliAtual = 0;
        mostrarCadastro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        cliAtual++;
        if(cliAtual == msDados.numeroClientes()){
            cliAtual = 0;
        }
        mostrarCadastro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String cliente = JOptionPane.showInputDialog("Insira o código do cliente: ");
        if(cliente.equals("")){
            return;
        }
        int pos = msDados.posicaoCliente(cliente);
        if(pos == -1){
            JOptionPane.showMessageDialog(rootPane,"Este cliente não existe!");
            return;
        }
            cliAtual = pos;
            mostrarCadastro();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente excluir esse cliente?");
        if(resposta != 0){
            return;
        }
        String msg;
        msg = msDados.deletarCliente(cliAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        cliAtual = 0;
        mostrarCadastro();
        preencherTabela();            
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed
    
    private void mostrarCadastro(){
        txtIdCliente.setText(msDados.getClientes()[cliAtual].getIdCliente());
        cmbId.setSelectedIndex(msDados.getClientes()[cliAtual].getIdTipo());
        txtNome.setText(msDados.getClientes()[cliAtual].getNome());
        txtSobrenome.setText(msDados.getClientes()[cliAtual].getSobrenome());
        txtEndereco.setText(msDados.getClientes()[cliAtual].getEndereco());
        txtTelefone.setText(msDados.getClientes()[cliAtual].getTelefone());
        cmbCidade.setSelectedIndex(msDados.getClientes()[cliAtual].getIdCidade());
        DNascimento.setDate(msDados.getClientes()[cliAtual].getDNascimento()); 
        DData.setDate(msDados.getClientes()[cliAtual].getData());
    }
    
    private void preencherTabela(){
        String titulos[] = {"ID Cliente","Tipo ID","Nome", "Sobrenome","Endereço","Tel","Cidade","Nasc","Data"};
        String registro[] = new String[9];
        mTabela = new DefaultTableModel(null,titulos);
        for(int  i = 0; i < msDados.numeroClientes(); i++){
            registro[0] = msDados.getClientes()[i].getIdCliente();
            registro[1] = tipoId(msDados.getClientes()[i].getIdTipo());
            registro[2] = msDados.getClientes()[i].getNome();
            registro[3] = msDados.getClientes()[i].getSobrenome();
            registro[4] = msDados.getClientes()[i].getEndereco();
            registro[5] = msDados.getClientes()[i].getTelefone();
            registro[6] = cidade(msDados.getClientes()[i].getIdCidade());
            registro[7] ="" + msDados.getClientes()[i].getDNascimento();
            registro[8] ="" + msDados.getClientes()[i].getData();
            mTabela.addRow(registro);
        }
        
        tblTabela.setModel(mTabela); 
    }
    private String tipoId(int id){
        switch(id){
            case 1: return"CNH";
            case 2: return"Identidade";
            case 3: return"Passaporte";
            default: return"Não definido.";
        }    
    }
    
    private String cidade(int id){
        switch(id){
            case 1: return"São Paulo";
            case 2: return"Rio de Janeiro";
            case 3: return"Belo Horizonte";
            default: return"Não definido.";
        }    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DData;
    private com.toedter.calendar.JCalendar DNascimento;
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
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbId;
    private javax.swing.Box.Filler filler1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
