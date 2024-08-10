import java.util.List;

public class trendRanking  extends ranking {
    
    public trendRanking(iApiAdapter apiAdapter) {
        super(apiAdapter);
    }

    @Override
    public List<Photo> rankPhotos(String query) {
        List<Photo> photos = apiAdapter.searchPhotosAPIs(query);
        //Se hace la lógica para el ranking por tendencia
        return photos;
    }
}
