package trabalho_1_PCII;

import java.util.Arrays;

public class Loja 
{

	private Produto[] produtos;
	private int quantidadeDeProdutos;
	
	Loja(Produto[] produtos)
	{
		quantidadeDeProdutos=0;
		if(produtos!=null) 
		{
			for(int i=0;i<produtos.length;i++) 
			{
				if(produtos[i]!=null) 
				{
					adicionaProduto(produtos[i]);
				}
			}
		}
	}
	
	public void adicionaProduto(Produto produto) 
	{
		if(produto!=null) 
		{
			Produto[] produtosAux=new Produto[quantidadeDeProdutos+1];
			for(int i=0;i<quantidadeDeProdutos;i++) 
			{
				produtosAux[i]=produtos[i];
			}
			produtosAux[quantidadeDeProdutos]=produto;
			produtos=produtosAux;
			quantidadeDeProdutos++;
			ordenaProdutosPorNome();
		}
		
	}
	
	public void removeProdutoPorID(int id) {
		Produto[] produtosAux=new Produto[quantidadeDeProdutos];
		for(int i=0,j=0;i+j<quantidadeDeProdutos;i++) {
			if(produtos[i+j].getCodigoID()==id) {
				j++;
			}
			if(i+j>=quantidadeDeProdutos) {
				break;
			}
			produtosAux[i]=produtos[i+j];
		}
		quantidadeDeProdutos--;
		produtos=produtosAux;
	}
	
	public Produto pesquisaProdutoPorID(int id) 
	{
		for(int i=0;i<quantidadeDeProdutos;i++) 
		{
			if(produtos[i].getCodigoID()==id) 
			{
				return produtos[i];
			}
		}
		return null;
	}
	
	private void ordenaProdutosPorNome() 
	{
		Arrays.sort(produtos, (Produto p1, Produto p2) -> 
		{
			if (p1.getNome().compareTo(p2.getNome())>0) return 1;
			if (p1.getNome().compareTo(p2.getNome())<0) return -1;
			return 0;
		});
	}
	
	public Produto[] getProdutos() 
	{
		return produtos;
	}
	
	public void setProdutos(Produto[] produtos) 
	{
		for(int i=0;i<produtos.length;i++) 
		{
			adicionaProduto(produtos[i]);
		}
	}
	
	public int getQuantidadeDeProdutos() 
	{
		return quantidadeDeProdutos;
	}
	
	public void AlteraProdutoNoId(int id, Produto produto) 
	{
		if(produto!=null) 
		{
			int indexDoId=achaIndexProdutoPeloId(id);
			if(indexDoId!=-1) {
				produtos[indexDoId]=produto;
				ordenaProdutosPorNome();
			}
		}	
	}
	
	private int achaIndexProdutoPeloId(int id) 
	{
		for(int i=0;i<quantidadeDeProdutos;i++) 
		{
			if(produtos[i].getCodigoID()==id) 
			{
				return i;
			}
		}
		return -1;
	}
	
	public Produto getProduto(int i)
	{
		if(i>0&&i<quantidadeDeProdutos)
		{
			return produtos[i];
		}
		return null;
	}
	
	public void setProduto(int i,Produto produto)
	{
		if(i>0&&i<quantidadeDeProdutos&&produto!=null)
		{
			produtos[i]=produto;
		}
	}
	
	Loja()
	{
		quantidadeDeProdutos=0;
	}
}
