package Formulários;

import Classes.Dados;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {
        private int perfil;
        private String senha;
        private String usuario;
        private Dados msDados;
    
    public void setSenha(String senha){
        this.senha = senha;
    }
        
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    
    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    } 
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public frmPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCarrinho = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        C7950X = new javax.swing.JButton();
        C7800X = new javax.swing.JButton();
        CR77600 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        C14900KF = new javax.swing.JButton();
        C14600KF = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        C14700KF = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        C4060 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        C4070 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        C4080S = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        CRX7600 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        C7700XT = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        C7800XT = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnInfo = new javax.swing.JMenu();
        mnIAjuda = new javax.swing.JMenuItem();
        mnISobre = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/R5 7600.jpg"))); // NOI18N
        jLabel1.setText("Processador");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/i9 14900KF.jpg"))); // NOI18N
        jLabel2.setText("Processador");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/R9 7950X.jpg"))); // NOI18N
        jLabel3.setText("Processador");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/R7 7800X3D.jpg"))); // NOI18N
        jLabel4.setText("Processador");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/i7 14700KF.jpg"))); // NOI18N
        jLabel5.setText("Processador");

        btnCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Carrinho.png"))); // NOI18N
        btnCarrinho.setText("Carrinho");
        btnCarrinho.setAutoscrolls(true);
        btnCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoActionPerformed(evt);
            }
        });

        jLabel6.setText("Processador AMD Ryzen 7 7800X3D");

        jLabel7.setText("Processador AMD Ryzen 9 7950X");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setText("Preço: R$ 2649,99");

        C7950X.setText("Comprar");
        C7950X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7950XActionPerformed(evt);
            }
        });

        C7800X.setText("Comprar");
        C7800X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7800XActionPerformed(evt);
            }
        });

        CR77600.setText("Comprar");
        CR77600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CR77600ActionPerformed(evt);
            }
        });

        jLabel9.setText("Processador AMD Ryzen 5 7600");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setText("Preço: R$ 3548,99");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setText("Preço: R$ 1539,00");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/i5 14600KF.jpg"))); // NOI18N
        jLabel12.setText("Processador");

        jLabel13.setText("Processador Intel i9 14900KF");

        jLabel14.setText("Processador Intel i7 14700KF");

        jLabel15.setText("Processador Intel i5 14600KF");

        C14900KF.setText("Comprar");
        C14900KF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14900KFActionPerformed(evt);
            }
        });

        C14600KF.setText("Comprar");
        C14600KF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14600KFActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel16.setText("Preço: R$ 3548,99");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setText("Preço: R$ 2685,99");

        C14700KF.setText("Comprar");
        C14700KF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14700KFActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setText("Preço: R$ 1894,99");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RX 7600.jpg"))); // NOI18N
        jLabel19.setText("Processador");

        jLabel20.setText("ASUS RTX 4060 8Gb Dual");

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel21.setText("Preço: R$ 1999,99 ");

        C4060.setText("Comprar");
        C4060.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4060ActionPerformed(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RTX 4060.jpg"))); // NOI18N
        jLabel22.setText("Processador");

        jLabel23.setText("ASUS RTX 4070 Super 12Gb Dual");

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel24.setText("Preço: R$4149 ,99");

        C4070.setText("Comprar");
        C4070.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4070ActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RTX 4070.jpg"))); // NOI18N
        jLabel25.setText("Processador");

        jLabel26.setText("ASUS RTX 4080 Super 16Gb ROG STRIX");

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel27.setText("Preço: R$8359,99");

        C4080S.setText("Comprar");
        C4080S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4080SActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RTX 4080.jpg"))); // NOI18N
        jLabel28.setText("Processador");

        jLabel29.setText("Gigabyte Radeon RX7600 8Gb");

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel30.setText("Preço: R$1599,99");

        CRX7600.setText("Comprar");
        CRX7600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRX7600ActionPerformed(evt);
            }
        });

        jLabel31.setText("Gigabyte Radeon RX770XT 12Gb");

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel32.setText("Preço: R$3199,99");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RX 7700XT.jpg"))); // NOI18N
        jLabel33.setText("Processador");

        C7700XT.setText("Comprar");
        C7700XT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7700XTActionPerformed(evt);
            }
        });

        jLabel34.setText("Gigabyte Radeon RX7800XT 16Gb");

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel35.setText("Preço: R$4499,99");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RX 7800XT.jpg"))); // NOI18N
        jLabel36.setText("Processador");

        C7800XT.setText("Comprar");
        C7800XT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7800XTActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setText("Bem-Vindo ao ");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Kaboomga!Hardware.png"))); // NOI18N

        mnArquivo.setText("Arquivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuario.png"))); // NOI18N
        jMenuItem1.setText("Trocar Usuário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnArquivo.add(jMenuItem1);
        mnArquivo.add(jSeparator1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout.png"))); // NOI18N
        jMenuItem2.setText("Sair");
        mnArquivo.add(jMenuItem2);

        jMenuBar1.add(mnArquivo);

        mnInfo.setText("Sobre");

        mnIAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Info_1.png"))); // NOI18N
        mnIAjuda.setText("Ajuda");
        mnIAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIAjudaActionPerformed(evt);
            }
        });
        mnInfo.add(mnIAjuda);

        mnISobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Contato.png"))); // NOI18N
        mnISobre.setText("Sobre");
        mnISobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnISobreActionPerformed(evt);
            }
        });
        mnInfo.add(mnISobre);

        jMenuBar1.add(mnInfo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(C7950X))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C4060))
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(C4070))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(C7800X))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(CR77600)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C14900KF))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C4080S))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CRX7600))
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(C14700KF))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C14600KF))
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(C7700XT))
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(C7800XT))
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel37)))
                .addGap(18, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(C7950X)
                                        .addComponent(jLabel10)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CR77600)
                                        .addComponent(jLabel11)
                                        .addComponent(C14900KF)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17)
                                        .addComponent(C14700KF)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(C7800X)
                                        .addComponent(jLabel8))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C14600KF)
                                    .addComponent(jLabel18))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel30)
                                            .addComponent(CRX7600)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel21)
                                            .addComponent(C4060)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel32)
                                            .addComponent(C7700XT)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(C4080S)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(C7800XT)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(C4070))))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnISobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnISobreActionPerformed
        frmSobre mSobre = new frmSobre(this, rootPaneCheckingEnabled);
        mSobre.setLocationRelativeTo(this);
        mSobre.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnISobreActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnIAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIAjudaActionPerformed
        frmAjuda mAjuda = new frmAjuda(this, rootPaneCheckingEnabled);
        mAjuda.setLocationRelativeTo(this);
        mAjuda.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnIAjudaActionPerformed

    private void C7950XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7950XActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_C7950XActionPerformed

    private void C7800XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7800XActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_C7800XActionPerformed

    private void CR77600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CR77600ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_CR77600ActionPerformed

    private void C14900KFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C14900KFActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_C14900KFActionPerformed

    private void btnCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoActionPerformed
        frmCarrinho mCarrinho = new frmCarrinho(this, rootPaneCheckingEnabled);
        mCarrinho.setLocationRelativeTo(this);
        mCarrinho.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnCarrinhoActionPerformed

    private void C14600KFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C14600KFActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_C14600KFActionPerformed

    private void C14700KFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C14700KFActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_C14700KFActionPerformed

    private void C4060ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4060ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_C4060ActionPerformed

    private void C4070ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4070ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_C4070ActionPerformed

    private void C4080SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4080SActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_C4080SActionPerformed

    private void CRX7600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRX7600ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_CRX7600ActionPerformed

    private void C7700XTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7700XTActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_C7700XTActionPerformed

    private void C7800XTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7800XTActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
    }//GEN-LAST:event_C7800XTActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C14600KF;
    private javax.swing.JButton C14700KF;
    private javax.swing.JButton C14900KF;
    private javax.swing.JButton C4060;
    private javax.swing.JButton C4070;
    private javax.swing.JButton C4080S;
    private javax.swing.JButton C7700XT;
    private javax.swing.JButton C7800X;
    private javax.swing.JButton C7800XT;
    private javax.swing.JButton C7950X;
    private javax.swing.JButton CR77600;
    private javax.swing.JButton CRX7600;
    private javax.swing.JButton btnCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnArquivo;
    private javax.swing.JMenuItem mnIAjuda;
    private javax.swing.JMenuItem mnISobre;
    private javax.swing.JMenu mnInfo;
    // End of variables declaration//GEN-END:variables
}
