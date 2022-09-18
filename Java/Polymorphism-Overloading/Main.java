public class Main{
    static int mySum(int a, int b){
        return a+b;
    }

    static int mySum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        System.out.println("The sum of two numbers are: " + mySum(5, 5));
        System.out.println("The sum of three numbers are: " + mySum(5, 1, 2));
    }
}