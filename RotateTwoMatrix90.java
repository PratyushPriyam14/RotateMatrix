import java.io.*;
import java.util.*;
public class RotateTwoMatrix90
{
    public static void main(String []args)throws Exception {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        //transpose of matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reverse of an matrix
        for (int i = 0; i < arr.length; i++) {
            int leftindex = 0;
            int rigthindex = arr.length - 1;
            while (leftindex < rigthindex) {
                int temp = arr[i][leftindex];
                arr[i][leftindex] = arr[i][rigthindex];
                arr[i][rigthindex] = temp;
                leftindex++;
                rigthindex--;
            }
        }
        display(arr);
    }
        public static void display(int [][]arr){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                   System.out.print(arr[i][j]+" ");
                }System.out.println();
        }
    }
}
