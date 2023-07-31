package lambda;

public class Lambdaoperation {
    public void mathAddition(int a, int b){
        System.out.println("Addition result:" +(a+b));
    }
    public void mathSubstraction(double a, double b){
        System.out.println("Substraction result:" +(a-b));
    }
    public void mathDivision(int a, int b){
        System.out.println("Division result:" +(a/b));
    }

    public static void main(String[] args) {
        Lambdaoperation obj = new Lambdaoperation();
//        obj.mathAddition(2,3);
//        obj.mathSubstraction(4,3);
//        obj.mathDivision(6,2);
        DisplayResult displayResult = (a, b) ->
        System.out.println("Addition:" + (a+b));
        displayResult.mathAddition(3,4);
        DisplayResultSub displayResultSub = (a, b) ->
                System.out.println("Substraction:" +(a-b));
        displayResultSub.mathSubstraction(6, 4);
        DisplayResultDiv displayResultDiv = (a, b) ->
                System.out.println("Division:" +(a/b));
        displayResultDiv.mathDivision(6,2);
    }
}
@FunctionalInterface
interface DisplayResult{
    void mathAddition(int a, int b);
}
@FunctionalInterface
interface DisplayResultSub{
    void mathSubstraction(double a, double b);
}
@FunctionalInterface
interface DisplayResultDiv{
    void mathDivision(int a, int b);
}
