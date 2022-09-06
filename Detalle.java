/** 
 * @author 
 * @file Detalle.java 
 * 
 */ 
import java.util.ArrayList;

public class Detalle {
    private int horasEstacionado; 
    private String placa;
    private String marcal;
    private String modelo;
    private double montoTotal;
    private boolean status;
    private Estacionamiento estacionamientos;


    public Detalle() {
    }



    public Detalle(int horasEstacionado, String placa, String marcal, String modelo, double montoTotal, boolean status, Estacionamiento estacionamientos) {
        this.horasEstacionado = horasEstacionado;
        this.placa = placa;
        this.marcal = marcal;
        this.modelo = modelo;
        this.montoTotal = montoTotal;
        this.status = status;
        this.estacionamientos = estacionamientos;
    }
 


    public int getHorasEstacionado() {
        return this.horasEstacionado;
    }

    public void setHorasEstacionado(int horasEstacionado) {
        this.horasEstacionado = horasEstacionado;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarcal() {
        return this.marcal;
    }

    public void setMarcal(String marcal) {
        this.marcal = marcal;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMontoTotal() {
        return this.montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
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

    public Estacionamiento getEstacionamientos() {
        return this.estacionamientos;
    }

    public void setEstacionamientos(Estacionamiento estacionamientos) {
        this.estacionamientos = estacionamientos;
    }
  

    @Override
    public String toString() {
        return "{" +
            " horasEstacionado='" + getHorasEstacionado() + "'" +
            ", placa='" + getPlaca() + "'" +
            ", marcal='" + getMarcal() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", montoTotal='" + getMontoTotal() + "'" +
            ", status='" + isStatus() + "'" +
            ", estacionamientos='" + getEstacionamientos() + "'" +
            "}";
    }

  
}
