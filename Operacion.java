public class Operacion {
    public int sumar(int a, int b) {
        if(a < 0 || b < 0) {
            System.out.println("Los números deben ser positivos");
            return -1;
        }
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
