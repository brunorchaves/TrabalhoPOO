package trabalho_1_PCII;
import java.util.Scanner; //importa classe que possui recursos

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
		Menu menu = new Menu();
		Scanner in = new Scanner (System.in);
		Produto a;
		//**
		a = new Produto(42,"asd",5,4,"asd");
		codigo = a.getCodigoID();
		//System.out.printf("codigoID: %d",codigo);	
		//**
		menu.loopMenu();
	}
}
