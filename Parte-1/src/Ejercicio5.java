public class Ejercicio5 {
    public static void main(String[] args) {
        double montoApertura = 0;
        int intento = 1;

        do {
            System.out.println(intento + " Intento, Ingrese el monto de la caja ");
            System.out.println("Monto ingresado: $ " + montoApertura);
            if (montoApertura <= 0){
                System.out.println(intento + " Intento invalido, Ingrese el monto de la caja nuevamente ");
                montoApertura = 100000;
                intento++;
            }
        }while (montoApertura <= 0);

        System.out.println("¡Monto de apertura registrado exitosamente: $" + montoApertura + "!");
    }
}
