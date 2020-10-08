package abstracto.empleados;

public class Temporales extends Empleados {

    public Temporales(String grupoEmpleado) {
        super(grupoEmpleado);
        setDatos(" Temporales");
    }

    @Override
    public void getDatosEmpleado() {
        System.out.println("El grupo de empleados es: ");

    }

}
