package leczner.jon.HoldingObjectsLab;

import java.util.ArrayList;
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
        if (entries.containsKey(name)) {
            return entries.get(name);
        } else {
            System.out.println("Entry " + name + " not found");
            return null;
        }
    }

    public String reverseLookup(int phoneNumber) {
        return null;
    }

    public void addEntry(String name, int phoneNumber) {
        List<Integer> numbers = entries.get(name);
        if (numbers == null) {
            numbers = new ArrayList<>();
        }
        numbers.add(phoneNumber);
        entries.put(name, numbers);
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
