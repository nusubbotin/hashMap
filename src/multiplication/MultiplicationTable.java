package multiplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class MultiplicationTable {
    public static final int MAX_SIZE = 15;
    Set<multiplicationElement> mTable = new HashSet<>();

    public MultiplicationTable() {
        do{
            mTable.add(new multiplicationElement(ThreadLocalRandom.current().nextInt(0, 9),ThreadLocalRandom.current().nextInt(0, 9)));

        }while (mTable.size() < MAX_SIZE);
    }

    @Override
    public String toString() {
        String str = " ";
        for (multiplicationElement elem : mTable) {
            str = str + elem + '\n';
        }
        return str;
    }
}
