public class Day6 {
    public static void main(String[] args) {
      s
        String strNumber = "123";
        String strFloat = "123.45";
        int intNumber = 456;

        int convertedInt = Integer.parseInt(strNumber);
        System.out.println("String to Integer: " + convertedInt);

        float convertedFloat = Float.parseFloat(strFloat);
        System.out.println("String to Float: " + convertedFloat);

        String intToStringValueOf = String.valueOf(intNumber);
        System.out.println("Integer to String using valueOf(): " + intToStringValueOf);

        String intToStringToString = Integer.toString(intNumber);
        System.out.println("Integer to String using toString(): " + intToStringToString);
    }
}
