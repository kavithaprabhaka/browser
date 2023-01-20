public class printnum {
    public static void main(String[] args) {
        printnum(1);
    }
    public static void printnum(int num){
        if(num<=100){
            System.out.println(num); //1234......100
            num++;
            printnum(num);
        }
    }
}
