import java.util.Scanner;

public class test06 {
    public  static void  main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("1부터 N까지의 합을 구합니다.");
        int n;
        do {
            System.out.print("n의 값:");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;
        for (int i = 1; i < n ; i++) {
            System.out.print(i + " + ");
            sum += i;
        }
        System.out.print(n + " = ");
        sum += n;
        System.out.println(sum);
    }
}
