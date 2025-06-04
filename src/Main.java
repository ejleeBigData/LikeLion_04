public class Main {
    public static void main(String[] args) {
        boolean isAct = true;
        int b = 1;

        while(isAct) {
            System.out.println(b);
            b++;

            if(b>10000) {
                isAct = false;
            }
        }

    }
}