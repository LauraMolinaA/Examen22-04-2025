public class Currito extends Empleado{

    private String nombreJefe;

    public Currito(String nombre, int sueldo, String nombreJefe) {
        super(nombre, sueldo);
        this.nombreJefe = nombreJefe;
    }
    public Currito(String nombre, int sueldo) {
        super(nombre, sueldo);
        this.nombreJefe = null;
    }

    public void asignarJefe (String nombreJefe){
        this.nombreJefe=nombreJefe;
    }

    @Override
    public String toString() {
        return super.toString() +
                " nombre del jefe=" +nombreJefe;
    }
}
