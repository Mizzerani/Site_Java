package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Dados {
    private int maxUsr = 50;
    private int maxPro = 100;
    private Usuario msUsuarios[] = new Usuario[maxUsr];
    private Produto msProdutos[] = new Produto[maxPro];
    private int conUsr = 0;
    private int conPro = 0;
    
    public Dados(){
        Usuario mUsuario;
        mUsuario = new Usuario("Mizzerani","Matheus","Carneiro Silva","123",1);
        msUsuarios[conUsr] = mUsuario;
        conUsr++;

        mUsuario = new Usuario("Aramuni","João Paulo","Carneiro Aramuni","1234",1);
        msUsuarios[conUsr] = mUsuario;
        conUsr++;
        
        Produto mProduto;
        mProduto = new Produto("7950","Ryzen 9 7950X",3549);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("7800","Ryzen 7 7800X3D",3549);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("7600","Ryzen 5 7600",3549);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("14900","i9 14900KF",4000);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("14700","i7 14700KF",2686);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("14600","i5 14600KF",1895);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("4060","ASUS RTX4060 8Gb",2000);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("4070S","ASUS RTX4070 Super 12Gb",4150);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("4080S","ASUS RTX4080 Super 16Gb",8360);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("RX7600","Gigabyte RX7600 8Gb",1600);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("RX7700XT","Gigabyte RX7700XT 8Gb",3200);
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("RX7800XT","Gigabyte RX7800XT 16Gb",3200);
        msProdutos[conPro] = mProduto;
        conPro++;
    }
    
    public int numeroUsuarios(){
        return conUsr;
    }
    
    public int numeroProdutos(){
        return conPro;
    }
    
    public Usuario[]getUsuarios(){
        return msUsuarios;
    }
    
    public Produto[]getProdutos(){
        return msProdutos;
    }
    
    public boolean validarUsuario(String usuario, String senha){
        boolean aux = false;
        for(int i = 0; i < conUsr; i++){
            if(msUsuarios[i].getIdUsuário().equals(usuario)&& msUsuarios[i].getSenha().equals(senha)){
                return true;    
            }
        }
        return false;
    }
    
    public int posicaoUsuario(String usuario){
        for(int i = 0; i < conUsr; i++){
            if(msUsuarios[i].getIdUsuário().equals(usuario)){
                return i;    
            }
        }
        return -1;
    }
    
    public int posicaoProduto(String produto){
        for(int i = 0; i < conPro; i++){
            if(msProdutos[i].getIdProduto().equals(produto)){
                return i;    
            }
        }
        return -1;
    }
    
    public String adicionarUsuario(Usuario mUsuario){
        if(conUsr == maxUsr){
            return"Não é possível cadastrar usuários (máximo atingido)";
        }
        msUsuarios[conUsr] = mUsuario;
        conUsr++;
        return"Usuário cadastrado com sucesso!";
    }
    
    public String adicionarProduto(Produto mProduto){
        if(conPro == maxPro){
            return"Não é possível cadastrar produtos (máximo atingido)";
        }
        msProdutos[conPro] = mProduto;
        conPro++;
        return"Produto cadastrado com sucesso!";
    }
    
    public String editarUsr(Usuario mUsuario, int pos){
        msUsuarios[pos].setNome(mUsuario.getNome());
        msUsuarios[pos].setSobrenome(mUsuario.getSobrenome());
        msUsuarios[pos].setSenha(mUsuario.getSenha());
        msUsuarios[pos].setPerfil(mUsuario.getPerfil()); 
        return"Usuário editado com sucesso!";
    }
    
    public String editarPro(Produto mProduto, int pos){
        msProdutos[pos].setDescricao(mProduto.getDescricao());
        msProdutos[pos].setPreco(mProduto.getPreco());; 
        return"Produto editado com sucesso!";
    }
     
    public String deletarUsuario(int pos){
        for(int i = pos; i < conUsr - 1; i++){
            msUsuarios[i] = msUsuarios[i + 1];
        }
        conUsr--;
        return"Deletado com sucesso!";
    }
    
    public String deletarProduto(int pos){
        for(int i = pos; i < conPro - 1; i++){
            msProdutos[i] = msProdutos[i + 1];
        }
        conPro--;
        return"Deletado com sucesso!";
    }
    public void salvarTudo(){
        salvarUsuarios();
        salvarProdutos();
    }
    
    public void salvarUsuarios(){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/usuarios.txt");
            pw = new PrintWriter(fw);
            
            for(int i = 0; i < conUsr; i++){
                pw.println(msUsuarios[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fw != null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void salvarProdutos(){
     FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/produtos.txt");
            pw = new PrintWriter(fw);
            
            for(int i = 0; i < conPro; i++){
                pw.println(msProdutos[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fw != null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }    
    }
}