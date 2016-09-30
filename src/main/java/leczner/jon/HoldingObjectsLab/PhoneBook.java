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
        if (!numbers.contains(phoneNumber)) {
            numbers.add(phoneNumber);
        } else {
            System.out.println("Duplicate entry: " + name + " " + phoneNumber);
        }
        entries.put(name, numbers);
    }

    public String removeEntry(String name, int phoneNumber) {
        return null;
    }

    public String removeRecord(String name) {
        return null;
    }

    public List<String> listAllNames() {
        return null;
    }

    public Map<String, List<Integer>> listAllEntries() {
        return null;
    }
}
