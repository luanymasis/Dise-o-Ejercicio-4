package naive;

public class Photo {
    private String id;
    private String url;
    private int likes;
    private int score; 

    public Photo(String id, String url, int likes, int score) {
        this.id = id;
        this.url = url;
        this.likes = likes;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public int getLikes() {
        return likes;
    }

    public int getScore() {
        return score;
    }
}
