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

        //Formateo de la query para que sea aceptada por Pixabay
        
        String key = "";
        String q = query.q;
        String lang = query.lang;
        String id = query.id;
        String image_type = query.image_type;
        String orientation = query.orientation;
        String category = query.category;
        int min_width = query.min_width;
        int min_height = query.min_height;
        String colors = query.colors;
        Boolean editors_choice = query.editors_choice;
        Boolean safesearch = query.safesearch;
        String order = query.order;
        int page = query.page;
        int per_page = query.per_page;
        String callback = query.callback;
        Boolean pretty = query.pretty;

        //Ejemplo del query
        String PixabayQuery = "key="+key+"&q="+q+"&lang="+lang+"&id="+id+"&image_type="+image_type+"&orientation="+orientation+"&category="+category+"&min_width="+min_width+"&min_height="+min_height+"&colors="+colors+"&editors_choice=" + editors_choice + "&safesearch="+safesearch+"&order="+order+"&page="+page+"&per_page="+per_page+"&callback="+callback+"&pretty="+pretty;

        List<Photo> photosPixabay = pixabayApi.searchPhotos(PixabayQuery);

        //Formateo de la query para que sea aceptada por Unsplash
        
        int page = query.page;
        int per_page = query.per_page;
        String order_by = query.order_by;
        String collections = query.collections;
        String content_filter = query.content_filter;
        String color = query.color;
        String orientation = query.orientation;

        //Ejemplo del query
        String UnsplashedQuery = "page="+page+"&per_page="+per_page+"&order_by="+order_by+"&collections="+collections+"&content_filter="+content_filter+"&color="+color+"&orientation="+orientation;

        List<Photo> photosUnsplash = unsplashedApi.searchPhotos(UnsplashedQuery);
        photosPixabay.addAll(photosUnsplash);

        return photosPixabay;
        
    }
}

