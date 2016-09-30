import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by jonathanleczner on 9/30/16.
 */
public class PhoneBook {
    private Map<String, List<Integer>> entries;

    public PhoneBook() {
        entries = new TreeMap<>();
    }

    public List<Integer> lookup(String name) {
        return null;
    }

    public String reverseLookup(int phoneNumber) {
        return null;
    }

    public void addEntry(String name, int phoneNumber) {
        return;
    }

    public void removeEntry(String name, int phoneNumber) {
        return;
    }

    public void removeRecord(String name) {
        return;
    }

    public void listAllNames() {
        return;
    }

    public void listAllEntries() {
        return;
    }
}
