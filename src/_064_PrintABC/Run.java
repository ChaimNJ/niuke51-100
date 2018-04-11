package _064_PrintABC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run {
    private  volatile int flag = 1;
    private  static ReentrantLock lock = new ReentrantLock();
    private  static Condition conditionA = lock.newCondition();
    private  static Condition conditionB = lock.newCondition();
    private  static Condition conditionC = lock.newCondition();
    public void serviceA(){
        lock.lock();
        while(flag!=1){
            try {
                conditionA.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A");
        flag=2;
        conditionB.signalAll();
        lock.unlock();
    }
    public void serviceB(){
        lock.lock();
        while(flag!=2){
            try {
                conditionB.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("B");
        flag=3;
        conditionC.signalAll();
        lock.unlock();
    }
    public void serviceC(){
        lock.lock();
        while(flag!=3){
            try {
                conditionC.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("C");
        flag=1;
        conditionA.signalAll();
        lock.unlock();
    }

}
