import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong (String title, double length) {
        if (findSong(title) != null) {
            return false;
        } else {
            Song newSong = new Song(title, length);
            songs.add(newSong);
            System.out.println("New song: " + newSong.getTitle() + " added successfully!");
            return true;
        }
    }

    private Song findSong (String title){
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumb, LinkedList<Song> playlist) {
        if (trackNumb <= 0) {
            return false;
        }
        Song songToAdd = songs.get(trackNumb-1);
        playlist.add(songToAdd);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song == null) {
            return false;
        } else {
            playlist.add(song);
            return true;

        }
    }

}
