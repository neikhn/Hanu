package week4;
import java.util.Scanner;
public class act11 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Input the number of rows for the triangle: ");
        int rows = user.nextInt();
        int halfRows = rows / 2;
        user.close();
        for (int i = 1; i <= halfRows + 1; i ++) {
            for(int j = 1; j <= i; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= halfRows; i ++) {
            for(int j = halfRows; j >= i; j --) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}
