package tests;

import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {
    private Job Job1;
    private Job Job2;
    private Job Job3;


    @Test
    public void testSettingJobId() {
        Job1 = new Job ();
        Job2 = new Job ();


        assertFalse ( this.Job1.getId () == this.Job2.getId () );
        assertTrue ( this.Job2.getId () - this.Job1.getId () == 1 );
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job3 = new Job ( "Product Tester",
                new Employer ( "ACME" ),
                new Location ( "Desert" ),
                new PositionType ( "Quality control" ),
                new CoreCompetency ( "Persistence" ) );

        assertTrue ( Job3 instanceof Job );
        assertEquals(Job3.getName(), "Product Tester");
        assertEquals(Job3.getLocation().getValue(), "Desert");
        assertEquals(Job3.getPositionType ().getValue (), "Quality control");
        assertEquals(Job3.getCoreCompetency().getValue(),"Persistence" );

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




}
    // assertFalse ( condition:this.job1 == = this.job2)
     //assertFalse ( condiiton this.)
