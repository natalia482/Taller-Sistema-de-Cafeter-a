public class Ejercicio4 {
    public static void main(String[] args) {
        int cafeM= 50;
        int pedido = 3;
        while (cafeM >= 10){
           cafeM -= pedido;
           System.out.println("Pedido realizado con exito: " +pedido);
           System.out.println("Inventario restante: " +cafeM);
        }

        System.out.println("El inventario llego a 10 Unidades");
    }
}
