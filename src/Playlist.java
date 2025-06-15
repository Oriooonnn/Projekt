
import java.util.ArrayList;
import java.util.List;
public class Playlist {
    private String name;
    private List<Song> songs = new ArrayList<>();
    public Playlist(String name){
        this.name = name;
    }
    public void dodaj_piosenke(Song song){
        songs.add(song);
    }
    public List<Song> getSongs(){
        return songs;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}
