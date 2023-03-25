
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			// Criando lista de produtos 
	        List<Produto> produtos = new ArrayList<Produto>();
	        // instanciando scanner para conseguir ler dados digitados 
	        Scanner entrada = new Scanner(System.in);
	        
	        // Criando instancias de produto 
	        Produto prodA = new Produto("Batata frita", 5, 10, 1);
	        Produto prodB = new Produto("Onion Rings", 10, 5, 2);
	        Produto prodC = new Produto("X-bacon", 30, 60, 3);
	        Produto prodD = new Produto("X-salada", 27, 50, 4);
	        Produto prodE = new Produto("Milkshake", 19, 80, 5);
	        
	        
	        // Adicionando produtos à lista de produtos 
	        produtos.add(prodA);
	        produtos.add(prodB);
	        produtos.add(prodC);
	        produtos.add(prodD);
	        produtos.add(prodE);
	        
	        int i; 
	        //variavel para for
	        int n = produtos.size(); 
	        // armazena o tamanho da lista 
	        boolean encontrou = false; 
	        // variavel para verificar se existe o produto na lista 
	        boolean pagou = false; 
	        // variavel para verificar se foi pago o valor certo pelo produto 
	        boolean vazia = false; 
	        // verifica se a lista esta vazia 


	          
	      try{
	    	  	if(n > 0) { 
	    	  		vazia = false;
	    	  		//listando produtos 
			        System.out.println("Produtos disponiveis: ");
			        for(i = 0; i < n; i++){
			            produtos.get(i).listarProduto();
			        }
			         //vazia = false; 
			         System.out.println("");
			         //lendo o codigo e o preco do produto que o usuario deseja comprar 
			         System.out.println("Digite o código do produto que voce seja comprar: ");
			         int codProd = entrada.nextInt();
			         System.out.println("Digite o valor pago: ");
			         double precoProd = entrada.nextDouble();
			         
		 
		         try {
		        	 // percorrendo a lista para verificar as informacoes digitadas pelo usuario 
		             for (i = 0; i < n; i++) {
		            	 // Se exitir algum produto na lista que corresponda ao que foi digitado pelo usuario 
		                 if (produtos.get(i).getId() == codProd) {
		                     encontrou = true;
		                 }
		                 // se o valor digitado corresponde ao preco do produto 
		                 if(produtos.get(i).getPreco() == precoProd){
		                     pagou = true;
		                 }
		                 // se todas as informacoes digitadas estao corretas, entao a venda pode ser realiza 
		                 if(produtos.get(i).getId() == codProd && produtos.get(i).getPreco() == precoProd) {
		                	 produtos.get(i).venderProduto(); // produto e vendido e e retirada uma unidade do estoque 
		                     System.out.println("Venda finalizada com sucesso! A quantidade no estoque agora e: " + produtos.get(i).getQuantEstoque());
		                 }
		             }
		              // definindo excecao caso nao exista nenhum produto na lista que corresponda ao que foi digitado 
		             if(encontrou == false){
		                 throw new Exception("Erro na venda. O código digitado não corresponde a nenhum produto cadastrado. Tente novamente");
		             }
		             // definindo excecao caso o usuario digitou um valor diferente do preco do produto 
		             if(pagou == false){
		                 throw new Exception("Erro na venda. valor digitado é diferente do preco do produto. Tente novamente");
		             }
		         }catch (Exception e){ 
		        	 //recebe a excecao 
		             System.out.println(e.getMessage());
		         }
	      }
	    	 // se a lista esta vazia, define excecao 
	        if(vazia == true){
                throw new Exception("Nao foi possivel listar os produtos, a lista esta vazia.");
            }
        }catch (Exception e){ 
        	// recebe a excecao definida caso a lista esteja vazia 
            System.out.println(e.getMessage());
        }
	      }
	}
