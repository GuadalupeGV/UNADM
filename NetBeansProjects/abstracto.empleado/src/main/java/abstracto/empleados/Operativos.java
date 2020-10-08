package abstracto.empleados;

public class Operativos extends Empleados {

    //Metodo constructor
    public Operativos(String grupoEmpleado) {
        super(grupoEmpleado);

    }

    //Metodo abstracto
    @Override
    public void getDatosEmpleado() {
        System.out.println("El grupo de empleados es: " + grupoEmpleado);

    }

}
