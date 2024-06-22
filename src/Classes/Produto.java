package Classes;

public class Produto {
    private String idProduto;
    private String descricao;
    private int preco;

    public Produto(String idProduto, String descricao, int preco) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.preco = preco;
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

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}