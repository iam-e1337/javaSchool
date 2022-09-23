public class DemoOperator {
    public static void main(String[] args){
        boolean logik = true;
        boolean logik1 = false;
        int rel = 2;
        int rel1 = 5;
        int num = 5+5;


        if(logik && logik1){
            System.out.println("Use of logical operator.");
        }
        else if(rel>rel1){
            System.out.println("Use of relational operator.");
        }
        else{
            System.out.println("Use of arithmetic operator. Addition:5+5="+num);
        }
    }
}
