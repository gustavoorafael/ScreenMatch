package screenmatch.modelos;
//Uma classe é uma estrutura que define um tipo de objeto.
// A classe é como um molde, que define quais são as características (atributos)
// e comportamentos (métodos) que os objetos desse tipo vão possuir.
//Classe = screenmatch.modelos.Titulo
public class Titulo { //A CLASSE especifica o conteudo de um objeto
    //Atributos:
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;



    //Métodos
    //esperamos receber um inteiro, get quando queremos pegar um valor, assim como usa set quando queremos atribuir um valor. (getters e setters)
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

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
}
