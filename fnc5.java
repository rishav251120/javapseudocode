import java.util.Scanner;

public class fnc5 {
    public static void main(String args[]){
        int n = 10;
        SumOfOdds(n);
    }
    public static void SumOfOdds(int n){
        int total = 0;
        for (int number = 1; number<=n; number += 2){
            total += number;
        }
        System.out.println("The sum of all odd no from 1 to "+ n + " is :" + total);
    }
}
