public class CallByValueDrefrence {
    public static void main(String[] args) {

        CallByValueDrefrence obj = new CallByValueDrefrence();


    }

    public void sum(int a, int b) {
        a = 30;
        b = 40;
        int c = a + b;
        System.out.println(c);


    }
}