package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.Filme;
import model.Serie;
import model.Titulo;

public class AppComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Velozes e Furiosos: Desafio em Tóquio", 2006); // tipo referencia
        meuFilme.avalia(10);
        Filme deleFilme = new Filme("+ Velozes + Furiosos", 2003); // tipo referencia
        deleFilme.avalia(10);
        var filmedaGiovanna = new Filme("Moana", 2017);
        filmedaGiovanna.avalia(8);
        Serie winx = new Serie("Winx Club", 2004);

        // Filme f1 = filmedaGiovanna; 
        /*
         * neste exemplo não há criação de um novo objeto, mas sim de uma VARIÁVEL DE REFERÊNCIA
         * objeto só é criado com 'new'
         * VF - é usada para chegar até um objeto. ou seja, o que muda é a forma que eu me referencia a ele
         */

        //parametrizar uma lista
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmedaGiovanna);
        lista.add(deleFilme);
        lista.add(meuFilme);
        lista.add(winx);

        // foreach - palavra reservada para iterar
        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
        //  if (titulo instanceof Filme filme) {
                // Filme filme = (Filme) titulo;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        /*
         * ANOTAÇÕES - outras formas de percorrer a lista
         * a partir do Java 8, foi adicionado na interface List, a qual a classe ArrayList implementa
         * um novo método chamado forEach, que possibilita a iteração sobre os elementos da lista de forma mais concisa e elegante
         *  o exemplo anterior pode ser reescrito utilizando o método forEach da seguinte forma:
         * 
         * nomes.forEach(nome -> System.out.println(nome));
         * 
         * Method Reference - forma reduzida de uma expressão lambda
         * 
         * nomes.forEach(System.out::println);
         */

         ArrayList<String> buscaPorArtista = new ArrayList();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jennifer Aniston");
        buscaPorArtista.add("Johnny Depp");
        buscaPorArtista.add("Winona Ryder");
        buscaPorArtista.add("Jennifer Garner");
        buscaPorArtista.add("Mark Rufallo");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        /*
         * Além da interface Comparable, o Java possui uma outra interface chamada Comparator, que nos fornece outra alternativa para ordenação de coleções.
         */

         // comparar por ano - sem excluir o comparable já existente
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}