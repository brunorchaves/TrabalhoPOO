package trabalho_1_PCII;
import java.util.Scanner; //importa classe que possui recursos
import java.util.Arrays;
/*
		1.Adicionar um produto
		2.Encontrar o produto com o maior preço de venda
		3.Encontrar o produto com a maior quantidade disponível no estoque
		4.Encontrar um dado produto através do seu código de identificação
		5.Alterar o preço de venda de um dado produto
		6.Listar todos os produtos pelo nome em ordem alfabética
		7.Sair
	*/
public class Menu 
{
	private int opcao =0;
	private	String voltaMenu;
	
	static int ID = 0;
	int quantidadeDeProdutos=0;
	Scanner in = new Scanner (System.in);
	Scanner stringScan = new Scanner (System.in);
	Produto prod[]= new Produto[100];//Instancia de produto
	static int maiorValoVenda = 0, IDmaiorValor=0,maiorQuantidade =0;
	public Menu() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public void loopMenu()
	{
		//int contadorProdutos=0;
		//int codigoID;
		
		String nomeProduto;
		int quantidade;
		int precoVenda;
		String info;
		int indice =0;
		
		while(opcao!=7)
		{
			opcao = OpcoesMenu();
			switch(opcao)
			{
				case 1:
					
					System.out.println("Opcao 1 selecionada ");
					System.out.println("Adicione um novo produto: ");
					System.out.println("Digite o nome do novo produto:\n ");
					nomeProduto = stringScan.nextLine();
					System.out.println("Digite a quantidade do novo produto:\n ");
					quantidade = in.nextInt();
					System.out.println("Digite o precoVenda do novo produto:\n ");
					precoVenda = in.nextInt();
					System.out.println("\nDigite a descricao do novo produto:\n ");
					info = stringScan.nextLine();
					prod[ID]=new Produto(ID,nomeProduto,quantidade,precoVenda,info);
					
					
					//Testar
					indice = prod[ID].getID() ;
					nomeProduto =prod[ID].getNome();
					quantidade = prod[ID].getQuantidade();
					precoVenda = prod[ID].getPrecoVenda();
					info =		 prod[ID].getInfo();
					System.out.printf("\n Indice %d",indice);
					System.out.printf("\n Nome %s",nomeProduto);
					System.out.printf("\n quantidade %d",quantidade);
					System.out.printf("\n precoVenda %d",precoVenda);
					System.out.printf("\n info %s",info);
					ID ++;
					//loja.adicionaProduto();
					break;
				case 2:
					System.out.println("\nOpcao 2 selecionada ");
					quantidadeDeProdutos = 0;
					for(int i=0;i<prod.length;i++) 
					{
						if(prod[i]!=null) {
							quantidadeDeProdutos++;
						}
					}
					System.out.printf("\nQuantidade Produtos: %d",quantidadeDeProdutos);

					System.out.println("\nO produto de maior preco de venda e o : ");
					
					for(int i = 0; i< quantidadeDeProdutos; i++)
					{
						int precoVendaAtual = prod[i].getPrecoVenda();
						if(precoVendaAtual>= maiorValoVenda)
						{
							maiorValoVenda = precoVendaAtual;
							IDmaiorValor = i;
						}
						
					}
					nomeProduto = prod[IDmaiorValor].getNome();
					System.out.printf("\n %s ",nomeProduto);
					break;
				case 3:
					System.out.println("Opcao 3 selecionada ");
					quantidadeDeProdutos = 0;
					for(int i=0;i<prod.length;i++) 
					{
						if(prod[i]!=null) {
							quantidadeDeProdutos++;
						}
					}
					System.out.printf("\nQuantidade Produtos: %d",quantidadeDeProdutos);

					System.out.println("\nO produto com maior quantidade disponivel e o : ");
					
					for(int i = 0; i< quantidadeDeProdutos; i++)
					{
						int quantidaDispAtual = prod[i].getQuantidade();
						if(quantidaDispAtual>= maiorQuantidade)
						{
							maiorQuantidade = quantidaDispAtual;
							IDmaiorValor = i;
						}
						
					}
					nomeProduto = prod[IDmaiorValor].getNome();
					
					System.out.printf("\n %s (Qt. %d)",nomeProduto,maiorQuantidade);
					break;
				case 4:
					quantidadeDeProdutos = 0;
					for(int i=0;i<prod.length;i++) 
					{
						if(prod[i]!=null) {
							quantidadeDeProdutos++;
						}
					}
					if(quantidadeDeProdutos != 0)
					{
						System.out.println("Opcao 4 selecionada ");
						System.out.println("De o codigo do produto para mostra-lo:");
						indice = prod[ID].getID() ;
						nomeProduto =prod[ID].getNome();
						quantidade = prod[ID].getQuantidade();
						precoVenda = prod[ID].getPrecoVenda();
						info =		 prod[ID].getInfo();
						System.out.printf("\n Indice %d",indice);
						System.out.printf("\n Nome %s",nomeProduto);
						System.out.printf("\n quantidade %d",quantidade);
						System.out.printf("\n precoVenda %d",precoVenda);
						System.out.printf("\n info %s",info);
					}
					else
					{
						System.out.println("Ainda n�o h� produtos");
					}
					break;
				case 5:
					quantidadeDeProdutos = 0;
					for(int i=0;i<prod.length;i++) 
					{
						if(prod[i]!=null) {
							quantidadeDeProdutos++;
						}
					}
					if(quantidadeDeProdutos != 0)
					{
						System.out.println("\nEntre com o Id do produto: ");
						indice = in.nextInt();
						System.out.println("\nDigite o novo valor do produto: ");
						precoVenda =in.nextInt();
						prod[indice].setPrecoVenda(precoVenda);
						System.out.println("\nAtualizacao produto: ");
						indice = prod[indice].getID() ;
						nomeProduto =prod[indice].getNome();
						quantidade = prod[indice].getQuantidade();
						precoVenda = prod[indice].getPrecoVenda();
						info =		 prod[indice].getInfo();
						System.out.printf("\n Indice %d",indice);
						System.out.printf("\n Nome %s",nomeProduto);
						System.out.printf("\n quantidade %d",quantidade);
						System.out.printf("\n precoVenda %d",precoVenda);
						System.out.printf("\n info %s",info);
					}
					else
					{
						System.out.println("\nAinda nao ha produtos");
					}
					break;
				case 6:
					System.out.println("Opcao 6 selecionada ");
					quantidadeDeProdutos = 0;
					for(int i=0;i<prod.length;i++) 
					{
						if(prod[i]!=null) {
							quantidadeDeProdutos++;
						}
					}
					if(quantidadeDeProdutos != 0)
					{
						String[] arr= {"z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z"};
						for(int i = 0; i< quantidadeDeProdutos; i++)
						{
							nomeProduto = prod[i].getNome();
							arr[i]=nomeProduto;
						}
						// Sorts arr[] in ascending order
						Arrays.sort(arr);/*
						System.out.printf("Array em ordem[] : \n%s\n\n",
										Arrays.toString(arr));*/
						for(int i = 0; i< quantidadeDeProdutos; i++)
						{
							
							System.out.printf("\n %d )) ",i+1);
							System.out.println(arr[i]);

						}
						
					}
					else
					{
						System.out.println("\nAinda nao ha produtos");
					}
					break;
					
				case 7:
					System.out.println("Voce saiu do menu  ");
					break;
				default:
					System.out.println("Digite uma opcao valida ");
					break;	
			}
			if(opcao !=7)
			{
				System.out.println("\nDigite qualquer letra e aperter enter para voltar ao menu ");
				voltaMenu = stringScan.nextLine();
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
