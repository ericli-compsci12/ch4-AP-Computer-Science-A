public class multadd {
    public static void main(String[] args) {
        System.out.println(multadd(1.0,2.0,3.0));
        System.out.println(multadd(Math.cos(Math.PI/4),1.0/2,Math.sin(Math.PI/4)));
        System.out.println(multadd(1.0, Math.log10(10), Math.log10(20)));
        System.out.println(expSum(0));
    }
    
    public static double multadd(double a, double b, double c) {
        double temp = a * b + c;
        return temp;
    }
    
    public static double expSum(double x) {
        double temp = multadd(x, Math.exp(-x), Math.sqrt(1-Math.exp(-x)));
        return temp;
    }
}