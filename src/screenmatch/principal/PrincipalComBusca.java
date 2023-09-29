package screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenmatch.modelos.Titulo;
import screenmatch.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=608df585"; //"&apikey=coloque_sua_apikey";

//Mencionamos que estamos fazendo um HTTP request (Traduzindo, "requisição HTTP"), buscamos justamente por isso no campo "Search"
// do lado direito superior. Já nos exibe um menu flutuante com algumas seções, como "Classes and Interfaces" e "Members".
// Na primeira seção, temos a opção "java.net.http.HttpRequest", selecionamos ela.
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json  = response.body();
        System.out.println(json);
//        busca o json e transforma na classe titulo
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);;


        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Titulo já convertido:");
        System.out.println(meuTitulo);
    }
}
// Ao rodar o arquivo, há um input para colocar o nome do filme, a requisição será feita e buscará o JSON do filme
// Lembrar de alterar a chave!