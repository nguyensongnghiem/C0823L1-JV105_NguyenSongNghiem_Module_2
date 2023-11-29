package Session04;
import java.sql.Time;
public class StopWatch {
    private Time startTime , stopTime ;
    StopWatch () {
        this.startTime = new Time(System.currentTimeMillis());
    }
    Time getStartTime () {
        return startTime;
    }
    Time getStopTime () {
        return stopTime;
    }
    void start () {
        startTime = new Time(System.currentTimeMillis());
        System.out.println("Time start is : " + getStartTime());
    }
    void stop () {
        stopTime = new Time(System.currentTimeMillis());
        System.out.println("Time stop is : " + getStopTime());
    }
    long getElapsedTime () {
        return getStopTime().getTime()-getStartTime().getTime();
    }
}
class TestStopWatch {
    public static void main(String[] args) {
        StopWatch t = new StopWatch();
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Testing... ");
        t.stop();
        System.out.println("Elapsed time : " + t.getElapsedTime() + " milliseconds");
    }
}
