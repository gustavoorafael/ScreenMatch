package screenmatch.calculo;

public interface Classificavel {//Queremos que Classificavel nos retorne uma classificação. Podemos definir essa classificação especificando que Titulo, Serie e Filme tenham um método chamado getClassificacao(), por exemplo, que retornará as estrelas — não queremos avaliação em nota.
    int getClassificacao();
}
