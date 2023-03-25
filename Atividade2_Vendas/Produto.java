
public class Produto {
	private int id;
    private String nome;
    private double preco;
    private int quantEstoque;


    public Produto(String nome, double preco, int quantEstoque, int id){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
        this.id = id;
    }

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void setQuantEstoque(int quantEstoque){
        this.quantEstoque = quantEstoque;
    }

    public int getQuantEstoque(){
        return quantEstoque;
    }

    public void venderProduto(){
        this.quantEstoque = quantEstoque - 1;
    }

    public void listarProduto(){
    	System.out.println("");
        System.out.println("ID: " +getId());
        System.out.println("Nome: " +getNome());
        System.out.println("Preco: "+getPreco());
        System.out.println("Quantidade no estoque: "+getQuantEstoque());

    }
}

