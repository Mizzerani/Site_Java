package Classes;

public class Usuario {
    private String idUsuário;
    private String nome;
    private String sobrenome;
    private String senha;
    private int perfil;

    public Usuario(String idUsuário, String nome, String sobrenome, String senha, int perfil) {
        this.idUsuário = idUsuário;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(String idUsuário) {
        this.idUsuário = idUsuário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    
        
}
