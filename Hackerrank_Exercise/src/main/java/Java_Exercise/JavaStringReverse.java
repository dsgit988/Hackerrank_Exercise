package Java_Exercise;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int start = 0, end = A.length() - 1;
        while (start <= end){
            if (A.charAt(start) != A.charAt(end)){
                System.out.println("No");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Yes");
    }
}
