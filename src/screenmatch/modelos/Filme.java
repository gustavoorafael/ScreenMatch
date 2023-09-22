package screenmatch.modelos;


import screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel { //todo filme é um titulo
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
        //Abrimos e fechamos aspas com a palavra "Filme" em seu interior
        //Adicionamos o nome do filme
        //Entre aspas, adicionamos um espaço e a abertura dos parênteses
        //Adicionamos o ano de lançamento
        //Entre aspas, adicionamos o fechamento dos parênteses
        //O importante é que o método precisa se chamar toString() e precisa ser reescrito. Se mudarmos o nome, não será uma mudança de comportamento do método original (um dos pilares do polimorfismo e da herança).
    }
}
