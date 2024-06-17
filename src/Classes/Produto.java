package Classes;

public class Produto {
    private String idProduto;
    private String descricao;
    private String anotacao;
    private int preco;
    private int taxa;

    public Produto(String idProduto, String descricao, int preco, int taxa, String anotacao) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.anotacao = anotacao;
        this.preco = preco;
        this.taxa = taxa;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }
    
     @Override
    public String toString(){
        return idProduto + "|"
               + descricao + "|"
               + preco + "|"
               + taxa + "|"
               + anotacao;
    }
}
