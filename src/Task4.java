import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a>b&&a>c){
            System.out.println(a);
        }
        else if (b>c&&b>a){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

    }
}
