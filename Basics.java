class Basics{
    public static void main(String args[]){
        // Normal Print
        System.out.println("Hello World");

        // Variables & literals, e.g we store as variableType variableName = Literal
        int x = 6;
        float y = 6.5f;
        long l = 65444;
        boolean bool = true; // Can not store any value other than "true" or "false"
        int binary_num = 0b101;
        int takeCareOfZerosEasily = 1_00_000;
        System.out.println("Int + float : " + (x + y));
        System.out.println("Long : " + l);
        System.out.println("Boolean : " + bool);
        System.out.println("Storing int in binary format: " + binary_num);
        System.out.println("Easily track zeroes using underscore : " + takeCareOfZerosEasily);

        // Type Casting
        int a = 257;
        byte b = (byte) a; // Performs modulo operation on the number dividing by the range
        System.out.println("Value after type casting : " + b);
        // When conversion is done explicitly then it is called casting
    }
}