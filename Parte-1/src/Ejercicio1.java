public class Ejercicio1 {
    public static void main(String[] args){

        String nombre = "Cafe";
        float precioUni = 3500;
        int cantidadIn = 30;
        boolean disponible = true;
        char codigoProduct = 'A';

        System.out.println(String.format("CÓDIGO : %c", codigoProduct));
        System.out.println(String.format("NOMBRE : %s", nombre));
        System.out.println(String.format("PRECIO UNITARIO : %.2f", precioUni));
        System.out.println(String.format("CANTIDAD : %d", cantidadIn));
        System.out.println(String.format("DISPONIBLE : %b", disponible));
    }
}
