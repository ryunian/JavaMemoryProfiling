import java.util.Map;
import java.util.Random;

public class GCoverheadLimitExceeded {
    public static void main(String[] args){
        // java -Xmx100m -XX:+UseParallelGC GCoverheadLimitExceeded
        // java.lang.OutOfMemoryError: GC overhead limit exceeded 발생
        Map map = System.getProperties( );
        Random r = new Random( );
        while ( true) {
            map.put(r.nextInt( ) , "value");
        }
    }
}
