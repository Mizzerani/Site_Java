package Classes;

import Formulários.frmLogin;

/**
 * Sistema de vendas em java - Kaboomga!. Versão 1.0
 * O site Kaboomga é um programa que utiliza as features do swing para
 * desenvolver um site de vendas. Também, é utilizado,
 * conjuntamente com um banco de dados, para o armazenamento dos dados.
 * Desenvolvido por @Mizzerani 
 */


public class Site {

    public static void main(String[] args) {
        Dados msDados = new Dados();
        frmLogin myLogin = new frmLogin();
        myLogin.setDados(msDados);
        myLogin.setLocationRelativeTo(null);
        myLogin.setVisible(true);
    }
    
}
