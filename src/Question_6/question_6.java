package Question_6;

import java.util.Scanner;

public class question_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        int n = size;
        int[][] a = new int[size][size];
        System.out.println("New matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i > 0)&&(i < n-1)&&((j == 0) ||(j == n-1))) {
                    a[i][j] = 0;
                }else if((i>1)&&(i<n-2)&&((j == 1) ||(j == n-2))){
                    a[i][j] = 0;
                }else
                    a[i][j] = 1;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
