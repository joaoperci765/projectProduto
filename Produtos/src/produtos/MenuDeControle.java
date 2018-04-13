package produtos;
import java.util.ArrayList;    
import java.util.List;
import java.util.Scanner;
public class MenuDeControle {
	static Produtos produtos = new Produtos();
	static List<String> listaDeProdutos =  new ArrayList<String>();
	static Float valorTotal;
	static Scanner teclado = new Scanner(System.in);
	static Integer valorMenu = 0;
	static String valorProdutoString;
	static String qtdProdutoString;
	static String valorTotalString;

	public static void chamarMenu() {
	    System.out.println("#######################################\n#######################################"
				+"\n#######################################");
		System.out.println("INFORME:");
		System.err.println("############################\n############################\n");
    	System.err.println(             "MENU");
    	System.err.println(             "1-	INSERIR PRODUTO");
    	System.err.println(             "2- RELATORIO");
    	System.err.println(             "3- SAIR");
    	System.err.println("############################\n############################\n");
    	
    	valorMenu = teclado.nextInt();
    	
	}
	
	public static void main(String[] args) {
	    valorMenu = 0;
    	while (valorMenu !=3) {
    		    chamarMenu();
    		if (valorMenu == 1 ) {
    			inserirProdutos(listaDeProdutos);
    			chamarMenu();
    		}else if(valorMenu ==2) {
    			imprimirProdutos(listaDeProdutos);
    		    chamarMenu();
    		}else if (valorMenu ==3) {
    		   System.exit(0);
    		    chamarMenu();
    		}
    	}
 
   	}
    private static void inserirProdutos(List<String> listaDeProdutos){
    	
    	System.out.println("Informe o nome do Produto\n");
    	String nomeProduto = teclado.next();
    	System.out.println("Informe a quantidade do Produto\n");
    	Float qtdProdutoFinal = teclado.nextFloat();
    	System.out.println("Informe o valor do Produto\n");
    	Float valorProdutoFinal = teclado.nextFloat();
    	//Validando o tipo pra String p/ adicionar a lista
    	valorProdutoString = Float.toString(valorProdutoFinal);
    	qtdProdutoString = Float.toString(qtdProdutoFinal);
    	valorTotal = qtdProdutoFinal*valorProdutoFinal;
    	
    	listaDeProdutos.add(nomeProduto);
    	listaDeProdutos.add(valorProdutoString);
    	listaDeProdutos.add(qtdProdutoString);
    	
    }
    private static void imprimirProdutos(List<String> listaDeProdutos){
    	System.err.println("["+listaDeProdutos+valorTotal+"Valor Total="+valorTotal+"]");
    }
}	
  
