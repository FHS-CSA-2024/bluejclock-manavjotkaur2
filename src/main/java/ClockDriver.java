package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        System.out.println("Empty Constructor Test:" + test1.getTime());
        ClockDisplay test2 = new ClockDisplay(3,32);
        System.out.println("Constructor with time test:" + test2.getTime());
        test2.setTime(9,59);
        System.out.println("Set Time Test:" + test2.getTime());
        test2.timeTick();
        System.out.println("Tick 09:59 to 10:00 Test:" + test2.getTime());
        ClockDisplay tickTest1 = new ClockDisplay(23,59);
        System.out.println("Tick Test 1 Pre-Tick:" + tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("Tick Test 1 Post-Tick:" + tickTest1.getTime());
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds test1Sec = new ClockDisplaySeconds();
        System.out.println("See Empty Con. Test: " + test1Sec.getTime());
        ClockDisplaySeconds test2Sec = new ClockDisplaySeconds(6,49,0);
        System.out.println("Sec 2 arg. Con. Test: " + test2Sec.getTime());
        ClockDisplaySeconds ticTest1Sec = new ClockDisplaySeconds(3,32,59);
        System.out.println("Sec Tick Test 1 Pretick:" + ticTest1Sec.getTime());
        ticTest1Sec.timeTick();
        System.out.println("Sec 1 Test Posttick:" + ticTest1Sec.getTime());
        ClockDisplaySeconds ticTest2Sec = new ClockDisplaySeconds(1,0,59);
        System.out.println("Sec Tick Test 2 Pretick:" + ticTest2Sec.getTime());
        ticTest2Sec.timeTick();
        System.out.println("Sec 2 Test Posttick:" + ticTest2Sec.getTime());
        ClockDisplaySeconds ticTest3Sec = new ClockDisplaySeconds(1,59,59);
        System.out.println("Sec Tick Test 3 Pretick:" + ticTest3Sec.getTime());
        ticTest3Sec.timeTick();
        System.out.println("Sec 3 Test Posttick:" + ticTest3Sec.getTime());
        ClockDisplaySeconds ticTest4Sec = new ClockDisplaySeconds(23,59,59);
        System.out.println("Sec Tick Test 4 Pretick:" + ticTest4Sec.getTime());
        ticTest4Sec.timeTick();
        System.out.println("Sec 4 Test Posttick:" + ticTest4Sec.getTime());
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}
