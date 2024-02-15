package org.launchcode.techjobs.oo;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    //testing the empty constructor
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }
    // testing if the fields set by the constructor are set correctly
    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));


        new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobTest.getName() instanceof String);
        assertEquals("Product tester", jobTest.getName());

        assertTrue(jobTest.getEmployer() instanceof Employer);
        assertEquals("ACME", jobTest.getEmployer().getValue());

        assertTrue(jobTest.getLocation() instanceof Location);
        assertEquals("Desert", jobTest.getLocation().getValue());

        assertTrue(jobTest.getPositionType() instanceof PositionType);
        assertEquals("Quality control", jobTest.getPositionType().getValue());

        assertTrue(jobTest.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", jobTest.getCoreCompetency().getValue());
    }


    //testing the equality of objects
    @Test
    public void testJobsForEquality() {
            Job testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            Job testJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

            assertNotEquals(testJobOne, testJobTwo);
        }


    //testing the toString method starts and ends with a new line
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.toString().startsWith("\n"));
        assertTrue(testJob.toString().endsWith("\n"));
    }

    //testing the toString method for correct labels and data
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expectedOutput = "\n" +
                "ID: " + testJob.getId() + "\n" +
                "Name: " + testJob.getName() + "\n" +
                "Employer: " + testJob.getEmployer() + "\n" +
                "Location: " + testJob.getLocation() + "\n" +
                "Position Type: " + testJob.getPositionType() + "\n" +
                "Core Competency: " + testJob.getCoreCompetency() + "\n";

        assertEquals(expectedOutput, testJob.toString());
    }

    // testing the toString method for handling empty fields
    @Test
    public void testToStringHandlesEmptyField() {
        Job emptyFieldJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        String expectedOutput = "\n" +
                "ID: " + emptyFieldJob.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n";

        assertEquals(expectedOutput, emptyFieldJob.toString());
    }
}
