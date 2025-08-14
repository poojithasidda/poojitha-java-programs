import java.util.Scanner;
class Neon {
    public static void main(String[] args) {
        int sum = 0, square;
        Scanner sc = new Scanner(System.in);
        int num=9;
        square=num*num;
        while (square != 0) {
            sum+= square%10;
            square=square/10;
        }
        System.out.println(sum);
        if (sum==num) {
            System.out.println("it is a Neon Number");
        } else {
            System.out.println("it is not a Neon Number");
        }
    }
}

