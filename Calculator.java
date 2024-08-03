public class Calculator {

    int num1;
    int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getAdd() {
        return num1 + num2;
    };

    public int getSubtract() {
        return num1 - num2;
    };
    
    public int getMultiply() {
        return num1 * num2;
    };
    
    public double getDivide() {
        double dbNum1 = num1;
        double dbNum2 = num2;
        return dbNum1 / dbNum2;
    };
    
    public int getExponent() {
        int sum = 1;
        for (int i = 0; i < num2; i++) {
            sum *= num1;
        }
        return sum;
    };

    public static void main(String[] args) {
        Calculator calc = new Calculator(3, 4);
        System.out.println(String.format("Add: %d", calc.getAdd()));
        System.out.println(String.format("Subtract: %d", calc.getSubtract()));
        System.out.println(String.format("Multiply: %d", calc.getMultiply()));
        System.out.println(String.format("Divide: %.2f", calc.getDivide()));
        System.out.println(String.format("Exponent: %d", calc.getExponent()));
    };
}