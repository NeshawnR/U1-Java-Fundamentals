public class L3 {

    //add the main method header below.

    /*
    Literal value is a value written directly into the code.
    An expression is a value written using variables or operators.
    A magic Number is a literal value that doesn't relate to the progame or solution
    AVIOD MAGIC NUMBERS
     */


    public static void main(String[] args) {

        int literalValue = 5;
        int expression = 5 + 6;
        int expression2 = literalValue + 6;
        int expression3 = literalValue + literalValue;

        //Examples of Literal Values
        double literalValue2 = 26.4;
        boolean literalValue3 = false;
        String literalValue4 = "people";

        //Examples of Expressions - the result of expression must match the data type
        double expression4 = 2.4 + 3.6;
        boolean expression5 = 5 > 6;

        //int badExample = 5.4-0.4;

        //String expression is called STRING CONCATENATION. you can combine Strings using the +

        String expression6 = "A movie theater is full of " + literalValue4;
        System.out.println(expression6);

        String message1 = "The store has ";
        String message2 = "apples in stock.";
        int numApples = 20;

        System.out.println("The store has 20 apples in stock.");
        System.out.println("The store has " + numApples + " apples on stock.");
        System.out.println(message1 + numApples + message2);
    }
}