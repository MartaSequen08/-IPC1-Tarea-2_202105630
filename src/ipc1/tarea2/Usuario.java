/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.tarea2;

/**
 *
 * @author marta
 */
public class Usuario {
    //caracteristicas
    String password;
    String apellido;
    String name;
    String carnet;
    
    //metodo constructor
    Usuario(String password,String name,String apellido,String carnet){
    this.password=password;
    this.apellido=apellido;
    this.name=name;
    this.carnet=carnet;
}
    //get y set

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getApellido() {
        return apellido;
    }
    
     public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String nombre) {
        this.name = name;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    
}
