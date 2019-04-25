package br.com.digitalhouse;

public class CadastroLivro {

    private int codLivro;
    private String titulo;
    private String autor;
    private String anoLancamento;
    private int codIsbn;
    private int qtda;
    private float preco;

    public CadastroLivro() {

    }

    public CadastroLivro(int codLivro, String titulo, String autor, String anoLancamento, int codIsbn, int qtda, float preco) {
        this.codLivro = codLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.codIsbn = codIsbn;
        this.qtda = qtda;
        this.preco = preco;
    }

    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getCodIsbn() {
        return codIsbn;
    }

    public void setCodIsbn(int codIsbn) {
        this.codIsbn = codIsbn;
    }

    public int getQtda() {
        return qtda;
    }

    public void setQtda(int qtda) {
        this.qtda = qtda;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
