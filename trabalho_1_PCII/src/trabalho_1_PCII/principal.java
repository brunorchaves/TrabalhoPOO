package trabalho_1_PCII;

public class principal {
	
	/*Construtor do produto
	 codigoID = codigo;
	 nomeProduto  = nome;
	 quantDisp = quantidade;
	 precoVenda = valorVenda;
	 descricao = info;
	 */
	
	public static void main(String[] args) 
	{
		int codigo, quantidade, valorVenda;
		String nome,info;
		// TODO Auto-generated method stub
		Produto a;
		a = new Produto(42,"asd",5,4,"asd");
		codigo = a.getCodigoID();
		System.out.printf("codigoID: %d",codigo);
	}

}
