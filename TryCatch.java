public class TryCatch {
    public static void main(String[] args) {
        try {
            int x = 10;
            int z = 0;
            System.out.println(x+z);

        }catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Nymber 2 is a zero");
        }finally {
            System.out.println("does something");

        }
    }
}
