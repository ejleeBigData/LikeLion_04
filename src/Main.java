//2025.06.04 논리연산자 연습
public class Main {
    public static void main(String[] args) {
        int age = 33;

        boolean hasID = true;

        if(age >= 18 && hasID) {
            System.out.println("접속가능.");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if(isWeekend || isHoliday) {
            System.out.println("쉼");
        }

        boolean isRaining = true;
        if(!isRaining) {
            System.out.println("해");
        } else {
            System.out.println("비");
        }
    }
}