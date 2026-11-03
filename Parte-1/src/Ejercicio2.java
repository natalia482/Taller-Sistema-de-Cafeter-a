public class Ejercicio2 {
    public static void main(String[] args){
        double subTotal = 42500;
        double descuento = 0.15;
        double precioDescuento = 30000;

        //Validar el descuento
        boolean validarDescuento = subTotal > precioDescuento;
        if (validarDescuento) {
            double valorDescuento = subTotal * descuento;
            double totalPago = subTotal - valorDescuento;

            System.out.printf("¿Tiene derecho al descuento?: %b%n", validarDescuento);
            System.out.printf("Valor del descuento: $%.2f%n", valorDescuento);
            System.out.printf("Total a pagar: $%.2f%n", totalPago);

        }else{
            System.out.printf("No aplica descuento ");
            System.out.printf("Total a pagar: " + subTotal);
        }


    }
}
