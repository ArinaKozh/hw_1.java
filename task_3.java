import java.util.Scanner;

/*
 * Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
 */

public class task_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.print("Ввод числа ->");
        int first = sc.nextInt();
        System.out.print("Ввод знака ->");
        String zn = sc.next();
        System.out.print("Ввод числа ->");
        int second = sc.nextInt();
        sc.close();
        if (zn.equals("+")) System.out.println((first+second));
        else if (zn.equals("-")) System.out.println(first-second);
        else if (zn.equals("*")) System.out.print(first*second);
        else if (zn.equals("/")) System.out.print(first/second);
    }
}
