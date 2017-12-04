package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class
 */
public class InheritanceTest {

    private static Inheritance inheritance;

    @BeforeClass public static void start() {
        inheritance = new Inheritance();
    }

    @AfterClass public static void stop() throws Exception {
        inheritance = null;
    }

    /**
     * Method testing proper working of inheritance service.
     * @throws Exception in case of incorrect user inputs
     */
    @Test public void testInheritance() throws Exception {
        assertNotNull(inheritance.getHeroes());
        assertTrue(inheritance.isCorrectName("Jon", "Rob"));
        assertTrue(inheritance.isCorrectName("Aerys", "Eddard"));
        assertFalse(inheritance.isCorrectName("Daenerys", "Arya"));
        String ancestorName = "Eddard";
        String descendantName = "Jon";
        assertEquals(inheritance.isDescendant(ancestorName, descendantName), "Unfortunately " + descendantName + " do not inheritance from " + ancestorName);
        descendantName = "Rob";
        assertEquals(inheritance.isDescendant(ancestorName, descendantName), descendantName + " inheritance from " + ancestorName);
        ancestorName = "Tywin";
        assertEquals(inheritance.isDescendant(ancestorName, descendantName), "Unfortunately " + descendantName + " do not inheritance from " + ancestorName);
        descendantName = "Jaime";
        assertEquals(inheritance.isDescendant(ancestorName, descendantName), descendantName + " inheritance from " + ancestorName);
        ancestorName = "Jaime";
        assertEquals(inheritance.isDescendant(ancestorName, descendantName), "You entered same heroes");
        descendantName = "Joffreys";
        assertEquals(inheritance.isDescendant(ancestorName, descendantName), "We do not have typed heroes in our database..");
        descendantName = "Joffrey";
        assertEquals(inheritance.isDescendant(ancestorName, descendantName), descendantName + " inheritance from " + ancestorName);
        descendantName = "Tommen";
        assertEquals(inheritance.isDescendant(ancestorName, descendantName), descendantName + " inheritance from " + ancestorName);
        ancestorName = "Aerys";
        descendantName = "Jon";
        assertEquals(inheritance.isDescendant(ancestorName, descendantName), descendantName + " inheritance from " + ancestorName);

        assertTrue(inheritance.bonusTest());
    }
}