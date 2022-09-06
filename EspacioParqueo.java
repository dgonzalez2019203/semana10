/** 
 * @author 
 * @file EspacioParqueo.java 
 * 
 */ 

public class EspacioParqueo {
    private int largo;
    private int ancho;
    private int altura;
    private boolean isTechado;
    private boolean isAereo;
    private boolean status; //false -> vacio ; true -> lleno
    private double precio;

    public EspacioParqueo() {
    }

    public EspacioParqueo(int largo, int ancho, int altura, boolean isTechado, boolean isAereo, boolean status, double precio) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
        this.isTechado = isTechado;
        this.isAereo = isAereo;
        this.status = status;
        this.precio = precio;
    }

    public int getLargo() {
        return this.largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return this.ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isIsTechado() {
        return this.isTechado;
    }

    public boolean getIsTechado() {
        return this.isTechado;
    }

    public void setIsTechado(boolean isTechado) {
        this.isTechado = isTechado;
    }

    public boolean isIsAereo() {
        return this.isAereo;
    }

    public boolean getIsAereo() {
        return this.isAereo;
    }

    public void setIsAereo(boolean isAereo) {
        this.isAereo = isAereo;
    }


    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "{" +
            " largo='" + getLargo() + "'" +
            ", ancho='" + getAncho() + "'" +
            ", altura='" + getAltura() + "'" +
            ", isTechado='" + isIsTechado() + "'" +
            ", isAereo='" + isIsAereo() + "'" +
            ", status='" + isStatus() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }


}
