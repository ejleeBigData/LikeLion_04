public class Main {
    public static void main(String[] args) {
        boolean isAct = false;

        while(isAct) {
            System.out.println("무한루프");
        }

        do {
            System.out.println("무한루프");
        } while (isAct);

    }
}