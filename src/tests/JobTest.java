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
        Job job1 = new Job("Product Tester",
        new Employer ("ACME" ),
        new Location ( "Desert" ),
                new PositionType ( "Quality control" ),
                new CoreCompetency ( "Persistence" ));
        Job job2 = new Job("Product Tester",
                new Employer ("ACME" ),
                new Location ( "Desert" ),
                new PositionType ( "Quality control" ),
                new CoreCompetency ( "Persistence" ));
        assertNotEquals(job1, job2);

    }
    @Test
    public void objectThatReturnsAString() {
        job4 =
                new Job ( "Product Tester",
                new Employer ( "ACME" ),
                new Location ( "Desert" ),
                new PositionType ( "Quality control" ),
                new CoreCompetency ( "Persistence" ) );
    String testString = "ID: " + job4.getId();
    String testString2 = "Name: " + job4.getName();
    String testString3 = "Employer: " + job4.getEmployer();
    String testString4 = "Location: " + job4.getLocation();
    String testString5 = "Position Type: " + job4.getPositionType ();
    String testString6 = "Core Competency: " + job4.getCoreCompetency ();
    String dataNotAvailable = "Data not available";

    assertTrue(job4.toString().contains (testString));
        assertTrue(job4.toString().contains(testString2));
        assertTrue(job4.toString().contains(testString3));
        assertTrue(job4.toString().contains(testString4));
        assertTrue(job4.toString().contains(testString5));
       assertTrue(job4.toString().contains(testString6));
       assertFalse (job4.toString().contains("Name: " + dataNotAvailable));
        assertFalse (job4.toString ().contains ( "Employer:" + dataNotAvailable ) );
       assertFalse(job4.toString().contains("Location:" + dataNotAvailable));
       assertFalse(job4.toString().contains("Position Type:" + dataNotAvailable));
       assertFalse(job4.toString().contains("Core Competency: " + dataNotAvailable));
    }

    @Test
    public void testToStringWhenDataNotAvailable() {
        job4 =
                new Job ( "",
                new Employer ( "ACME" ),
                new Location ( "Desert" ),
                new PositionType ( "Quality control" ),
                new CoreCompetency ( "Persistence" ) );
        String dataNotAvailable = "Data not available";
        assertTrue (job4.toString().contains("Name: "+ dataNotAvailable));
 }}





