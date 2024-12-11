class BaseToDecimal{

    public static void main(String[] args){

        String binaryNumber = "111001";
        int decimalValue = Integer.parseInt(binaryNumber, 2);
        System.out.println("Binary " + binaryNumber + " to Decimal is " + decimalValue);
    }
}