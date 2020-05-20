package tests;

import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.Job;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {
    private Job Job1;
    private Job Job2;


    @Test
    public void testSettingJobId() {
        Job1 = new Job();
         Job2 = new Job();

         assertFalse(this.Job1.getId() == this.Job2.getId());
         assertTrue ( this.Job2.getId() - this.Job1.getId () == 1);


    }
};
      public void testJobConstructorSetsAllFields() {


     new Job ("Product tester",
             new Employer ( "ACME" ),
             new Location ( "Desert" ),
             new PositionType ( "Quality control" ),
             new CoreCompetency ( "Persistence" ) );
    // assertFalse ( condition:this.job1 == = this.job2)
     //assertFalse ( condiiton this.)
 };