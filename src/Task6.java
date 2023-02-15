import java.util.Scanner;

public class Task6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a %2==0) {
            System.out.println("число четное");
        }
        else{
            System.out.println("число нечетное");
        }

    }
}
