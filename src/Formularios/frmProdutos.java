package Formularios;

import Classes.Dados;
import Classes.Produto;
import Classes.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProdutos extends javax.swing.JInternalFrame {
        private Dados msDados;
        private int proAtual = 0;
        private boolean novo = false;
        private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    
    public frmProdutos() {
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
        txtDescricao = new javax.swing.JTextField();
        txtIdProduto = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnPrimeiro = new javax.swing.JButton();
        cmbTaxa = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnotacao = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

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
        setTitle("Cadastro de Produtos:");
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

        jLabel1.setText("ID Produto :");
        jLabel1.setToolTipText("");

        jLabel2.setText("Descrição:");
        jLabel2.setToolTipText("");

        jLabel3.setText("Preço:");
        jLabel3.setToolTipText("");

        jLabel4.setText("Anotação:");
        jLabel4.setToolTipText("");

        txtDescricao.setEnabled(false);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        txtIdProduto.setEnabled(false);

        txtPreco.setEnabled(false);
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setToolTipText("Navegar para o próximo cadastro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        cmbTaxa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "15%", " " }));
        cmbTaxa.setEnabled(false);
        cmbTaxa.setName(""); // NOI18N
        cmbTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTaxaActionPerformed(evt);
            }
        });

        jLabel5.setText("Taxa:");

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

        txtAnotacao.setColumns(20);
        txtAnotacao.setRows(5);
        jScrollPane3.setViewportView(txtAnotacao);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Processador.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(cmbTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void cmbTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTaxaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTaxaActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        proAtual = msDados.numeroProdutos()-1;
        mostrarCadastro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        proAtual--;
        if(proAtual == -1){
            proAtual = msDados.numeroProdutos()-1;    
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
        txtIdProduto.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        txtAnotacao.setEnabled(true);
        cmbTaxa.setEnabled(true);
        // Limpar caixas de texto
        txtIdProduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtAnotacao.setText("");
        cmbTaxa.setSelectedIndex(0);
        novo = true;
        txtIdProduto.requestFocus(); 
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
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        cmbTaxa.setEnabled(true);
        txtAnotacao.setEnabled(true);
        novo = false;
        txtAnotacao.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtIdProduto.getText().equals("")){
            JOptionPane.showMessageDialog(
                    rootPane, "Insira um número de ID válido!");
            txtIdProduto.requestFocusInWindow();
            return;
        }
        
        if(cmbTaxa.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Insira uma taxa válida!");
            cmbTaxa.requestFocusInWindow();
            return;
        }
        
        if(txtDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira uma descrição!");
            txtDescricao.requestFocusInWindow();
            return;
        }
        
        if(txtPreco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira um valor!");
            txtPreco.requestFocusInWindow();
            return;
        }
        
        if(!Utilidades.isNumeric(txtPreco.getText())){
            JOptionPane.showMessageDialog(rootPane, "Digite somente números");
            txtPreco.requestFocusInWindow();
            return;
        }
        
        int preco = Integer.parseInt(txtPreco.getText());
            if(preco <= 0){
            JOptionPane.showMessageDialog(rootPane, "Digite valores maiores que zero!");
            txtPreco.requestFocusInWindow();
            return;
            }
            
        int pos = msDados.posicaoProduto(txtIdProduto.getText());
        if(novo){
            if(pos != -1){
                JOptionPane.showMessageDialog(rootPane, "Este produto já existe!");
                txtIdProduto.requestFocusInWindow();
                return;
            }else{
                if(pos == -1){
                    JOptionPane.showMessageDialog(rootPane, "Este produto ainda não existe.");
                    txtIdProduto.requestFocusInWindow();
                    return;
                }
            }
            Produto mProduto = new Produto(txtIdProduto.getText(),txtDescricao.getText(),preco,cmbTaxa.getSelectedIndex(),txtAnotacao.getText());
            String msg;
            if(novo){
                msg = msDados.adicionarProduto(mProduto);
            }else{
                msg = msDados.editarPro(mProduto, pos); 
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
        txtIdProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        cmbTaxa.setEnabled(false);
        txtAnotacao.setEnabled(false);
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
        txtIdProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        cmbTaxa.setEnabled(false);
        txtAnotacao.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarCadastro();
        preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        proAtual = 0;
        mostrarCadastro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        proAtual++;
        if(proAtual == msDados.numeroProdutos()){
            proAtual = 0;
        }
        mostrarCadastro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String produto = JOptionPane.showInputDialog("Insira o código do produto: ");
        if(produto.equals("")){
            return;
        }
        int pos = msDados.posicaoProduto(produto);
        if(pos == -1){
            JOptionPane.showMessageDialog(rootPane,"Este produto não existe!");
            return;
        }
            proAtual = pos;
            mostrarCadastro();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente excluir esse produto?");
        if(resposta != 0){
            return;
        }
        String msg;
        msg = msDados.deletarProduto(proAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        proAtual = 0;
        mostrarCadastro();
        preencherTabela();            
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    private void mostrarCadastro(){
        txtIdProduto.setText(msDados.getProdutos()[proAtual].getIdProduto());
        txtDescricao.setText(msDados.getProdutos()[proAtual].getDescricao());
        txtPreco.setText("" + msDados.getProdutos()[proAtual].getPreco());
        txtAnotacao.setText(msDados.getProdutos()[proAtual].getAnotacao());
        cmbTaxa.setSelectedIndex(msDados.getProdutos()[proAtual].getTaxa()); 
    }
    
    private void preencherTabela(){
        String titulos[] = {"ID Produto","Descrição","Preço", "Imposto", "Anotação"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null,titulos);
        for(int  i = 0; i < msDados.numeroProdutos(); i++){
            registro[0] = msDados.getProdutos()[i].getIdProduto();
            registro[1] = msDados.getProdutos()[i].getDescricao();
            registro[2] ="" + msDados.getProdutos()[i].getPreco();
            registro[3] = taxa(msDados.getProdutos()[i].getTaxa());
            registro[4] = msDados.getProdutos()[i].getAnotacao();
            mTabela.addRow(registro);
        }
        
        tblTabela.setModel(mTabela); 
    }
    private String taxa(int idTAXA){
        switch(idTAXA){
            case 0: return"0%";
            case 1: return"10%";
            case 2: return"15%";
            default: return"Não definido.";
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
    private javax.swing.JComboBox<String> cmbTaxa;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextArea txtAnotacao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
