import java.util.List;

public class BromeliaPictInventory {

    private ranking rankingAlgorithm;

    public BromeliaPictInventory(ranking rankingA) {
        this.rankingAlgorithm = rankingA;
    }

    public List<Photo> generateIcons(String query) {
        return rankingAlgorithm.rankPhotos(query);
    }
}