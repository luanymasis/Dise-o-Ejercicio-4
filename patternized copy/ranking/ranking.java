import java.util.List;

public abstract class ranking {

    protected iApiAdapter apiAdapter;

    public ranking (iApiAdapter apiAdapter) {
        this.apiAdapter = apiAdapter;
    }

    public abstract List<Photo> rankPhotos(String query);
    
}
