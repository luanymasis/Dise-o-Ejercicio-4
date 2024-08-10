import java.util.List;

public class apiAdapter implements iApiAdapter {
    private iApi pixabayApi;
    private iApi unsplashedApi;

    public apiAdapter() {
        this.pixabayApi = new PixabayApi();
        this.unsplashedApi = new UnsplashedApi();
    }

    @Override
    public List<Photo> searchPhotosAPIs(String query) {
        List<Photo> photosPixabay = pixabayApi.searchPhotos(query);
        List<Photo> photosUnsplash = unsplashedApi.searchPhotos(query);
        photosPixabay.addAll(photosUnsplash);

        return photosPixabay;
        
    }
}

