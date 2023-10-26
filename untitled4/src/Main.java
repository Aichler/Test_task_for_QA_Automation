import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Test1 test1 = new Test1();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int namber = in.nextInt();
        test1.setNamber(namber);

        System.out.println("Все должно было пройти успешно");
        System.out.println("Переходим к заданию 2");

        Test2 test2 = new Test2();

        Scanner st = new Scanner (System.in, "Cp866");
        System.out.print("Введите имя: ");
        String name = st.nextLine();
        test2.setFirstName(name);

        System.out.println("Надеюсь, я справился");
        System.out.println("Переходим к заданию 3");

        Test3 test3 = new Test3();
        test3.calculation();


    }


    }

