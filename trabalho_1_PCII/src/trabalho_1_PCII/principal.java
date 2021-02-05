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
		int opcao =0;
		Scanner in = new Scanner (System.in);
		Produto a;
		a = new Produto(42,"asd",5,4,"asd");
		codigo = a.getCodigoID();
		System.out.printf("codigoID: %d",codigo);
		opcao = menu();

		switch(opcao)
		{
			case 1:
				System.out.println("Opcao 1 selecionada ");
				break;
			case 2:
				System.out.println("Opcao 2 selecionada ");
				break;
			case 3:
				System.out.println("Opcao 3 selecionada ");
				break;
			case 4:
				System.out.println("Opcao 4 selecionada ");
				break;
			case 5:
				System.out.println("Opcao 5 selecionada ");
				break;
			case 6:
				System.out.println("Opcao 6 selecionada ");
				break;
			case 7:
				System.out.println("Opcao 7 selecionada ");
				break;
			default:
				break;	
		}
	}
	public static int menu()
	{
		int opcao = 0;
		Scanner in = new Scanner (System.in);
		while(opcao >= 0 && opcao <=7)
		{
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1.Adicionar um produto");
			System.out.println("2.Encontrar o produto com o maior preço de venda");
			System.out.println("3.Encontrar o produto com a maior quantidade disponível no estoque");
			System.out.println("4. Encontrar um dado produto através do seu código de identificação");
			System.out.println("5.Alterar o preço de venda de um dado produto");
			System.out.println("6.Listar todos os produtos pelo nome em ordem alfabética");	
			System.out.println("7.Sair");
			opcao = in.nextInt();
		}
		return opcao;
	}

}
