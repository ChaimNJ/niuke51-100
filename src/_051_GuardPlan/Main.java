package _051_GuardPlan;

import java.util.Scanner;

//20%
/**
 * 战争游戏的至关重要环节就要到来了，这次的结果将决定王国的生死存亡，小B负责首都的防卫工作。首都位于一个四面环山的盆地中
 * ，周围的n个小山构成一个环，作为预警措施，小B计划在每个小山上设置一个观察哨，日夜不停的瞭望周围发生的情况。 一旦发生
 * 外地入侵事件，山顶上的岗哨将点燃烽烟，若两个岗哨所在的山峰之间没有更高的山峰遮挡且两者之间有相连通路，则岗哨可以观察
 * 到另一个山峰上的烽烟是否点燃。由于小山处于环上，任意两个小山之间存在两个不同的连接通路。满足上述不遮挡的条件下，一座
 * 山峰上岗哨点燃的烽烟至少可以通过一条通路被另一端观察到。对于任意相邻的岗哨，一端的岗哨一定可以发现一端点燃的烽烟。
 * 小B设计的这种保卫方案的一个重要特性是能够观测到对方烽烟的岗哨对的数量，她希望你能够帮她解决这个问题。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int sum = 0;
            sum += n;

            for (int i = 0; i < n/2+1; i++) {

                if (a[(i + 1) % n] < a[i]) {
                    int cur = (i + 2) % n;
                    int tmpmax = a[(i + 1) % n];
                    while (cur != i-1) {
                        if (tmpmax < a[cur]) {
                            sum++;
                            if(a[cur]>a[i]){
                                break;
                            }
                            tmpmax = a[cur];
                        }
                        cur = (cur + 1) % n;

                    }
                }

                if (a[(i - 1 + n) % n] < a[i]) {
                    int cur = (i + n - 2) % n;
                    int tmpmax = a[(i + n - 1) % n];
                    while (cur != i+1) {
                        if (tmpmax < a[cur]) {
                            sum++;
                            if(a[cur]>a[i]){
                                break;
                            }
                            tmpmax = a[cur];
                        }
                        cur = (cur + n - 1) % n;

                    }
                }
            }
            System.out.println(sum);

        }
    }
}
