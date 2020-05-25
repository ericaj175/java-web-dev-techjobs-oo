package tests;

import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {
    private Job job1;
    private Job job2;
    private Job job3;
    private Job job4;


    @Test
    public void testSettingJobId() {
        job1 = new Job ();
        job2 = new Job ();


        assertFalse ( this.job1.getId () == this.job2.getId () );
        assertTrue ( this.job2.getId () - this.job1.getId () == 1 );
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        job3 = new Job ( "Product Tester",
                new Employer ( "ACME" ),
                new Location ( "Desert" ),
                new PositionType ( "Quality control" ),
                new CoreCompetency ( "Persistence" ) );

        assertTrue ( job3 instanceof Job );
        assertEquals( job3.getName(), "Product Tester");
        assertEquals( job3.getLocation().getValue(), "Desert");
        assertEquals( job3.getPositionType ().getValue (), "Quality control");
        assertEquals( job3.getCoreCompetency().getValue(),"Persistence" );

        //assertEquals(new Location, )


    }

    @Test
    public void testJobsForEquality()  {
        Job job1 = new Job("picker");
        Job job2 = new Job("picker");
        job1.setId(1);
        job2.setId(2);
        assertNotEquals(job1, job2);

    }
    @Test
    public void objectThatReturnsAString() {
        job4 = new Job ( "Product Tester",
                new Employer ( "ACME" ),
                new Location ( "Desert" ),
                new PositionType ( "Quality control" ),
                new CoreCompetency ( "Persistence" ) );
    String testString = "ID: " + job4.getId();
    String testString2 = "Name: " + job4.getId();
    String testString3 = "Employer: " + job4.getId();
    String testString4 = "Location: " + job4.getId();
    String testString5 = "PositionType: " + job4.getId();
    String testString6 = "CoreCompetency: " + job4.getId();

    assertTrue(job4.toString().contains ("ID" ));
        assertTrue(job4.toString().contains("Name: " );
        assertTrue(job4.toString().contains("Employer: " );
        assertTrue(job4.toString().contains("Location: " );
        assertTrue(job4.toString().contains("Position Type: " );
       assertTrue(job4.toString().contains("Core Competency: " );
    }




}
    // assertFalse ( condition:this.job1 == = this.job2)
     //assertFalse ( condiiton this.)
