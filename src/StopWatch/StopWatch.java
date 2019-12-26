package StopWatch;

public class StopWatch {
    private double startTime, endTime;

    private double getStartTime() {
        return startTime;
    }

    private double getEndTime() {
        return endTime;
    }

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    void stop() {
        this.endTime = System.currentTimeMillis();
    }

    double getElapsedTime() {
        return this.getStartTime() - this.getEndTime();
    }
}

class TestTimeSelectionSort {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(array);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}
