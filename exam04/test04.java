import java.util.Scanner;

public class test04 {
    public  static void  main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("카운트업 합니다.");
        int x;
        do {
            System.out.print("양의 정숫값:");
            x = stdIn.nextInt();
        } while (x <= 0);

        for (int i = 0; i <= x ; i++)
            System.out.println(i);
    }
}
