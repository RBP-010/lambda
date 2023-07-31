package lambda;

import java.util.ArrayList;
import java.util.List;

public class Evennumber {
    public void mathEven(int num){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println(" original list:" +(num/2));

    }

    public static void main(String[] args) {
        Evennumber obj = new Evennumber();
        obj.mathEven(1);
        DisplayDouble displayDouble = num ->
                System.out.println("Even number:" +(num / 2));
        displayDouble.mathDouble(2);

    }
}
@FunctionalInterface
interface DisplayEven{
    void mathEven(int num);
}


