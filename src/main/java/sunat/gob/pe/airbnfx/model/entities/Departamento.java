/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sunat.gob.pe.airbnfx.model.entities;

import java.util.Date;

/**
 *
 * @author user
 */
public class Departamento {
    
    
   private int idDepartamento;
   private String Departamento;
   private String Provincia;
   private String Distrito;
   private String Direccion;
   private int Espacio;
   private String Descripcion;
   private int NumHabitacion;
   private int NumBanios;
   private int NumCochera;
   private int Capacidad;
   private float PrecioNoche;
   private Date  Checkout;
   private Date Checkin;

    public Departamento(int idDepartamento, String Distrito, String Direccion, int Espacio, String Descripcion, int NumHabitacion, int NumBanios, int NumCochera, int Capacidad, float PrecioNoche) {
        this.idDepartamento = idDepartamento;
        this.Distrito = Distrito;
        this.Direccion = Direccion;
        this.Espacio = Espacio;
        this.Descripcion = Descripcion;
        this.NumHabitacion = NumHabitacion;
        this.NumBanios = NumBanios;
        this.NumCochera = NumCochera;
        this.Capacidad = Capacidad;
        this.PrecioNoche = PrecioNoche;
    }
   
   

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEspacio() {
        return Espacio;
    }

    public void setEspacio(int Espacio) {
        this.Espacio = Espacio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getNumHabitacion() {
        return NumHabitacion;
    }

    public void setNumHabitacion(int NumHabitacion) {
        this.NumHabitacion = NumHabitacion;
    }

    public int getNumBanios() {
        return NumBanios;
    }

    public void setNumBanios(int NumBanios) {
        this.NumBanios = NumBanios;
    }

    public int getNumCochera() {
        return NumCochera;
    }

    public void setNumCochera(int NumCochera) {
        this.NumCochera = NumCochera;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public float getPrecioNoche() {
        return PrecioNoche;
    }

    public void setPrecioNoche(float PrecioNoche) {
        this.PrecioNoche = PrecioNoche;
    }

    public Date getCheckout() {
        return Checkout;
    }

    public void setCheckout(Date Checkout) {
        this.Checkout = Checkout;
    }

    public Date getCheckin() {
        return Checkin;
    }

    public void setCheckin(Date Checkin) {
        this.Checkin = Checkin;
    }
   
   
}
