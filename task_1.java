/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 *  а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120
 */
import java.util.Scanner;
public class task_1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in, "Cp866");
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        sc.close();
        int triangle = 0;
        int fact = 1;
        for(int i=1;i<=n; i++){
            triangle += i;
            fact*=i;
        }
        System.out.printf("Треугольное число = %d\nФакториал = %d\n",triangle,fact);
        

    }
}