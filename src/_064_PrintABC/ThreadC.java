package _064_PrintABC;

public class ThreadC extends Thread{
    private Run run;

    public ThreadC(Run run) {
            this.run=run;
    }

    @Override
    public void run() {
        run.serviceC();
    }
}
