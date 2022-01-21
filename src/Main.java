/**
 * @author AleksaRoad
 * @version 2.0
 */
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("Введите девять различных чисел массива от 1 до 10 в произвольной последовательности.");
        System.out.println("После каждого числа введите клавишу Enter:");
        Scanner massive = new Scanner(System.in);
        int n1 = massive.nextInt();
        int n2 = massive.nextInt();
        int n3 = massive.nextInt();
        int n4 = massive.nextInt();
        int n5 = massive.nextInt();
        int n6 = massive.nextInt();
        int n7 = massive.nextInt();
        int n8 = massive.nextInt();
        int n9 = massive.nextInt();
        System.out.print(55 - n1 - n2 - n3 - n4 - n5 - n6 - n7 - n8 - n9);
        massive.close();
    }
}
