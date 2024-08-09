public interface PhotoRankingStrategy {
    List<Photo> rankPhotos(List<Photo> photosPixabay, List<Photo> photosUnsplash);
}