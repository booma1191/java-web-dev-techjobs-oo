package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job testJob1 = new Job();
    Job testJob2 = new Job();
    Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void testSettingJobId() {
        assertEquals(testJob1, testJob1);
        assertNotEquals(testJob1, testJob2);
        assertEquals(1, testJob2.getId() - testJob1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob3 instanceof Job);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob3.equals(testJob4));
    }

    @Test
    public void testToStringForBlankSpaces() {
        assertEquals('\n',testJob3.toString().charAt(0));
        assertEquals('\n',testJob3.toString().charAt(testJob3.toString().length() - 1));
    }

    @Test
    public void testToStringFields() {
        assertTrue(testJob3.toString().contains("\nID: "));
        assertTrue(testJob3.toString().contains("\nName: "));
        assertTrue(testJob3.toString().contains("\nEmployer: "));
        assertTrue(testJob3.toString().contains("\nLocation: "));
        assertTrue(testJob3.toString().contains("\nPosition Type: "));
        assertTrue(testJob3.toString().contains("\nCore Competency: "));
    }

    @Test
    public void testToStringEmptyFields() {
        assertTrue(testJob2.toString().contains("Name: Data not available"));
        assertTrue(testJob2.toString().contains("Employer: Data not available"));
        assertTrue(testJob2.toString().contains("Location: Data not available"));
        assertTrue(testJob2.toString().contains("Position Type: Data not available"));
        assertTrue(testJob2.toString().contains("Core Competency: Data not available"));

    }

}
