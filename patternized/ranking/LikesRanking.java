import java.util.List;

public class likesRanking extends ranking {

    public likesRanking(iApiAdapter apiAdapter) {
        super(apiAdapter);
    }


    @Override
    public List<Photo> rankPhotos(String query) {
        List<Photo> photos = apiAdapter.searchPhotosAPIs(query);
        //Se hace la lógica para el ranking por likes
        
        return photos;
    }
}
