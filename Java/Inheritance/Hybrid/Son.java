public class Son extends Father{
    public static void main(String[] args){
        Son obj = new Son();
        obj.grandFather(); // Accessing GrandFather.java
        obj.father(); // Accessing Father.java
    }
}
