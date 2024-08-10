import java.util.List;

public class BromeliaPictInventory {

    private ranking rankingAlgorithm;

    public BromeliaPictInventory(ranking rankingA) {

        //Se asigna el algoritmo de ranking
        this.rankingAlgorithm = rankingA;
    }

    public List<Photo> generateIcons(String query) {
        
        //Se retorna el ranking de las fotos ya hecho por el adapter
        return rankingAlgorithm.rankPhotos(query);
    }
}