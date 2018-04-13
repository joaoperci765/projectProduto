package produtos;
import java.util.ArrayList; 
import java.util.List;
public class Produtos {
	
    private List<String> listaDeProdutos =  new ArrayList<String>();
 
    private String nomeProduto;
    private Float valorProduto;
    private Float qtdProduto;
    private String valorProdutoFinal;
    private String qtdProdutoFinal;
    
	public String getQtdProdutoFinal() {
		return qtdProdutoFinal;
	}
	public void setQtdProdutoFinal(Float qtdProdutoFinal) {
		this.qtdProdutoFinal =  Float.toString(qtdProduto);
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Float getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(Float valorProduto) {
		this.valorProduto = valorProduto;
	}
	public Float getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(Float qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	
    public List<String> getListaDeProdutos() {
		return listaDeProdutos;
    }
    public String getValorProdutoFinal() {
		return valorProdutoFinal;
	}
	public void setValorProdutoFinal(String valorProdutoFinal) {
		this.valorProdutoFinal = Float.toString(valorProduto);
	}
	public void setListaDeProdutos(List<String> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	
		listaDeProdutos.add(getNomeProduto());
		listaDeProdutos.add(getValorProdutoFinal());
		listaDeProdutos.add(getQtdProdutoFinal());
	}
	
}
