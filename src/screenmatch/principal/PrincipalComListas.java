package screenmatch.principal;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
//ArrayList
//A principal característica do ArrayList é que ele é baseado em um array dinâmico.
// Ele armazena os elementos em uma matriz interna e, conforme novos elementos são adicionados, o tamanho da matriz
// é automaticamente ajustado para acomodar o novo elemento. Da mesma forma, quando um elemento é removido, o tamanho
// do array é ajustado para evitar o desperdício de espaço. O ArrayList é amplamente utilizado devido à sua facilidade
// de uso e eficiência em termos de desempenho.
//
//LinkedList
//A classe LinkedList fornece uma lista encadeada de elementos. Diferentemente do ArrayList, que é baseado em um array,
// o LinkedList é baseado em uma lista encadeada, o que significa que cada elemento da lista é um objeto que contém uma
// referência para o próximo elemento. Isso permite que os elementos sejam adicionados e removidos de maneira eficiente
// em qualquer posição da lista, mas pode tornar a pesquisa de um elemento específico menos eficiente.
//
//O LinkedList é uma boa escolha quando a inserção e remoção de elementos em qualquer posição da lista é frequente e
// quando não é necessário acessar os elementos de forma aleatória.
//
//Vector
//A classe Vector é semelhante ao ArrayList, mas é sincronizada, o que significa que é segura para uso em threads
// concorrentes. No entanto, a sincronização adiciona uma sobrecarga de desempenho, então o Vector pode ser mais lento
// que o ArrayList em algumas situações.
//
//Stack
//A classe Stack implementa uma pilha, que é uma coleção ordenada de elementos onde a inserção e remoção de elementos
// ocorrem sempre no mesmo extremo da lista. Os elementos são adicionados e removidos em uma ordem conhecida como
// "last-in, first-out" (LIFO), ou seja, o último elemento adicionado é o primeiro a ser removido. A classe Stack é
// usada com frequência em algoritmos de processamento de texto, bem como em outras situações em que a LIFO é a maneira
// natural de organizar os dados.