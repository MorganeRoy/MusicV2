package com.example.morganeroy.music;

/**
 * Created by MorganeRoy on 14/10/2016.
 */
public class Song {
    private long id;
    private String title;
    private String artist;
    private float value;

    /*public Song(String songTitle, String songArtist, float songValue) {
        id = -1;
        title = songTitle;
        artist = songArtist;
        value = songValue;
    }*/

    public Song(long songId, String songTitle, String songArtist, float songValue) {
        id = songId;
        title = songTitle;
        artist = songArtist;
        value = songValue;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public float getValue(){return value;}
}
