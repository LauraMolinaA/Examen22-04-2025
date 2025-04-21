public class Empleado {
    private String nombre;
    private int sueldo;


    protected Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    protected void subirSueldo(int aumento){
        //this.sueldo = this.sueldo + aumento;
        this.sueldo += aumento;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre +
                ", sueldo=" + sueldo;
    }



}
