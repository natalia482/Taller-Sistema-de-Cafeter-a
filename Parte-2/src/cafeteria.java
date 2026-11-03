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
        int[] pedidoCantidad = {2, 1, 3, 6, 1, 2}; // unidades por pedido


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

            //Validar el descuento
            boolean validarDescuento = subTotal > precioDescuento;
            if (validarDescuento) {
                double valorDescuento = subTotal * descuento;
                double totalPago = subTotal - valorDescuento;

                System.out.printf("Pedido #%d | Producto: %s | Cantidad: %d | Categoría: %s | Subtotal: $%.2f | Descuento: %b| Valor Descuento: $%.2f | Total a pagar: $%.2f%n",
                        (i + 1),nombreProducto, cantidadPedido, DescripcionCate, subTotal, validarDescuento, valorDescuento, totalPago);
            }else{
                System.out.printf("Pedido #%d | Producto: %s | Cantidad: %d | Categoría: %s | Subtotal: $%.2f | Descuento: %b%n",
                        (i + 1),nombreProducto, cantidadPedido, DescripcionCate, subTotal, validarDescuento);
            }

            //Tarea 3: Validación de inventario



        }
    }
}
