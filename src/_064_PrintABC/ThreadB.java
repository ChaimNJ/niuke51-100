package _064_PrintABC;

public class ThreadB extends Thread{
    private Run run;

    public ThreadB(Run run) {
            this.run=run;
    }

    @Override
    public void run() {
        run.serviceB();
    }
}
