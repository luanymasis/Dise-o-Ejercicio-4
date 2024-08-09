import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BromeliaPictInventory {
    
    private PixabayApi pixabayAPI;
    private UnsplashApi unsplashAPI;

    public BromeliaPictInventory() {
        this.pixabayAPI = new PixabayApi();
        this.unsplashAPI = new UnsplashApi();
    }

    private List<Photo> rankPhotosResult(List<Photo> unsplashPhotos, List<Photo> pixabayPhotos) {


        List<Photo> combinedPhotos = new ArrayList<>(unsplashPhotos);
        combinedPhotos.addAll(pixabayPhotos);

        //CombinedPhotos se ordena las de mayor puntuación (top 10)
        
        List<Photo> RankedPhotos = new ArrayList<>(combinedPhotos);
        return RankedPhotos;
    }
    
    public List<Photo> getPhotos(String query) {    

        //Se debe formatear el query para que sea compatible con cada una de las apis

        List<Photo> pixabayPhotos = pixabayAPI.searchPhotos(query);
        List<Photo> unsplashPhotos = unsplashAPI.searchPhotos(query);

        //Se hardcodea los resultados de ambas apis para hacer que sigan el mismo formato

        return rankPhotosResult(unsplashPhotos, pixabayPhotos);
    }

}