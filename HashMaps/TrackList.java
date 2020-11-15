import java.util.HashMap;
import java.util.Set;
public class TrackList {

    public void hashMap1() {
        HashMap<String, String> trackList = new HashMap<String, String>(); //create instance of HashMap

        // add tracks and lyrics
        trackList.put("first song", "lyrics to the first song");
        trackList.put("second song", "lyrics to the second song");
        trackList.put("third song", "lyrics to the third song");
        trackList.put("fourth song", "lyrics to the fourth song");

        // get the keys using keySet method
        Set<String> tracks = trackList.keySet();

        // for loop: get all tracks and lyrics
        for(String track : tracks) {
            System.out.println(track);
            System.out.println(trackList.get(track));
        }
    }

    public HashMap hashMap2() {
        HashMap<String, String> trackList = new HashMap<String, String>(); //create instance of HashMap

        // add tracks and lyrics
        trackList.put("first song", "lyrics to the first song");
        trackList.put("second song", "lyrics to the second song");
        trackList.put("third song", "lyrics to the third song");
        trackList.put("fourth song", "lyrics to the fourth song");

        return trackList;
    }

    public void view1() {
        Set<String> tracks = hashMap2().keySet();

        for(String track : tracks) {
            System.out.println(track);
            System.out.println(hashMap2().get(track));
        }
    }

    public void viewAll() {
        HashMap trackList = hashMap2();
        System.out.println(trackList);
    }

    public void viewUsingValues() {
        HashMap trackList = hashMap2();
        System.out.println(trackList.values()); //get set view of values
    }

    public void getOneTrack() {
        HashMap trackList = hashMap2();
        System.out.println(trackList.get("first song"));
    }


}