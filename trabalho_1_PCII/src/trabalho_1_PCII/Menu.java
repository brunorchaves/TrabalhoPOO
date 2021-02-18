package trabalho_1_PCII;
import java.util.Scanner; //importa classe que possui recursos
import java.util.Arrays;

//********************Observacao*********************
/*
Aparentemente o sistema esta entendendo floats na "maneira" brasileira
,ou seja , o numero 1.500 aqui é interpretado como "mil e quinhentos"
ja o numero 1,5000 é interpretado como "um(inteiro) e 5(decimal)"
*/
/*
		Menu:
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
	static float maiorValoVenda = 0;
	static int IDmaiorValor=0,maiorQuantidade =0;
	/*********************************************************************
	* @fn      Menu
	*
	* @brief   Construtor menu
	*
	* @param   none
	*
	* @return  none
	*/
	public Menu() 
	{
		// TODO Auto-generated constructor stub
	}
	
	/*********************************************************************
	* @fn      loopMenu
	*
	* @brief   loop que roda as funcoes do menu
	*
	* @param   none
	*
	* @return  none
	*/
	public void loopMenu()
	{
		
		
		String nomeProduto;
		int quantidade;
		float precoVenda;
		String info;
		int indice =0;
		
		while(opcao!=7)
		{
			opcao = OpcoesMenu();
			switch(opcao)
			{
				case 1:
					//1.Adicionar um produto -> Pede as informações necessárias p/ o construtor
					System.out.println("Opcao 1 selecionada ");
					System.out.println("Adicione um novo produto: ");
					System.out.println("Digite o nome do novo produto:\n ");
					nomeProduto = stringScan.nextLine();
					System.out.println("Digite a quantidade do novo produto:\n ");
					quantidade = in.nextInt();
					System.out.println("Digite o precoVenda do novo produto:\n ");
					precoVenda = in.nextFloat();
					System.out.println("\nDigite a descricao do novo produto:\n ");
					info = stringScan.nextLine();
					prod[ID]=new Produto(ID,nomeProduto,quantidade,precoVenda,info);
					
					
					//Imprime na tela os atritutos do produto criado
					indice = prod[ID].getID() ;
					nomeProduto =prod[ID].getNome();
					quantidade = prod[ID].getQuantidade();
					precoVenda = prod[ID].getPrecoVenda();
					info =		 prod[ID].getInfo();
					System.out.printf("\n Indice %d",indice);
					System.out.printf("\n Nome %s",nomeProduto);
					System.out.printf("\n quantidade %d",quantidade);
					System.out.printf("\n precoVenda %f",precoVenda);
					System.out.printf("\n info %s",info);
					ID ++;//Incrementa o código ID para o próximo produto automaticamente
				
					break;
				case 2:
					//2.Encontrar o produto com o maior preço de venda
					//Identifica quantidadde de produtos cadastrados
					//Faz um loop para analisar qual tem o maior valor de venda
					System.out.println("\nOpcao 2 selecionada ");
					quantidadeDeProdutos = contaProdutos(prod);
				
					if(quantidadeDeProdutos != 0)
					{
						System.out.printf("\nQuantidade Produtos: %d",quantidadeDeProdutos);

						System.out.println("\nO produto de maior preco de venda e o : ");
						
						for(int i = 0; i< quantidadeDeProdutos; i++)
						{
							float precoVendaAtual = prod[i].getPrecoVenda();
							if(precoVendaAtual>= maiorValoVenda)
							{
								maiorValoVenda = precoVendaAtual;
								IDmaiorValor = i;
							}
							
						}
						nomeProduto = prod[IDmaiorValor].getNome();
						System.out.printf("\n %s ",nomeProduto);
					}
					else
					{
						System.out.println("Ainda nao ha produtos");
					}
					break;
				case 3:
					//3.Encontrar o produto com a maior quantidade disponível no estoque
					//Identifica quantidadde de produtos cadastrados
					//Faz um loop para analisar qual tem a maior quantidade disponível no estoque
					System.out.println("Opcao 3 selecionada ");
					quantidadeDeProdutos = contaProdutos(prod);

					if(quantidadeDeProdutos != 0)
					{
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
					}
					else
					{
						System.out.println("Ainda nao ha produtos");
					}
					break;
				case 4:
					//4.Encontrar um dado produto através do seu código de identificação
					//Identifica se já existem produtos cadastrados
					//Usa os metodos get para acessar os atributos do produto do ID pedido
				
					quantidadeDeProdutos = contaProdutos(prod);

					if(quantidadeDeProdutos != 0)
					{
						System.out.println("Opcao 4 selecionada ");
						
						indice = -1;
						do 
						{	
							System.out.println("De o codigo do produto para mostra-lo:");
							indice = in.nextInt();
							if(indice<0 || indice > quantidadeDeProdutos)
								System.out.println("\nEsse valor nao existe no estoque: ");
						}while(indice<0 || indice > quantidadeDeProdutos);
						nomeProduto =prod[indice].getNome();
						quantidade = prod[indice].getQuantidade();
						precoVenda = prod[indice].getPrecoVenda();
						info =		 prod[indice].getInfo();
						System.out.printf("\n Indice %d",indice);
						System.out.printf("\n Nome %s",nomeProduto);
						System.out.printf("\n quantidade %d",quantidade);
						System.out.printf("\n precoVenda %s",precoVenda);
						System.out.printf("\n info %s",info);
					}
					else
					{
						System.out.println("Ainda nao ha produtos");
					}
					break;
				case 5:
					// 5.Alterar o preço de venda de um dado produto
					//Identifica se já existem produtos cadastrados
					//Usa o metodo set para alterar o preco de venda do produto
					//com o ID especificado
					quantidadeDeProdutos = contaProdutos(prod);

					if(quantidadeDeProdutos != 0)
					{
						System.out.println("\nEntre com o Id do produto: ");
						indice = -1;
						do 
						{	
							System.out.println("De o codigo do produto para mostra-lo:");
							indice = in.nextInt();
							if(indice<0 || indice > quantidadeDeProdutos)
								System.out.println("\nEsse valor nao existe no estoque: ");
						}while(indice<0 || indice > quantidadeDeProdutos);
						
						nomeProduto =prod[indice].getNome();
						System.out.printf("\n Nome %s",nomeProduto);
						System.out.println("\nDigite o novo valor do produto: ");
						precoVenda =in.nextFloat();
						prod[indice].setPrecoVenda(precoVenda);
						System.out.println("\nAtualizacao produto: ");
						indice = prod[indice].getID() ;
						quantidade = prod[indice].getQuantidade();
						precoVenda = prod[indice].getPrecoVenda();
						info =		 prod[indice].getInfo();
						System.out.printf("\n Indice %d",indice);
						System.out.printf("\n Nome %s",nomeProduto);
						System.out.printf("\n quantidade %d",quantidade);
						System.out.printf("\n precoVenda %f",precoVenda);
						System.out.printf("\n info %s",info);
					}
					else
					{
						System.out.println("\nAinda nao ha produtos");
					}
					break;
				case 6:
					// 6.Listar todos os produtos pelo nome em ordem alfabética
					//Usa o medo sort para ordenar os produtos em ordem alfabetica
					System.out.println("Opcao 6 selecionada ");
					quantidadeDeProdutos = contaProdutos(prod);
					
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
				System.out.println("\n Aperte enter para voltar ao menu ");
				voltaMenu = stringScan.nextLine();
			}
		}
	}
	/*********************************************************************
	* @fn      OpcoesMenu
	*
	* @brief   loop que roda as funcoes do menu
	*
	* @param   Metodo que gera o texto com as opcoes do menu, chamada na 
	*		   funcao do menu
	*
	* @return  opcao
	*/
	public static int OpcoesMenu()
	{
		int opcao = 0;
		Scanner in = new Scanner (System.in);
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1.Adicionar um produto");
			System.out.println("2.Encontrar o produto com o maior preco de venda");
			System.out.println("3.Encontrar o produto com a maior quantidade disponivel no estoque");
			System.out.println("4.Encontrar um dado produto atravess do seu codigo de identificação");
			System.out.println("5.Alterar o preco de venda de um dado produto");
			System.out.println("6.Listar todos os produtos pelo nome em ordem alfabetica");	
			System.out.println("7.Sair");
			opcao = in.nextInt();
		
		return opcao;
	}
	public static int contaProdutos(Produto prod[])
	{
		int quantidadeDeProdutos = 0;
		for(int i=0;i<prod.length;i++) 
		{
			if(prod[i]!=null) 
			{
				quantidadeDeProdutos++;
			}
		}
		return quantidadeDeProdutos;
	}
}
