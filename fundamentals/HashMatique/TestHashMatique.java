import java.util.HashMap;
import java.util.Set;

public class TestHashMatique {
    public static void main(String[] args) {
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("Smoke on the Water", "We all came out to Montreux, on the Lake Geneva shoreline.");
        songMap.put("Stairway to Heaven", "There's a lady who's sure all that glitters is gold.");
        songMap.put("Bohemian Rhapsody", "Is this the real life? Is this just fantasy?");
        songMap.put("Back in Black", "Back in black, I hit the sack, I've been too long, I'm glad to be back.");

        System.out.println(songMap.get("Back in Black"));

        Set<String> keys = songMap.keySet();
        for (String key : keys) {
            System.out.printf("%s: %s %n", key, songMap.get(key));
        }
    }
}
