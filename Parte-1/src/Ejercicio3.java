public class Ejercicio3 {
    public static void main(String[] args) {
        char codigoCategoria = 'b';

        //toUpperCase para que no pase error entre mayusculas y minusculas
        codigoCategoria = Character.toUpperCase(codigoCategoria);

        switch (codigoCategoria) {
            case 'B':
                System.out.println("Categoría: Bebida caliente");
                System.out.println("IVA aplicado: 0%");
                break;
            case 'F':
                System.out.println("Categoría: Bebida fría");
                System.out.println("IVA aplicado: 5%");
                break;
            case 'C':
                System.out.println("Categoría: Comida");
                System.out.println("IVA aplicado: 8%");
                break;
            case 'P':
                System.out.println("Categoría: Postre");
                System.out.println("IVA aplicado: 8%");
                break;
            default:
                System.out.println("Error: Código de categoría no reconocido.");
                break;
        }
    }
}
