import java.util.ArrayList;

public class Test3 {
    ArrayList<Integer> list = new ArrayList<>();
    int maxValue = 20;
    int max = 100;
    double valueList = 0;


    ArrayList<Integer> rnd(int max)
    {
        System.out.println("Весь список чисел:");
        for(int i = 0; i < maxValue; i ++){
            list.add((int) (Math.random() * max));
                    System.out.print(" [" + list.get(i) + "] ");
        }
        return list;
    }

    void calculation(){
        rnd(max);
        System.out.println();
        System.out.println("Список чисел кратных трем");
        for(int i = 0; i < maxValue; i ++){
            valueList = list.get(i)%3;
            if(valueList == 0) {
                System.out.print( " [" + list.get(i) + "] ");
            }
        }
    }



}
