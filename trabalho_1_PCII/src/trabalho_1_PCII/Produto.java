package trabalho_1_PCII;

public class Produto 
{
	
	private int codigoID;
	private String nomeProduto;
	private int quantDisp;
	private int precoVenda;
	private String descricao;
	//Construtor
	public Produto(int codigo, String nome, int quantidade,int valorVenda,String info)
	{
		 codigoID = codigo;
		 nomeProduto  = nome;
		 quantDisp = quantidade;
		 precoVenda = valorVenda;
		 descricao = info;
	}
	//Metodos de alteracao
	public void alterarPreco(int valorVenda)
	{
		precoVenda =valorVenda;
	}
	//Metodos de leitura
	public int getCodigoID()
	{
		return codigoID;
	}
	public String getNome()
	{
		return nomeProduto;
	}
	public int getQuantDispo()
	{
		return quantDisp;
	}
	public int valorVenda()
	{
		return precoVenda;
	}
	public String getDescricao()
	{
		return descricao;
	}
}
