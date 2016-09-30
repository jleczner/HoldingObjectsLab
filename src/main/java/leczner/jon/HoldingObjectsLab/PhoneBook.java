package leczner.jon.HoldingObjectsLab;

import java.util.*;

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
        Set<Map.Entry<String, List<Integer>>> entrySet = entries.entrySet();
        for (Map.Entry<String, List<Integer>> entry : entrySet) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
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
        if (entries.containsKey(name)) {
            if (entries.get(name).contains(phoneNumber)) {
                entries.remove(name, phoneNumber);
                return name;
            } else {
                System.out.println("Entry not found: " + name + " " + phoneNumber);
                return null;
            }
        } else {
            System.out.println("Record not found: " + name);
            return null;
        }
    }

    public String removeRecord(String name) {
        if (entries.containsKey(name)) {
            entries.remove(name);
            return name;
        } else {
            System.out.println("Record not found: " + name);
            return null;
        }
    }

    public Set<String> listAllNames() {
        Set<String> names = entries.keySet();
        System.out.println(names);
        return names;
    }

    public Map<String, List<Integer>> listAllEntries() {
        Set<Map.Entry<String, List<Integer>>> entrySet = entries.entrySet();
        for (Map.Entry<String, List<Integer>> entry : entrySet) {
            System.out.println(entry.getKey() + ": ");
            List<Integer> numbers = entry.getValue();
            for (int i : numbers) {
                System.out.println(i);
            }
        }
        return entries;
    }
}
