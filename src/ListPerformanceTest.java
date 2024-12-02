import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListPerformanceTest {

    @org.junit.jupiter.api.Test
    public void testAddMethodPerformance() {
        List<Integer> arrayList = new ArrayList<>();
        ListPerformance.PerformanceList(arrayList, 1000);
        assertEquals(1000, arrayList.size(), "ArrayList should contain 1000 elements after add operations.");

        List<Integer> linkedList = new LinkedList<>();
        ListPerformance.PerformanceList(linkedList, 1000);
        assertEquals(1000, linkedList.size(), "LinkedList should contain 1000 elements after add operations.");
    }
    @org.junit.jupiter.api.Test
    public void testGetMethodPerformance() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.get(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        assertTrue(duration < 1000000, "Get operation should be fast enough for ArrayList.");

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        assertTrue(duration < 1000000, "Get operation should be fast enough for LinkedList.");
    }
    @org.junit.jupiter.api.Test
    public void testRemoveMethodPerformance() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        assertTrue(duration < 1000000, "Remove operation should be fast enough for ArrayList.");

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        assertTrue(duration < 1000000, "Remove operation should be fast enough for LinkedList.");
    }
    @org.junit.jupiter.api.Test
    public void testSetMethodPerformance() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(i, i * 2);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        assertTrue(duration < 1000000, "Set operation should be fast enough for ArrayList.");

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(i, i * 2); // Теперь это работает корректно
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        assertTrue(duration < 1000000, "Set operation should be fast enough for LinkedList.");
    }

}