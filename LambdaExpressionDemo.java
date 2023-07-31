package lambda;

public class LambdaExpressionDemo {
    public void displayName(String name){
        System.out.println("Hi " +name);
    }
    public void disNameAge(String name ,int age){
        System.out.println("Hi " +name+ " "+age);
    }

    public static void main(String[] args) {
        LambdaExpressionDemo obj = new LambdaExpressionDemo();
//        obj.displayName("seema");
//        obj.disNameAge("seema",34);
        NameDisplay nameDisplay = name ->
                System.out.println("Hi, " +name);
        nameDisplay.dispName("Aman");
        NameAgeDisplay nameAgeDisplay = (name, age) ->
                System.out.println("Hi, " +name+ " "+age);
        nameAgeDisplay.dispNameAge("seema",34);
    }
}
@FunctionalInterface
interface NameDisplay{
    void dispName(String name);
}
@FunctionalInterface
interface NameAgeDisplay{
    void dispNameAge(String name,int age);
}
