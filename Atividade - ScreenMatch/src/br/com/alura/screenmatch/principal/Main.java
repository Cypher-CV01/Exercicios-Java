package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filmeUm = new Filme("Interestelar", 2014);
        filmeUm.setDuracaoEmMinutos(169);
        filmeUm.setIncluidoNoPlano(true);

        filmeUm.exibeFichaTecnica();
        filmeUm.avalia(8);
        filmeUm.avalia(6);
        filmeUm.avalia(8);
        filmeUm.avalia(9);
        filmeUm.avalia(8);
        System.out.println("Total de avaliacoes " + filmeUm.getTotalDeAvaliacoes());
        System.out.println(filmeUm.mediaAvaliacoes());

        Serie serieUm = new Serie("The Walking Dead", 2010);
        serieUm.setEpPorTemporada(8);
        serieUm.setMinutosPorEp(50);
        serieUm.setTemporadas(12);
        serieUm.setAtiva(false);

        System.out.println("tempo para maratonar The Walking Dead = "+ serieUm.getDuracaoEmMinutos());
        System.out.println("Total de avaliacoes " + serieUm.getTotalDeAvaliacoes());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeUm);
        calculadora.inclui(serieUm);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filmeUm);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serieUm);
        episodio.setTotalVisualizacoes(400);
        filtro.filtra(episodio);

        var filmeDois = new Filme("Dogville", 2003);
        filmeDois.setDuracaoEmMinutos(200);
        filmeDois.avalia(10);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeUm);
        listaDeFilme.add(filmeDois);
        System.out.println("Tamanho da lista " + listaDeFilme.size());
        System.out.println("Primeiro filme " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);


    }
}
