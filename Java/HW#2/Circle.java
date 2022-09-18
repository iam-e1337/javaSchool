public class Circle{
    static double myArea(int r){
        return 3.14 * (r*r);
    }

    static double myCirm(int r){
        return 2*(3.14*r);
    }

    public static void main(String[] args){
        System.out.println("The area of a circle is: " + myArea(10));
        System.out.println("And its circumference is: " + myCirm(10));
    }
}