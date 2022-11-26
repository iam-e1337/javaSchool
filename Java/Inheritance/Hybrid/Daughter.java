public class Daughter extends Father{
    public static void main(String[] args){
        Daughter obj = new Daughter();
        obj.grandFather(); // Accessing GrandFather.java
        obj.father(); // Accessing Father.java
    }
}
