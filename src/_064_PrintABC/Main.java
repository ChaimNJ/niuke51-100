package _064_PrintABC;

public class Main {
    public static void main(String[] args) {
        Run run = new Run();
        for (int i = 0; i < 10; i++) {
            ThreadA threadA = new ThreadA(run);
            ThreadB threadB = new ThreadB(run);
            ThreadC threadC = new ThreadC(run);
            threadA.start();
            threadB.start();
            threadC.start();
        }
    }
}
