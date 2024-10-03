import java.util.*;
public class fnc4 {
    public static int multiplication(int a,int b){
        int mul = a * b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = multiplication(a,b);

        System.out.println("multiplication of two no= " +mul);
    }
}
