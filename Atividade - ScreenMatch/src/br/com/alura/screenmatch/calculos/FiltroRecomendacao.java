package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("esta entre os preferidos no momento");    
        } else if (classificavel.getClassificacao() >= 2 && classificavel.getClassificacao() <= 3 ) {
            System.out.println("Muito bem Avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }

    }
}
