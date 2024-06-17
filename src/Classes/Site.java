package Classes;

import Formularios.frmLogin;

/**
 * Sistema de vendas em java - Kaboomga!. Versão 1.0
 * O site Kaboomga é um programa que utiliza as features do swing para
 * desenvolver um site de vendas. Também, é utilizado,
 * conjuntamente com um banco de dados, para o armazenamento dos dados.
 * Desenvolvido por @Mizzerani 
 */

/**
 * Dúvidas:
 * 1 - Como passar esse programa todo para .jar?
 * 2 - Como passar o BD para um programa respectivo?
 */

/**
 * Erros: 
 * 1 - Os botões de salvar e editar (frmClientes,frmUsuarios e frmProdutos)
 * não estão realizando suas respectivas funcionalidades, já revisei zilhões 
 * de vezes e não consegui achar uma solução.
 * Detalhe: Como os frames fazem quase o mesmo papel, eu os programei com as mesmas
 * funcções, variando conforme necessidade.
 * o que fazer?
 * 
 * 2 - Para converter String para data, eu criei uma classe chamada "Utilidades",
 * nas quais ela possui um "public static Date StringtoDate(String Data)",
 * ferramenta própria para a conversão dos dados e a classe "Dados" não a reconhece.
 * O que fazer?
 *
 *
 */

public class Site {
    public static void main(String[] args){
        Dados msDados = new Dados();
        frmLogin myLogin = new frmLogin();
        myLogin.setDados(msDados);
        myLogin.setLocationRelativeTo(null);
        myLogin.setVisible(true);
    }
}
