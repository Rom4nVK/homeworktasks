import java.util.Scanner;

public class Task8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int b=1; b<=a;b++){
            if (b%2==0) {
                System.out.println(b);
            }
        }
    }
}
