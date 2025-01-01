class calculator{
    //Methods
    public int add(int n1,int n2){
        return n1 + n2;
    }
    public int subtract(int n1,int n2){
        return n1 - n2;
    }

    // Example of Overloading
    public double add(double n1,double n2){
        return n1 + n2;
    }
}

class ClassAndObject{
    public static void main(String[] args){
        calculator calc = new calculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.subtract(7,2));
    }
}
