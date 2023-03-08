/*
 * Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
Ввод: 2? + ?5 = 69
Вывод: 24 + 45 = 69
 */
import java.util.Arrays;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.print("Введите уравнение:");
        String str = sc.nextLine().replaceAll("\\s+","");
        sc.close();
        String[] mas = new String[3];
        boolean check = false;
        mas = str.split("[+=]");
        String k = mas[2];
        String[] nmas = new String[] {"1","1",k};
        System.out.println(Arrays.toString(mas));
        System.out.println("Решения:");
            for (int i=0;i<mas[0].length();i++){
                if (Character.toString(mas[0].charAt(i)).equals("?")){
                   for (int n1=0;n1<=9;n1++){
                    nmas[0] = mas[0].replace("?", n1+"");
                    for (int j=0;j<mas[1].length();j++){
                        if (Character.toString(mas[1].charAt(j)).equals("?")){
                            for (int n2=0;n2<=9;n2++){
                             nmas[1] = mas[1].replace("?", n2+"");
                             for (int r=0;r<mas[2].length();r++){
                                if (Character.toString(mas[0].charAt(r)).equals("?")){
                                   for (int n3=0;n3<=9;n3++){
                                    nmas[2] = mas[2].replace("?", n3+"");
                                    if (Integer.parseInt(nmas[0])+Integer.parseInt(nmas[1])==Integer.parseInt(nmas[2])==true){
                                        System.out.printf("%s + %s = %s\n", nmas[0],nmas[1],nmas[2]);
                                        check = true;
                                        break;
                                    }
                                    if(n1==9 && n2==9 && n3==9 && check==false){
                                        System.out.println("Решения нет");
                                        break;
                                    }
                                    } }  
                                  }}}
                                 }

                                
                                
           
        }
     
    }
    
}
    }
}

