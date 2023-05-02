package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job jobA = new Job();
        Job jobB = new Job();
        System.out.println(jobA.getId());
        System.out.println(jobB.getId());
        assertNotEquals(jobA.getId(), jobB.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
       Job jobC = new Job("Product tester",
               new Employer("ACME"),
               new Location("Desert"),
               new PositionType("Quality control"),
               new CoreCompetency("Persistence"));

        assertTrue(jobC.getName() instanceof String);
        assertTrue(jobC.getEmployer() instanceof Employer);
        assertTrue(jobC.getLocation() instanceof Location);
        assertTrue(jobC.getPositionType() instanceof PositionType);
        assertTrue(jobC.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(jobC.getName(), "Product tester");
        assertEquals(jobC.getEmployer().getValue(), "ACME");
        assertEquals(jobC.getLocation().getValue(), "Desert");
        assertEquals(jobC.getPositionType().getValue(), "Quality control");
        assertEquals(jobC.getCoreCompetency().getValue(), "Persistence");

    }

    @Test
    public void testJobsForEquality(){
        Job jobD = new Job("Ditch Digger",
                new Employer("The Ditch Company of Omaha"),
                new Location("Omaha, NE"),
                new PositionType("Ditch Depth Checker"),
                new CoreCompetency("Love of Ditches"));

        Job jobE = new Job("Ditch Digger",
                new Employer("The Ditch Company of Omaha"),
                new Location("Omaha, NE"),
                new PositionType("Ditch Depth Checker"),
                new CoreCompetency("Love of Ditches"));

        assertFalse(jobD.getId() == jobE.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job jobF = new Job("Ditch Filler",
                new Employer("Smooth Lands LLC"),
                new Location("Parson, IA"),
                new PositionType("Land Observer"),
                new CoreCompetency("Hatred of Ditches"));
        String jobString = jobF.toString();
        assertEquals('\n', jobString.charAt(0));
        assertEquals('\n', jobString.charAt(jobString.length()-1));


    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job jobF = new Job("Ditch Filler",
                new Employer("Smooth Lands LLC"),
                new Location("Parson, IA"),
                new PositionType("Land Observer"),
                new CoreCompetency("Hatred of Ditches"));
        String jobString = jobF.toString();
        String testString = "\nID: " + jobF.getId() +"\n" +
                "Name: Ditch Filler\n" +
                "Employer: Smooth Lands LLC\n" +
                "Location: Parson, IA\n" +
                "Position Type: Land Observer\n" +
                "Core Competency: Hatred of Ditches\n";
        assertEquals(jobString, testString);
    }

    @Test
    public void testToStringHandlesEmptyField(){
            Job jobF = new Job("Ditch Filler",
            new Employer(""),
            new Location("Parson, IA"),
            new PositionType("Land Observer"),
            new CoreCompetency("Hatred of Ditches"));
        String jobString = jobF.toString();
        String testString = "\nID: " + jobF.getId() +"\n" +
                "Name: Ditch Filler\n" +
                "Employer: Data not available\n" +
                "Location: Parson, IA\n" +
                "Position Type: Land Observer\n" +
                "Core Competency: Hatred of Ditches\n";
        assertEquals(jobString, testString);

    }
}
