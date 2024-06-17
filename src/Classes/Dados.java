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
    private int maxCli = 100;
    private Usuario msUsuarios[] = new Usuario[maxUsr];
    private Produto msProdutos[] = new Produto[maxPro];
    private Cliente msClientes[] = new Cliente[maxCli];
    private int conUsr = 0;
    private int conPro = 0;
    private int conCli = 0;
    
    public Dados(){
        Usuario mUsuario;
            mUsuario = new Usuario("Mizzerani","Matheus","Carneiro Silva","123",1);
        msUsuarios[conUsr] = mUsuario;
        conUsr++;
        
        preencherUsuarios();
        
        Produto mProduto;
        mProduto = new Produto("7800","Ryzen 7 7800X3D",2650,0,"Processador AMD Ryzen 7 7800X3D, 5.0GHz Max Turbo, Cache 104MB, AM5, 8 Núcleos, Vídeo Integrado");
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("7950","Ryzen 9 7950X",3549,0,"Processador AMD Ryzen 9 7950X, 5.7GHz Max Turbo, Cache 80MB, AM5, 16 Núcleos, Vídeo Integrado");
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("14900","i9 14900KF",4000,0,"Processador Intel Core i9-14900KF, 14ª Geração, 6GHz Max Turbo, Cache 36MB, 24 Núcleos, 32 Threads, LGA1700");
        msProdutos[conPro] = mProduto;
        conPro++;
        
        Cliente mCliente;
        mCliente = new Cliente("1",1,"Maria Luiza","Macedo","Rua São Francisco", "62998543361",1,Utilidades.StringtoDate("2004/03/20"),Utilidades.StringtoDate("2024/06/16"));
        msClientes[conCli] = mCliente;
        conCli++;

        mCliente = new Cliente("2",1,"Elaine","Silveira Carneiro","Rua Costa Senna", "31976854499",2,Utilidades.StringtoDate("1970/10/20"),Utilidades.StringtoDate("2024/06/15"));
        msClientes[conCli] = mCliente;
        conCli++;
        
        mCliente = new Cliente("3",1,"Ivana","Palhares Carneiro","Rua Maria dos Santos", "11976654499",1,Utilidades.StringtoDate("1963/06/12"),Utilidades.StringtoDate("2024/06/14"));
        msClientes[conCli] = mCliente;
        conCli++;
    }
    
    public int numeroUsuarios(){
        return conUsr;
    }
    
    public int numeroProdutos(){
        return conPro;
    }
    
    public int numeroClientes(){
        return conCli;
    }
    
    public Usuario[]getUsuarios(){
        return msUsuarios;
    }
    
    public Produto[]getProdutos(){
        return msProdutos;
    }
    
    public Cliente[]getClientes(){
        return msClientes;
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
    
    public int posicaoCliente(String cliente){
        for(int i = 0; i < conCli; i++){
            if(msClientes[i].getIdCliente().equals(cliente)){
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
    
    public String adicionarCliente(Cliente mCliente){
        if(conCli == maxPro){
            return"Não é possível cadastrar o/a cliente (máximo atingido)";
        }
        msClientes[conCli] = mCliente;
        conCli++;
        return"Cliente cadastrado(a) com sucesso!";
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
        msProdutos[pos].setPreco(mProduto.getPreco());
        msProdutos[pos].setTaxa(mProduto.getTaxa());
        msProdutos[pos].setAnotacao(mProduto.getAnotacao()); 
        return"Produto editado com sucesso!";
    }
    
    public String editarCliente(Cliente mCliente, int pos){
        msClientes[pos].setIdCliente(mCliente.getIdCliente());
        msClientes[pos].setNome(mCliente.getNome());
        msClientes[pos].setSobrenome(mCliente.getSobrenome());
        msClientes[pos].setEndereco(mCliente.getEndereco());
        msClientes[pos].setTelefone(mCliente.getTelefone());
        msClientes[pos].setIdCidade(mCliente.getIdCidade());
        msClientes[pos].setDNascimento(mCliente.getDNascimento());
        msClientes[pos].setData(mCliente.getData());
        return"Cliente editado com sucesso!";
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
    
    public String deletarCliente(int pos){
        for(int i = pos; i < conCli - 1; i++){
            msClientes[i] = msClientes[i + 1];
        }
        conCli--;
        return"Cliente deletado com sucesso!";
    }
    
    public void salvarTudo(){
        salvarUsuarios();
        salvarClientes();
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
    
    public void salvarClientes(){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/clientes.txt");
            pw = new PrintWriter(fw);
            
            for(int i = 0; i < conCli; i++){
                pw.println(msClientes[i].toString());
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
    
        public void preencherClientes(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/usuarios.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            String idCliente;
            int idTipo;
            String Nome;
            String Sobrenome;
            String Endereco;
            String Telefone;
            int idCidade;
            Date DNascimento;
            Date Data;
            
            while((linha = br.readLine()) != null){
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idCliente = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idTipo = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Nome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Sobrenome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Endereco = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Telefone = aux;
                linha = linha.substring(pos + 1);
                linha = linha.substring(0, pos);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idCidade = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                DNascimento = new Utilidades.StringtoDate(aux);
                linha = linha.substring(pos + 1);
                
                Data = new Utilidades.StringtoDate(linha);
            // Erro: Existe ma classe "Utilidades.StringtoDate" que o sistema não está reconhecendo.
            // O que fazer?
                
                Cliente mCliente = new Cliente(idCliente, idTipo, Nome, Sobrenome, Endereco, Telefone, idCidade, DNascimento, Data);
                msClientes[conCli] = mCliente;
                conCli++;
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
    }
    
    public void preencherProdutos(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/produtos.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            String idProduto;
            String descricao;
            int preco;
            int taxa;
            String anotacao;
            
            while((linha = br.readLine()) != null){
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idProduto = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                descricao = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                preco = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                taxa = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                anotacao = aux;
                linha = linha.substring(pos + 1);
                
                Produto mProduto = new Produto(idProduto, descricao, preco, taxa, anotacao);
                msProdutos[conPro] = mProduto;
                conPro++;
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
    }
    
    public void preencherUsuarios(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/clientes.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            String idUsuario;
            String nome;
            String sobrenome;
            String senha;
            int perfil;
            
            while((linha = br.readLine()) != null){
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idUsuario = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                nome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                sobrenome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                senha = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                perfil = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                Usuario mUsuario = new Usuario(idUsuario, nome, sobrenome, senha, perfil);
                msUsuarios[conCli] = mUsuario;
                conCli++;
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
    }
}
