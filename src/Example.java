//package example;

class Add{

    public static double add(double a, double b) {
        return a + b;
    }
}

class Subtract{

    public static double subtract(double a, double b) {
        return a - b;
    }
}

class Multiply {
    public double multiply(double a, double b) {
        return a * b;
    }
}

        class Div
        {
            public double div(double a, double b) {
                try {
                    double result = a / b;
                    if (b != 0) {
                        return result;
                    }
                }
                catch (NumberFormatException e) {
                }
                System.out.println("Error");
                return 0;

            }
        }




class OperationsInterface{
    private Add add;
    private Div div;
    private Subtract subtract;
    private Multiply multiply;

    public OperationsInterface(Add add, Div div, Subtract subtract,Multiply multiply){
        this.add = add;
        this.div = div;
        //this.subtract = subtradt;
        //this.multiply=multyply;
    }

}

public class Example{
    public static void main(String... args){
        Add add = new Add();
        Div div = new Div();
        Subtract subtract = new Subtract();
        Multiply multiply = new Multiply();


        OperationsInterface gps = new OperationsInterface(add, div, subtract,multiply);

    }
}