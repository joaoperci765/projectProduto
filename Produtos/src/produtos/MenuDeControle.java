package produtos;
import java.util.ArrayList;   
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MenuDeControle {
	static Produtos produtos = new Produtos();
	static List<String> listaDeProdutos =  new ArrayList<String>();
	static Float valorTotal;
	static Scanner teclado = new Scanner(System.in);
	static Integer valorMenu = 0;
	
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
    			inserirProdutos();
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
    private static void inserirProdutos(){
    
    	System.out.println("Informe o nome do Produto");
    	String nomeProduto = teclado.next();
    	System.out.println("Informe a quantidade do Produto");
    	Float qtdProduto = teclado.nextFloat();
    	System.out.println("Informe o valor do Produto");
    	Float valorProduto = teclado.nextFloat();
    	valorTotal = qtdProduto*valorProduto;
 
    }
    private static void imprimirProdutos(List<String> listaDeProdutos) {
		JOptionPane.showInputDialog(valorTotal);
		
	}
}	
  
