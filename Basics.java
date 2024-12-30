class Basics{
    public static void main(String args[]){
        // Normal Print
        System.out.println("Hello");

        // Variables & literals, e.g we store as variableType variableName = Literal
        int x=5;
        float y=6.7f;
        long l=65444;
        boolean b=true;
        int binary_num=0b101;
        int takeCareOfZerosEasily=1_00_000;
        System.out.println("Int + float : "+x+y);
        System.out.println("Long : "+l);
        System.out.println("Boolean : "+b);
        System.out.println("Storing int in binary format: "+binary_num);
        System.out.println("Easily count zeroes using underscore : "+takeCareOfZerosEasily);

    }
}