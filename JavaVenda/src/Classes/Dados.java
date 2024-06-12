package Classes;

public class Dados {
    private Usuario usuarios[] = new Usuario[50];
    private int conUsr = 0;
    
    public Dados(){
        Usuario mUsuario = new Usuario("mizzerani","Matheus","Mizerani Carneiro","123",1);
        usuarios[conUsr] = mUsuario;
        conUsr++;
    }
    
    public Usuario[]getUsuarios(){
        return usuarios;
    }
    
    public boolean validarUsuario(String usuario, String senha){
        boolean aux = false;
        for(int i = 0; i < conUsr; i++){
            if(usuarios[i].getIdUsuário().equals(usuario)&& 
                    usuarios[i].getSenha().equals(senha)){
                return true;    
            }
        }
        return false;
    }
    
     public boolean posicao(String usuario){
        for(int i = 0; i < conUsr; i++){
            if(usuarios[i].getIdUsuário().equals(usuario)){
                return true;    
            }
        }
        return false;
    }
}
