public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        // Pruebas de la clase Operacion
        int resultado1 = operacion.sumar(5, 10);
        System.out.println("Resultado de la suma de enteros: " + resultado1);
        // Prueba de la suma con números negativos
        double resultado2 = operacion.sumar(5.5, 10.5);
        System.out.println("Resultado de la suma de dobles: " + resultado2);
        // Prueba de la suma de tres enteros
        int resultado3 = operacion.sumar(1, 2, 3);
        System.out.println("Resultado de la suma de tres enteros: " + resultado3);
        // Prueba de la suma con un número negativo
        int resultado4 = operacion.sumar(-1, 10);
        System.out.println("Resultado de la suma con número negativo: " + resultado4);
    }
}
