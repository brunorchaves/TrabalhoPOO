package trabalho_1_PCII;
import java.util.Arrays;
public class Produto 
{
	private int codigoID;
	private String nomeProduto;
	private int quantidade;
	private int precoVenda;
	private String info;
	//Construtor
	public Produto(int codigoID ,String nome, int quantidade,int precoVenda,String info)
	{
		this.codigoID=codigoID;
		this.nomeProduto  = nome;
		this.quantidade = quantidade;
		this.precoVenda = precoVenda;
		this.info = info;
	}
	//Metodos de leitura
	public int getID() 
	{
		return codigoID;
	}
	public String getNome() 
	{
		return nomeProduto;
	}
	public int getQuantidade() 
	{
		return quantidade;
	}
	public int getPrecoVenda() 
	{
		return precoVenda;
	}
	public String getInfo() 
	{
		return info;
	}
	//Metodos de alteracao
	public void setID(int codigoID) 
	{
		this.codigoID = codigoID;
	}
	public void setNome(String nome) 
	{
		this.nomeProduto  = nome;
	}
	public void setQuantidade(int quantidade) 
	{
		this.quantidade = quantidade;
	}
	public void setPrecoVenda(int precoVenda) 
	{
		this.precoVenda = precoVenda;
	}
	public void setInfo(String info) 
	{
		this.info  = info;
	}

}
