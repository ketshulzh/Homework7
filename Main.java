package Homework1205;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //составьте программу, которая вычисляет произведение чисел от 1 до n. n вводится с клавиатуры.
        /* Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int sum = 1;
        for (int i = 1; i <=n; i++) {
            sum = sum*i;
        }
            System.out.println(sum);

         */
        // 4. С клавиатуры вводятся n чисел. Составьте программу, которая определяет кол-во отрицательных,
        // кол-во положительных и кол-во нулей среди введеных чисел.Значение n вводится с клавиатуры.
        /* Scanner in = new Scanner (System.in);
        int n = in.nextInt(); // Как сделать так, чтобы просили ввести n чисел, а не одно?  В целом, не уверена, что решила верно
        int positive = 0;
        int negative = 0;
        int nul = 0;
        for (int i = 1; i<=n; i++)
            if (n<0) {
                negative += 1;
            }
        else if (n>0) {
                positive += 1;
            }
        else if (n==0) {
            nul += 1;
            }
        System.out.println("Количество отрицательных " + negative);
        System.out.println("Количество положительных " + positive);
        System.out.println("Количество нулевых " + nul);
            }

         */
        //5. Составьте программы перевода старинных русских мер (счетчик цикла от 1 до 10)
        //* саженей в метры(1 сажень равна 2,1366 м)
        //* из дюймов в сантиметры(1 дюйм равен 2,5 см)
        //* футов в метры(1 фут равен 0,3048 м)
        //* драхм в граммы(1 драхма равна 3,7325 г)
        //* унций в граммы(1 унция равна 29,86 г)
        //* фунтов в килограммы(1 фунт равен 0,40951 кг)
        //* аршинов в метры(1 аршин равен 0,7112 м)
        //* золотников в граммы(1 золотник равен 4,2657 г)
        //* дюймов в миллиметры(1 дюйм равен 25,3995 мм)
/*
        Scanner in = new Scanner (System.in);
        int sazhen = in.nextInt();
        double metr = 1;
        for (int i = 1; i<=10; i++) {
            System.out.println(Math.round(sazhen*i*2.14*100)/100.0);
        }
        */


        //6. В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.
       /* Scanner in = new Scanner (System.in);
        double S = in.nextInt();
        int N = in.nextInt();
        for (int i = 1; i<=N; i++) {
            S = S + S * 0.03;
        }
        System.out.println(S);


        //7. Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать большие из них.
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 1; i <=10; i++) { //не совсем поняла, зачем тут цикл
            if (a > b) {
                System.out.println(a);
            }
            else if (a < b){
                System.out.println(b);
            }
            else if (a == b) {
                System.out.println("Числа равны");
*/
        //Case5. Арифметические действия над числами пронумерованы следующим
        //образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление. Дан
        //номер действия N (целое число в диапазоне 1–4) и вещественные числа A
        //и B (В не равно 0). Выполнить над числами указанное действие и вывести
        //результат
/*
        Scanner in = new Scanner (System.in);
        int number_a = in.nextInt();
        int number_b = in.nextInt();
        int operation_number = in.nextInt();
        switch (operation_number){
            case 1:
                System.out.println(number_a + number_b); break;
            case 2:
                System.out.println(number_a - number_b); break;
            case 3:
                System.out.println(number_a * number_b); break;
            case 4:
                System.out.println(number_a / number_b); break;
*/

//        Case6. Единицы длины пронумерованы следующим образом: 1 — дециметр,
//                2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр. Дан номер
//        единицы длины (целое число в диапазоне 1–5) и длина отрезка в этих
//        единицах (вещественное число). Найти длину отрезка в метрах.
        /* Scanner in = new Scanner (System.in);
        double length = in.nextDouble();
        int length_type = in.nextInt();
        switch (length_type){
            case 1:
                System.out.println(length / 10); break;
            case 2:
                System.out.println(length * 1000); break;
            case 3:
                System.out.println(length * 1); break;
            case 4:
                System.out.println(length / 1000); break;
            case 5:
                System.out.println(length / 100); break;
                }
        */
        //Case7. Единицы массы пронумерованы следующим образом: 1 — килограмм,
        //2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер. Дан номер единицы массы (целое число в диапазоне 1–5) и масса тела в этих единицах
        //(вещественное число). Найти массу тела в килограммах.
        /* Scanner in = new Scanner (System.in);
        double mass = in.nextInt();
        int mass_type = in.nextInt();
        switch (mass_type) {
            case 1:
                System.out.println(mass*1);
                break;
            case 2:
                System.out.println(mass / 1000000);
                break;
            case 3:
                System.out.println(mass / 1000);
                break;
            case 4:
                System.out.println(mass * 1000);
                break;
            case 5:
                System.out.println(mass * 100);
                break;
        }

         */
        

        }

        }




