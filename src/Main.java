public class Main {
    public static void main(String[] args) {
       int number = 12 ;

       String binaryString =  Integer.toBinaryString(number);
       System.out.println("결과 : "+ binaryString);

       String HexString = Integer.toHexString(number);
       System.out.println("16진수 : " + HexString);

    }
}