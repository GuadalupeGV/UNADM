package abstracto.empleados;

public abstract class Empleados {

    //Atributo
    String grupoEmpleado;

    //Metodo constructor
    public Empleados(String grupoEmpleado) {
        this.grupoEmpleado = grupoEmpleado;
       System.out.println("El grupo de empleados es: " + grupoEmpleado); 
    }
    //Metodo abstracto
    public abstract void getDatosEmpleado();
    

//metodos setter y getter
    public void setDatos(String grupoEmpleado) {
        this.grupoEmpleado = grupoEmpleado;
    }

    public String getDatos(String grupoEmpleado) {
        return grupoEmpleado;
    }

}
