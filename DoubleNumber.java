package lambda;

import java.util.ArrayList;
import java.util.List;

public class DoubleNumber {
    public void mathDouble(int num){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println(" original list:" +(num*2));

    }

    public static void main(String[] args) {
        DoubleNumber obj = new DoubleNumber();
        obj.mathDouble(1);
        DisplayDouble displayDouble = num ->
                System.out.println("Double number:" +(num * 2));
        displayDouble.mathDouble(2);
    }
}
@FunctionalInterface
interface DisplayDouble{
    void mathDouble(int num);
}