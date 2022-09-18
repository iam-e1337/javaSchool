public class Calculate{
    
    static void myArea(int a, int b){
        int result;
        result = a*b;
        System.out.println("The area of the rectangle is: " + result);
    }

    static void myPeri(int a, int b){
        int result;
        result = 2*(a+b);
        System.out.println("The perimeter of the rectangle is: " + result);
    }

    public static void main(String[] args){
        myArea(5, 6);
        myPeri(5, 6);
    }
}