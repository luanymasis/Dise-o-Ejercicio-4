public class UnsplashAdapter implements PhotoAPI {
    
    private int page;
    private int per_page;
    private String order_by;
    private String collections;
    private String content_filter;
    private String color;
    private String orientation;

    @Override
    public List<Photo> searchPhotos(String query) {
       
        //Se formatea el query para que sea compatible con la API de Unsplash
    
        page = query.page;
        per_page = query.per_page;
        order_by = query.order_by;
        collections = query.collections;
        content_filter = query.content_filter;
        color = query.color;
        orientation = query.orientation;

        return UnsplashAPI.searchPhotos(query, page, per_page, order_by, collections, content_filter, color, orientation);
    }
}