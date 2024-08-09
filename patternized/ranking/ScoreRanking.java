public class ScoreRanking implements PhotoRankingStrategy {
    @Override
    public List<Photo> rankPhotos(List<Photo> photosPixabay, List<Photo> photosUnsplash) {
        
        //Se hace el algoritmo para ordenar las fotos por score
        Collections.sort(photosPixabay, photosUnsplash);
        return photos.subList(0, 10);
    }
}