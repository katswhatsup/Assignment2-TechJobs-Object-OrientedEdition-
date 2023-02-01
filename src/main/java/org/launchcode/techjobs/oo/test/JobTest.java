package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class
JobTest {


    @Test
    public void testSettingJobId(){
        Job fakejob1= new Job();
        Job fakejob2= new Job();
        assertNotEquals(fakejob1.getId(),fakejob2.getId());
    }

    @Test

    public void testJobConstructorSetsAllFields(){
        Job fakejob3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(fakejob3.getName() instanceof String);
        assertTrue(fakejob3.getEmployer() instanceof Employer);
        assertTrue(fakejob3.getLocation() instanceof Location);
        assertTrue(fakejob3.getPositionType() instanceof PositionType);
        assertTrue(fakejob3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", fakejob3.getName());
        assertEquals("ACME", fakejob3.getEmployer());
        assertEquals("Desert", fakejob3.getLocation());
        assertEquals("Quality control", fakejob3.getPositionType());
        assertEquals("Persistence", fakejob3.getCoreCompetency());
    }

    @Test

    public void testJobsForEquality(){
        Job fakejob3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job fakejob4= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(fakejob3.equals(fakejob4));


    }

    @Test

    public void testToStringContainsCorrectLabelsAndData(){
        Job fakejob3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //ID: 1
        //Name: Product tester
        //Employer: ACME
        //Location: Desert
        //Position Type: Quality control
        //Core Competency: Persistence

        String expectedOutput= "\nID: 1\n\nName: Product tester\n\nEmployer: ACME\n\nLocation: Desert\n\nPosition Type: Quality control\n\nCore Competency: Persistence\n";

        String actualOutput= fakejob3.toString();
                assertTrue(expectedOutput.equals(actualOutput));

    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job fakejob3= new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedOutput= "\nID: 1\n\nName: Product tester\n\nEmployer: Data not available\n\nLocation: Desert\n\nPosition Type: Quality control\n\nCore Competency: Persistence\n";
        String actualOutput= fakejob3.toString();
    }


}
