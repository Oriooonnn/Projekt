import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Song> songs = new ArrayList<>();
    private List<Playlist> playlists = new ArrayList<>();
    public void AddSong(Song song){
        songs.add(song);
    }
    public List<Song> getSongs() {
        return songs;
    }
    public void DodajPlayliste(Playlist playlist){
        playlists.add(playlist);
    }
    public List<Playlist> getPlaylists(){
        return playlists;
    }


                    }



