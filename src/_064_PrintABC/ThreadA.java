package _064_PrintABC;

public class ThreadA extends Thread{
    private Run run;

    public ThreadA(Run run) {
            this.run=run;
    }

    @Override
    public void run() {
        run.serviceA();
    }
}
