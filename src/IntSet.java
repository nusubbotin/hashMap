import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class IntSet {
    Set<Integer> intSet = new HashSet<>();

    public IntSet() {
        for (int i = 0; i < 20; i++) {
            intSet.add(ThreadLocalRandom.current().nextInt(0, 1000));
        }
    }

    public void delNotEven(){
        for (Iterator<Integer> it = intSet.iterator(); it.hasNext(); ) {
            if (((Integer) it.next()) % 2 == 1) {
                it.remove();
            }
        }
    }
    
    @Override
    public String toString() {
        return Arrays.toString(intSet.toArray());
    }
}
