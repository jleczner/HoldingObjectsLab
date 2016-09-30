package leczner.jon.HoldingObjectsLab;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by jonathanleczner on 9/30/16.
 */
public class PhoneBookTest {
    PhoneBook pb = new PhoneBook();

    @Test
    public void addEntryTest() {
        pb.addEntry("Bob Jones", 1234567);
        assertNotNull(pb.lookup("Bob Jones"));
    }

    @Test
    public void addEntryAgainTest() {
        pb.addEntry("Bob Jones", 1234567);
        pb.addEntry("Bob Jones", 1234567);
        assertEquals(1, pb.lookup("Bob Jones").size());
    }

    @Test
    public void removeEntryTest() {
        pb.addEntry("Bob Jones", 1234567);
        assertNotNull(pb.removeEntry("Bob Jones", 1234567)); // not null, returns name of removed
    }

    @Test
    public void removeEntryAgainTest() {
        assertNull(pb.removeEntry("Bob Jones", 1234567)); // null, returns name of removed
    }

    @Test
    public void removeRecordTest() {

    }

    @Test
    public void removeRecordAgainTest() {

    }

    @Test
    public void lookupFailTest() {
        assertNull(pb.lookup("Bob Jones"));
    }

    @Test
    public void lookupTest() {
        pb.addEntry("Bob Jones", 1234567);
        pb.addEntry("Bob Jones", 3216547);
        List<Integer> actual = pb.lookup("Bob Jones");
        assertEquals(1234567, actual.get(0).intValue());
    }

    @Test
    public void reverseLookupFailTest() {

    }

    @Test
    public void reverseLookupTest() {

    }
}
