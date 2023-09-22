package screenmatch.principal;

import screenmatch.calculo.CalculadoraDeTempo;
import screenmatch.calculo.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970); //tipo referência, cria um espaço na memória pro OBJETO screenmatch.modelos.Filme e seus atributos (caracteristicas do filme)
        meuFilme.setDuracaoEmMinutos(180);

        //"new screenmatch.modelos.Filme();" ==> instanciar objetos, criando uma nova referência a um objeto para trabalhar os seus dados

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("lost", 2000);
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2000); //tipo referência, cria um espaço na memória pro OBJETO screenmatch.modelos.Filme e seus atributos (caracteristicas do filme)
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        //Isto não é tudo: o mais incrível é que a linha de cima, onde imprimimos a ArrayList, exibe agora o toString() de cada um dos filmes.
        //
        //Por que isso ocorre? Se verificarmos a documentação do ArrayList, veremos que o seu toString() reescrito faz um for nos elementos e chama o toString() de cada um deles.
        //
        //O bonito é que as coisas estão se cruzando. O toString() recém-aprendido é utilizado também pelo ArrayList.




    }
}