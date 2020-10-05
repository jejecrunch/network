package chap03.ex3b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        OnSumFinishListener listener = new OnSumFinishListener() {
            @Override
            public void onSumFinish(SumTask task) {
                System.out.printf("%d 부터 %d 까지 합계는 %d\n",
                        task.getFrom(), task.getTo(), task.getResult());
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(8);
        int from = 1;
        for (int to = 10; to <= 1000000; to += 10) {
            SumTask sumTask = new SumTask(from, to);
            sumTask.setOnSumFinishListener(listener);
            service.submit(sumTask);
        }
        service.shutdown();
    }

}

