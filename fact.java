public class fact {
    public static void main(String[] args) {
        int num=5;     //5!=5*4*3*2*1=120
       long factorial=1;
       // for(i=1;i<=num;i++)
        for(int i=num;i>=1;i--)
        {
            factorial=factorial * i;
            System.out.println("factorial of a num is:"+ factorial);
        }
    }
}
