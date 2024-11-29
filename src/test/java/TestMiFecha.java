import uce.edu.ec.MiFecha;

public class TestMiFecha {
    public static void main(String[] args) {
        // Crear objeto usando constructor por defecto
        MiFecha fecha1 = new MiFecha();
        System.out.println("Fecha 1: " + fecha1);
        System.out.println("Fecha válida: " + fecha1.fechaValida());
        System.out.println("");

        // Crear objeto usando constructor con parámetros
        MiFecha fecha2 = new MiFecha(29, 2, 2024); // Año bisiesto
        System.out.println("Fecha 2: " + fecha2);
        System.out.println("Fecha válida: " + fecha2.fechaValida());
        System.out.println("");

        // Probar con fecha no válida
        MiFecha fecha3 = new MiFecha(31, 2, 2023); // Fecha incorrecta
        System.out.println("Fecha 3: " + fecha3);
        System.out.println("Fecha válida: " + fecha3.fechaValida());
        System.out.println("");

         // Probar con mes no valido
        MiFecha fecha4 = new MiFecha(32, -1, 2023); // Fecha incorrecta
        System.out.println("Fecha 4: " + fecha4);
        System.out.println("Fecha válida: " + fecha4.fechaValida());
        System.out.println("");

        // Cambiar fecha y validar
        if (fecha3.setDia(28)) {
            System.out.println("Fecha 3 Cambiada: " + fecha3);
        } else {
            System.out.println("Día no válido");
        }

        // Intentar asignar un mes no válido
        if (!fecha3.setMes(13)) {
            System.out.println("Mes no válido");
        }

        // Imprimir fechas
        System.out.println("");
        System.out.println("Fecha 1: " + fecha1);
        System.out.println("Fecha 2: " + fecha2);
        System.out.println("Fecha 3 Cambiada: " + fecha3);
        System.out.println("Fecha 4: " + fecha4);

    }
}
