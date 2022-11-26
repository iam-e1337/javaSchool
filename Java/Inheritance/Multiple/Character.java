public class Character implements Walk, Run{
    public void walkChar(){
        System.out.println("The character is walking.");
    }
    
    public void runChar(){
        System.out.println("The character is running.");
    }
    public static void main(String[] args){
        Character obj = new Character();

        int running = 0;
        int walking = 0;

        if (walking == 1){
            obj.walkChar();
        }
        else if(running == 1){
            obj.runChar();
        }
        else{
            System.out.println("Character at rest.");
        }
    }
}
