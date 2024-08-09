public class BromeliaPictInventory {

    private PhotoAPIAdapter unsplashAPI;
    private PhotoAPIAdapter pixabayAPI;
    private PhotoRankingStrategy rankingStrategy;

    public BromeliaPictInventory(PhotoAPIAdapter unsplashAPI, PhotoAPIAdapter pixabayAPI, PhotoRankingStrategy rankingStrategy) {
        this.unsplashAPI = unsplashAPI;
        this.pixabayAPI = pixabayAPI;
        this.rankingStrategy = rankingStrategy; //Patrón Brigde
    }
    
    public List<Photos> rankPhotosResult(List<Photo> listaFotosUnplash, List<Photo> listaFotosPixaBay) {

        //rankea las fotos de ambas apis y devuelve una lista de fotos rankeadas segun el algoritmo
        return rankingStrategy.rankPhotos(listaFotosUnplash, listaFotosPixaBay);

    }

    public List<Photos> getPhotos(String query) {

        
        List<Photo> unsplashPhotos = unsplashAPI.searchPhotos(query);
        List<Photo> pixabayPhotos = pixabayAPI.searchPhotos(query);


        return rankPhotosResult(unsplashPhotos, pixabayPhotos);
    }

    

}
