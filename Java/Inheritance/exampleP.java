public class exampleP {
        //data member
        private String college="Engineering 11";
        //member method
        public String getCollege(){
        return college;
        }

        public static void main(String[] args){
            exampleP myObj = new exampleP();
            System.out.println(myObj.college);
            System.out.println(myObj.getCollege());
        }
}

class no extends exampleP{
    public static void main(String[] args){
        exampleP myObj = new exampleP();
        System.out.println(myObj.college);
        System.out.println(myObj.getCollege());
    }
}
