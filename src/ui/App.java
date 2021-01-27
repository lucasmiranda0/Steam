package ui;

import java.util.Scanner;
import comunicacao.Fachada;
import negocio.Jogos;
import negocio.Usuario;

public class App {

    private static Fachada fachada = new FachadaUI();
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[]args) {
        menu();
    }

    public static void menu() {
        fachada.iniciaContador();
        int opcao;
        do {
            System.out.println("1- Cadastrar na Steam");
            System.out.println("2- Exibir jogos da bibloteca");
            System.out.println("3- Adicionar jogo a biblioteca");
            System.out.println("4- Adicionar jogo no carrinho");
            System.out.println("5- Exibir carrinho");
            System.out.println("6- Depositar");
            System.out.println("7- Pagar");
            System.out.println("8- Fechar Menu");
            System.out.println("Escolha a opção desejada: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = input.nextLine();
                    System.out.println("Digite seu id: ");
                    int id = input.nextInt();
                    Usuario u = new Usuario(nome, id);
                    fachada.addUsuario(u);
                    break;
                case 2:
                    fachada.exibirCarrinho();
                    break;
                case 3:
                    System.out.println("Digite o nome do jogo: ");
                    String nomeJ = input.nextLine();
                    System.out.println("Digite o id do jogo: ");
                    int idJ = input.nextInt();
                    System.out.println("Digite o preço: ");
                    double preco = input.nextDouble();
                    Jogos j = new Jogos(nomeJ, idJ, preco);
                    fachada.addJ(j);
                    break;
                case 4:
                    System.out.println("Digite o nome do jogo: ");
                    String nomeJ2 = input.nextLine();
                    System.out.println("Digite o id do jogo: ");
                    int idJ2 = input.nextInt();
                    System.out.println("Digite o preço: ");
                    double preco2 = input.nextDouble();
                    Jogos j2 = new Jogos(nomeJ2, idJ2, preco2);
                    fachada.addCarinho(j2);
                    break;
                case 5:
                    fachada.exibirCarrinho();
                    break;
                case 6:
                    System.out.println("Digite o ID: ");
                    int id3 = input.nextInt();
                    System.out.println("Digite o valor: ");
                    double valor3 = input.nextDouble();
                    fachada.depositar(id3, valor3);
                case 7:
                    System.out.println("Digite o nome: ");
                    String nome4 = input.nextLine();
                    System.out.println("Digite seu id: ");
                    int id4 = input.nextInt();
                    Usuario u4 = new Usuario(nome4, id4);
                    fachada.pagar(u4);
                    break;
                case 8:
                    fachada.finalizaContador();
                    System.out.println("Tempo que você utilizou a Steam: " + fachada.getTempo());
                    return;
                default:
                    System.out.println("");
            }
        } while (opcao != 8);
    }
}
