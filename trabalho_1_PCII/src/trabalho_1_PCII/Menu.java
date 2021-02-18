package trabalho_1_PCII;
import java.util.Scanner; //importa classe que possui recursos

public class Menu 
{
	private int opcao =0;
	private	String voltaMenu;
	Scanner in = new Scanner (System.in);
	public Menu() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public void loopMenu()
	{
		while(opcao!=7)
		{
			opcao = OpcoesMenu();
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
					System.out.println("Voc� saiu do menu  ");
					break;
				default:
					System.out.println("Digite uma opcao valida ");
					break;	
			}
			if(opcao !=7)
			{
				System.out.println("Digite qualquer letra e aperter enter para voltar ao menu ");
				voltaMenu = in.nextLine();
			}
		}
	}
	public static int OpcoesMenu()
	{
		int opcao = 0;
		Scanner in = new Scanner (System.in);
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1.Adicionar um produto");
			System.out.println("2.Encontrar o produto com o maior preço de venda");
			System.out.println("3.Encontrar o produto com a maior quantidade disponível no estoque");
			System.out.println("4. Encontrar um dado produto através do seu código de identificação");
			System.out.println("5.Alterar o preço de venda de um dado produto");
			System.out.println("6.Listar todos os produtos pelo nome em ordem alfabética");	
			System.out.println("7.Sair");
			opcao = in.nextInt();
		
		return opcao;
	}
}
