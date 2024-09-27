import java.util.Scanner;

public class test20 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("양의 정숫값의 자릿수를 표시합니다.");
        int x;
        do {
           System.out.print("양의 정숫값:");
           x = stdIn.nextInt();
            } while (x <= 0);
        int digit = 0 ;
        while (x>0){
            digit++;
            x /= 10;
        }
        System.out.println("입력한 숫자는"+ digit + "자리입니다.");
    }
}
