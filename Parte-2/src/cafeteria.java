public class cafeteria {
    public static void main(String[] args) {
        String[] nombres = {
                "Café americano",
                "Capuchino",
                "Jugo naranja",
                "Tostada",
                "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido

        //Tarea 4- Apertura de turno
        double montoApertura = -100000;
        int intento = 1;

        do {
            System.out.println(intento + " Intento, Ingrese el monto de la caja ");
            System.out.println("Monto ingresado: $ " + montoApertura);
            if (montoApertura <= 0) {
                System.out.println(intento + " Intento invalido, Ingrese el monto de la caja nuevamente ");
                montoApertura = 100000;
                intento++;
            }
        } while (montoApertura <= 0);

        System.out.println("¡Monto de apertura registrado exitosamente: $" + montoApertura + "!");

        //Tarea 5 - Reporte de cierre
        //Declarar variables antes del for para que se lean
        int pedidosProcesados = 0;
        double totalRecaudado = 0.0;
        double mayorValor = 0.0;
        int numPedidoMayor = 0;

        //Tarea 1 - Procesamiento de pedidos
        for (int i = 0; i < pedidoProducto.length; i++) {
            int numPedido = pedidoProducto[i];
            int cantidadPedido = pedidoCantidad[i];

            //Información del producto
            String nombreProducto = nombres[numPedido];
            double precioProducto = precios[numPedido];
            char categoriaProducto = categorias[numPedido];

            //SUBTOTAL
            double subTotal = precioProducto * cantidadPedido;

            //Categoria
            categoriaProducto = Character.toUpperCase(categorias[numPedido]);
            String DescripcionCate = "";
            switch (categoriaProducto) {
                case 'B':
                    DescripcionCate = "Bebida Caliente";
                    break;
                case 'F':
                    DescripcionCate = "Categoría: Bebida fría";
                    break;
                case 'C':
                    DescripcionCate = "Categoría: Comida";
                    break;
                case 'P':
                    DescripcionCate = "Categoría: Postre";
                    break;
                default:
                    System.out.println("Error: Código de categoría no reconocido.");
                    break;
            }
            //System.out.printf("Pedido #%d | Producto: %s | Cantidad: %d | Categoría: %s | Subtotal: $%.2f%n", (i + 1),nombreProducto, cantidadPedido, DescripcionCate, subTotal);

            //Tarea 2 - Descuento por pedido
            double descuento = 0.15;
            double precioDescuento = 12000;
            double totalPago = subTotal;
            //Validar el descuento
            boolean validarDescuento = subTotal > precioDescuento;
            if (validarDescuento) {
                double valorDescuento = subTotal * descuento;
                totalPago = subTotal - valorDescuento;

                System.out.printf("Pedido #%d | Producto: %s | Cantidad: %d | Categoría: %s | Subtotal: $%.2f | Descuento: %b| Valor Descuento: $%.2f | Total a pagar: $%.2f%n",
                        (i + 1), nombreProducto, cantidadPedido, DescripcionCate, subTotal, validarDescuento, valorDescuento, totalPago);
            } else {
                System.out.printf("Pedido #%d | Producto: %s | Cantidad: %d | Categoría: %s | Subtotal: $%.2f | Descuento: %b%n",
                        (i + 1), nombreProducto, cantidadPedido, DescripcionCate, subTotal, validarDescuento);
            }

            //Pedidos acumulados
            pedidosProcesados++;
            totalRecaudado += totalPago;

            if (totalPago > mayorValor) {
                mayorValor = totalPago;
                numPedidoMayor = i + 1;
            }
        }
        System.out.println("        REPORTE DE CIERRE         ");
        System.out.println("==================================");
        System.out.printf("Total de pedidos procesados: %d%n", pedidosProcesados);
        System.out.printf("Total recaudado en el turno: $%.2f%n", totalRecaudado);
        System.out.printf("Pedido de mayor valor: Pedido #%d ($%.2f)%n", numPedidoMayor, mayorValor);
        System.out.println("==================================");

    }
}