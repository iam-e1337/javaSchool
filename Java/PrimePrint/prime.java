public class prime {
    public static void main(String[] args){
        int numCount = 0;
        int i = 0;
        while(numCount != 10){
            int count = 0;
            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
               System.out.print(i+ " ");
               numCount++;
            }
            i++;
        }
    }
}