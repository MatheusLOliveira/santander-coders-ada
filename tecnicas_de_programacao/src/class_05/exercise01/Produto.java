package class_05.exercise01;

public class Produto {

    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(String name, Double price, Integer quantity) {
        this.nome = name;
        this.preco = price;
        this.quantidade = quantity;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}