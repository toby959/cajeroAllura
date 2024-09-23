
package com.christiangaray.cajero.allura.logica;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Usuario {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false)
    private String nombre;
    
    @Column(unique = true, nullable = false)
    private String password;
    
    
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Cuenta cuenta;
     
    //############################################### 

    public Usuario() {
    }

    public Usuario(String nombre, String password, Cuenta cuenta) {
        this.nombre = nombre;
        this.password = password;
        this.cuenta = cuenta;
    }

    public Long getId() {
        return id;
    }

   // sin set id

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

   
    
}
