public class CajaRegistradora {
    public static void main(String[] args) {
        // la variable esta decladra como INT pero el atributo que se le pasa es String
        //Cambio el atributo de "" a numero
       // int cantidadVendida = "5";
        int cantidadVendida = 5;
        double precioUnitario = 4500;

        //No tiene ; al final, Se lo agrego para corregir
        double total = cantidadVendida * precioUnitario;
        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento = true) {
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total);
    }
}