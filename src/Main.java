import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        int iterations = 1000;


        System.out.println("ArrayList Performance:");
        ListPerformance.PerformanceList(new ArrayList<>(), iterations);


        System.out.println("\nLinkedList Performance:");
        ListPerformance.PerformanceList(new LinkedList<>(), iterations);
    }
}