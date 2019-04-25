package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        //Scanner scanner = new Scanner(System.in);
        CadastroLivro livro1 = new CadastroLivro();
        CadastroLivro livro2 = new CadastroLivro();
        List<CadastroLivro> livros = new ArrayList<>();
        Sistema sistema = new Sistema();

        livro1.setCodLivro(1);
        livro1.setTitulo("HP");
        livro1.setAutor("Emma");
        livro1.setQtda(4);
        livro1.setCodIsbn(12345);
        livro1.setAnoLancamento("2019");
        livro1.setPreco(30);

        livro2.setCodLivro(2);
        livro2.setTitulo("HP2");
        livro2.setAutor("Emma");
        livro2.setQtda(4);
        livro2.setCodIsbn(12345);
        livro2.setAnoLancamento("2019");
        livro2.setPreco(30);


        sistema.cadastrar(livro1);
        sistema.cadastrar(livro2);
        sistema.consultar(2);
        sistema.vender(1);
        sistema.consultar(1);

//        int menu = 0;
//
//        System.out.println("Selecione a opção desejada");
//        System.out.println("1 - Cadastrar Livros \n2 - Consultar Livro \n3- Vendas");
//        menu = scanner.nextInt();
//
//        if (menu == 1) {
//
//
//            int op = 0;
//
//            System.out.println("Escolha a opção 1 para cadastrar e 0 para voltar");
//            op = scanner.nextInt();
//            while (op != 0) {
//
//                System.out.println("Bem vindo a tela de cadastro");
//                System.out.println("Digite o código do livro");
//                livro.setCodLivro(scanner.nextInt());
//                System.out.println("Digite o nome do Livro: ");
//                livro.setTitulo(scanner.next());
//                System.out.println("Digite o nome do Autor");
//                livro.setAutor(scanner.next());
//                System.out.println("Digite o ano de lançamento: ");
//                livro.setAnoLancamento(scanner.next());
//                System.out.println("Digite o codigo ISBN");
//                livro.setCodIsbn(scanner.nextInt());
//                System.out.println("Informe a quantidade de livros: ");
//                livro.setQtda(scanner.nextInt());
//                System.out.println("Digite o valor do livro");
//                livro.setPreco(scanner.nextFloat());
//                livros.add(livro);
//
//                livro = new CadastroLivro();
//
//
//                System.out.println("Digite a opção 1 para cadastrar e 0 para voltar");
//                op = scanner.nextInt();
//            }
//        } else if (menu == 2) {
//            System.out.println("Consultar livro por código");
//
//        } else if (menu == 3) {
//            System.out.println("Vendas");
//        } else {
//            System.out.println("Opção invalida !");
//        }



    }

}

