/** 
 * @author 
 * @file Estacionamiento.java 
 * 
 */ 
import java.util.ArrayList;


public class Estacionamiento {
    private String nombre;
    private String direccion;
    private ArrayList<EspacioParqueo> espaciosParqueo;

    public Estacionamiento() {
        ArrayList<EspacioParqueo> espaciosParqueo;
        espaciosParqueo = new ArrayList<EspacioParqueo>();
        
        this.espaciosParqueo = espaciosParqueo;
    }


    public Estacionamiento(String nombre, String direccion, double precio) {
        ArrayList<EspacioParqueo> espaciosParqueo;
        espaciosParqueo = new ArrayList<EspacioParqueo>();

        this.nombre = nombre;
        this.direccion = direccion;
        this.espaciosParqueo = espaciosParqueo;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public ArrayList<EspacioParqueo> getEspaciosParqueo() {
        return this.espaciosParqueo;
    }

    public void setEspaciosParqueo(EspacioParqueo newParqueo){   
        EspacioParqueo parqueo = new EspacioParqueo();

        parqueo.setAltura(newParqueo.getAltura());
        parqueo.setAncho(newParqueo.getAncho());
        parqueo.setLargo(newParqueo.getLargo());
        parqueo.setIsTechado(newParqueo.getIsTechado());
        parqueo.setIsAereo(newParqueo.getIsAereo());
        parqueo.setStatus(newParqueo.getStatus());
        parqueo.setPrecio(newParqueo.getPrecio());

        this.espaciosParqueo.add(parqueo);        
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +            
            "}";
    }

}
