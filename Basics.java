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

        // Operators, Switch-case, If-Else and Loops works the same way as c++ but here only
        // true/false works for conditions to work, if(1)/while(1) will throw error here.

        // Jagged Array : When the no of cols are inconsistent among rows

        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[4];

        for(int n[]: arr){
            for(int m:n){
                m = (int)(Math.random() * 100);
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}