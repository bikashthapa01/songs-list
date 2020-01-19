package net.smallacademy.songslist;

public class Song {
    private String title;
    private String artists;
    private String coverImage;
    private String songURL;

    public  Song(){}
    public Song(String title,String artists,String coverImage,String songURL){
        this.title = title;
        this.artists = artists;
        this.coverImage = coverImage;
        this.songURL = songURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getSongURL() {
        return songURL;
    }

    public void setSongURL(String songURL) {
        this.songURL = songURL;
    }
}
