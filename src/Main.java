import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        System.out.println("This is calculator. I can operate with two values");
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please insert first value");
        String firstValue = reader.readLine();

        System.out.println("Please insert second value");
        String secondValue = reader.readLine();

        System.out.println("Please insert type of operation");
        System.out.println("Types: 1 = sum");

        String operation = reader.readLine();

        double val1 = Double.parseDouble( firstValue );
        double val2 = Double.parseDouble( secondValue );

        double res;
        switch ( operation ) {
            case "1":
                res = val1 + val2;
                System.out.println("Result: "  + res );
                break;
            case "2":
                res = val1 - val2;
                System.out.println("Result: "  + res );
                break;
            default:
                System.out.println("I don't know this type");
        }








//        // Reading data using readLine
//        System.out.println("Select type of the operation : '+' , '-' , '*' , '/' ");
//
//        char operation = reader.readLine().charAt(0);
//
//        System.out.println("Selected operation: " + operation);
//
//        // Reading data using readLine
//        System.out.println("Enter first value");
//        String valueOneString = reader.readLine();
//        double valueOne = Double.parseDouble(valueOneString);
//        System.out.println("Inserted value: " + valueOne);
//
//        System.out.println("Enter second value");
//        String valueTwoString = reader.readLine();
//        double valueTwo = Double.parseDouble(valueTwoString);
//        System.out.println("Inserted value: " + valueTwo);
//
//        System.out.println("Calculation in progress");
//
//        Double result = null;
//
//        switch(operation) {
//            case '+': result = valueOne + valueTwo;
//                break;
//            case '-': result = valueOne - valueTwo;
//                break;
//            case '*': result = valueOne * valueTwo;
//                break;
//            case '/': result = valueOne / valueTwo;
//                break;
//        }
//
//        if (result != null){
//            System.out.println("Result: " + result);
//        } else {
//            System.out.println("No Result");
//        }



    }
}