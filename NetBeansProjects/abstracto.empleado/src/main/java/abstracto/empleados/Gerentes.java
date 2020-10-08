package abstracto.empleados;

public class Gerentes extends Empleados {

//Metodo constructor
    public Gerentes(String grupoEmpleado) {
        super(grupoEmpleado);
        setDatos("Gerente");

    }
    //Metodo abstracto

    @Override
    public void getDatosEmpleado() {
        System.out.println(" El grupo de empleados es:");
    }

}
