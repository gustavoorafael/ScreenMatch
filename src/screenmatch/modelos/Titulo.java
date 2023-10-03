package screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import screenmatch.exception.ErroDeConversaoDeAnoException;

import javax.xml.namespace.QName;

//Uma classe é uma estrutura que define um tipo de objeto.
// A classe é como um molde, que define quais são as características (atributos)
// e comportamentos (métodos) que os objetos desse tipo vão possuir.
//Classe = screenmatch.modelos.Titulo
public class Titulo implements Comparable<Titulo>{ //A CLASSE especifica o conteudo de um objeto

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    //Atributos:
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.getTitle();
        if(meuTituloOmdb.getYear().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano, pois há mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.getYear());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.getRuntime().substring(0, 2));
    }

    //Métodos
    //esperamos receber um inteiro, get quando queremos pegar um valor, assim como usa set quando queremos atribuir um valor. (getters e setters)
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    @SerializedName("Title") // anotação para ver citar qual nome está vindo as informações
    public String getNome() {
        return nome;
    }

    @SerializedName("Year")
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    //"void" ==> Quando um método executa algo mas não um retorno
    public void exibeFichaTecnica (){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
    }

    //argumento double, pega a avaliação e incrementa
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;

    }
    //"double" ==> Quando um método executa algo e retorna um double
    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return  "(nome ='" + nome
                + ", anoDeLancamento = " + anoDeLancamento
                + ", duração em minutos = " + duracaoEmMinutos + ")";
    }
}
