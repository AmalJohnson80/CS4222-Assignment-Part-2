import java.util.*;
public class PlayList {

    private String name;
    private ArrayList<Track> tracks;
    //private String title;

    public PlayList() {

        this.name = "MyPlaylist";
        ArrayList<Track> tracks = new ArrayList<Track>();

    }

    public PlayList(String playListName) {
        this.name = playListName;
        this.tracks = new ArrayList<Track>();
    }

    public String toString() {
        ArrayList<String> inString = new ArrayList<>();
        String toString = this.tracks.toString();
        for (Track track : this.tracks) {
            inString.add(toString);

        }
        return toString;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(String title, String artist) {
        tracks.add(new Track(title, artist));

    }

    public void add(String title, String artist, int year, int duration) {
        tracks.add(new Track(title, artist, year, duration));
    }

    public void add(Track t) {
        tracks.add(t);
    }

    public boolean remove (String title){
        int i;
        for( i=tracks.size()-1; i>=0; i--){
            if(tracks.get(i).getTitle().equalsIgnoreCase(title)){
                tracks.remove(i);
                return true;
            }

        }
        return false;
    }

    public void showList(){
        if(tracks.size()==0){
            System.out.println("The list is empty.");
        }else System.out.println(tracks);
    }

    public void playAll(boolean random){
        if(!random){
            System.out.println(tracks);
        }else {
            Collections.shuffle(tracks);
            for(Track random_Order : tracks){
                System.out.println(random_Order);
            }
            }
        }
        
    
    }


