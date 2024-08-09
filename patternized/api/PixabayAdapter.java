public class PixabayAdapter implements PhotoAPI {
    private String key;
    private String q;
    private String lang;
    private String id;
    private String image_type;
    private String orientation;
    private String category;
    private int min_width;
    private int min_height;
    private String colors;
    private boolean editors_choice;
    private boolean safesearch;
    private String order;
    private int page;
    private int per_page;
    private String callback;
    private boolean pretty;

    @Override
    public List<Photo> searchPhotos(String query) {

        //Se formatea el query para que sea compatible con la API de Pixabay

        key = query.key;
        q = query.q;
        lang = query.lang;
        id = query.id;
        image_type = query.image_type;
        orientation = query.orientation;
        category = query.category;
        min_width = query.min_width;
        min_height = query.min_height;
        colors = query.colors;
        editors_choice = query.editors_choice;
        safesearch = query.safesearch;
        order = query.order;
        page = query.page;
        per_page = query.per_page;
        callback = query.callback;
        pretty = query.pretty;

        return PixabayAPI.searchPhotos(query, key, q, lang, id, image_type, orientation, category, min_width, min_height, colors, editors_choice, safesearch, order, page, per_page, callback, pretty);
    }

}