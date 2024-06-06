package Classes;

public class Dados{
    public boolean validarUsuario(String usuario,String senha){
        if (usuario.equals("miz")&& senha.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
