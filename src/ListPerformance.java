import java.util.List;

/**
 * Класс для тестирования производительности операций со списками.
 * Данный класс предоставляет методы для измерения времени выполнения основных операций над списками.**/
public class ListPerformance {

    /**
     * Тестирует производительность основных операций со списком.
     * @param list список, который будет тестироваться. Должен поддерживать операции добавления, получения, удаления и установки значений.
     * @param iterations количество итераций для каждой операции. Определяет сколько элементов будет добавлено, получено, удалено и изменено.
     */
    public static void PerformanceList(List<Integer> list, int iterations){

        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++){
            list.add(i);
        }
        long endTime = System.nanoTime();
        printResults("add", iterations, startTime, endTime);


        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++){
            list.get(i);
        }
        endTime = System.nanoTime();
        printResults("get", iterations, startTime, endTime);


        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++){
            list.remove(0);
        }
        endTime = System.nanoTime();
        printResults("remove", iterations, startTime, endTime);


        for(int i = 0; i < iterations;  i++) {
            list.add(i);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++){
            list.set(i, i * 2);
        }
        endTime = System.nanoTime();
        printResults("set", iterations, startTime, endTime);
    }

    /**
     * Выводит результаты тестирования производительности в консоль.
     * @param method название метода, производительность которого измеряется.
     * @param iterations количество итераций для данной операции.
     * @param startTime время начала выполнения операции в наносекундах.
     * @param endTime время окончания выполнения операции в наносекундах.
     */
    private static void printResults(String method, int iterations, long startTime, long endTime) {
        long duration = endTime - startTime;
        System.out.printf("| %-10s | %10d | %10d нс |\n", method, iterations, duration);
    }
}
