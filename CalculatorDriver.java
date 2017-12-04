public class CalculatorDriver {
    public static void main(String[] args){
        double [] num = new double[5];
        num[0] = 15.0;
        num[1] = 12.0;
        num[2] = 13.4;
        num[3] = 12.4;
        num[4] = 14.4;

    System.out.println(Calculator.getAverage(num));
    System.out.println(Calculator.getSum(num));
    System.out.println(Calculator.getProduct(num));


    System.out.println(Calculator.getAverage(5.0, 3.0));
    System.out.println(Calculator.getAverage(5.0,3.0,6.0));
    System.out.println(Calculator.getSum(12.0, 18.0));
    System.out.println(Calculator.getSum(12.0,18.0,24.0));
    System.out.println(Calculator.getProduct(18.0,15.0));
    System.out.println(Calculator.getProduct(18.0,15.0,12.0));
    }
}
