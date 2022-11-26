class animals{
    int legs = 4;
}

public class cats extends animals{
    public static void main(String[] args){
        animals a = new animals();
        System.out.println("Cats have "+a.legs+" legs.");
    }
}