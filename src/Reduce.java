public class Reduce {
    public static void main(String[] args) {
        int i = 0;
        int a = 100;

        while (a>0) {
            if(i%2==0) {
                a = a / 2;
            }
            else {
                a = a - 1;
            }
            i++;
        }

        System.out.println(i);
    }
}
