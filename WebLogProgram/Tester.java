
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer() {
        // complete method
        LogAnalyzer LA = new LogAnalyzer();
        LA.readFile("weblog2_log");
        int uniqueIps = LA.countUniqueIPs();
        
        //LA.printAll();
        //LA.printAllHigherThanNum(400);
        //System.out.println(LA.countUniqueIPs());
        //LA.uniqueIPVisitsOnDay("Sep 24");
        LA.countUniqueIPsInRange(200,299);
        
        //System.out.println(uniqueIps);
    }
}
