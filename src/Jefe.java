

public class Jefe extends Empleado{

    private int presupuestoDpto;


    public Jefe(String nombre, int sueldo, int presupuestoDpto) {
        super(nombre, sueldo);
        this.presupuestoDpto = presupuestoDpto;
    }
    public Jefe(String nombre, int sueldo) {
        super(nombre, sueldo);
        this.presupuestoDpto = 0;
    }

    public void asignarPpto ( int presupuestoDpto){

        this.presupuestoDpto = presupuestoDpto;
    }

    @Override
    public String toString() {
        return super.toString() +
                " presupuestoDpto=" + presupuestoDpto ;
    }
}
