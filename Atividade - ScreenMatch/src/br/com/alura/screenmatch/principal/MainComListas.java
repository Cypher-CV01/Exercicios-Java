package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class  MainComListas {

    public static void main(String[] args) {
        Filme filmeUm = new Filme("Interestelar", 2014);
        filmeUm.avalia(8);
        var filmeDois = new Filme("Dogville", 2003);
        filmeDois.avalia(10);
        Serie serieUm = new Serie("The Walking Dead", 2010);
        ArrayList<Titulo> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeUm);
        listaDeFilme.add(filmeDois);
        listaDeFilme.add(serieUm);
        for (Titulo item: listaDeFilme) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificacao " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Andam Sandler");
        buscaPorArtista.add("Luan");
        buscaPorArtista.add("Milena");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenacao");
        System.out.println(buscaPorArtista);
        Collections.sort(listaDeFilme);
        System.out.println(listaDeFilme);
        listaDeFilme.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(listaDeFilme);

    }

}