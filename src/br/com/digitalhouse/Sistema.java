package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    List<CadastroLivro> livros = new ArrayList<>();
    int x = 0;
    int estoque;

    public void consultar(int codigo) {

        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCodLivro() == codigo) {
                System.out.println("Código: " + livros.get(i).getCodLivro());
                System.out.println("Titulo: " + livros.get(i).getTitulo());
                System.out.println("Autor: " + livros.get(i).getAutor());
                System.out.println("Ano de Lançamento: " + livros.get(i).getAnoLancamento());
                System.out.println("Código ISBN: " + livros.get(i).getCodIsbn());
                System.out.println("Quantidade em estoque: " + livros.get(i).getQtda());
                System.out.println("Preço: " + livros.get(i).getPreco());

                i = livros.size();
                x = 1;

            }

        }
        if (x == 0) {
            System.out.println("Código não encontrado");
        }

    }

    public void cadastrar(CadastroLivro novo) {
        livros.add(novo);
    }

    public void vender(int novaVenda) {
        for (CadastroLivro livro : livros) {
            if (livros.get(novaVenda).getQtda() > 0) {
                estoque = livro.getQtda() - 1;
                livro.setQtda(estoque);
            } else {

                System.out.println("não há estoque");
            }
        }
    }

}
