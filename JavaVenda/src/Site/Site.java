package Site;

import Classes.Dados;
import Formularios.frmLogin;

/**
 * Sistema de vendas em java. Versão 1.0
 * Desenvolvido por @Mizzerani e @William
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
