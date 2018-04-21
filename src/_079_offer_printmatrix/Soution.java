package _079_offer_printmatrix;

import java.util.ArrayList;

public class Soution {
    public ArrayList<Integer> printMatrix(int [][] m) {
        ArrayList<Integer> list = new ArrayList<>();
        int row= m.length;
        int col=0;
        int start=0;
        if(row>0){
            col= m[0].length;
        }
        if(col<=0||row<=0){
            return list;
        }

        while(start*2<col&&start*2<row){
            printcircle(m,col,row,start,list);
            start++;
        }
        return list;
    }

    private void printcircle(int[][] m, int col, int row, int start,ArrayList<Integer> list) {
        int endX = col-1-start;
        int endY = row-1-start;
        for (int i = start; i <= col-start-1; i++) {
            list.add(m[start][i]);
        }
        if(start<endY)
        for (int i = start+1; i <=row-start-1 ; i++) {
            list.add(m[i][col-1-start]);
        }
        if(start<endX&&start<endY)
        for (int i = col-2-start; i >=start ; i--) {
            list.add(m[row-1-start][i]);
        }
        if(start<endX&&start<endY-1)
        for (int i = row-2-start; i >=start+1 ; i--) {
            list.add(m[i][start]);
        }
    }

}
