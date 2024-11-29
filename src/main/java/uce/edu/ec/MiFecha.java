package uce.edu.ec;

public class MiFecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor por defecto
    public MiFecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1990;
    }

    // Constructor con parámetros
    public MiFecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Métodos get
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    // Métodos set con validación
    public boolean setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
            return true;
        }
        return false;
    }

    public boolean setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
            return true;
        }
        return false;
    }

    public boolean setAnio(int anio) {
        if (anio > 0) {
            this.anio = anio;
            return true;
        }
        return false;
    }

    // Método que valida si la fecha es correcta
    public boolean fechaValida() {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > 31) {
            return false;
        }

        // Validación de días según el mes
        if (mes == 2) {
            if (esBisiesto()) {
                return dia <= 29; // Febrero en año bisiesto
            }
            return dia <= 28; // Febrero en año no bisiesto
        }


        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30; // Meses con 30 días
        }
        return true; // Meses con 31 días
    }

    // Método para verificar si el año es bisiesto
    private boolean esBisiesto() {
        return (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, anio);
    }
}

