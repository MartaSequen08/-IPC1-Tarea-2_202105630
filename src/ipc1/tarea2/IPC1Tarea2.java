/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1.tarea2;

/**
 *
 * @author marta
 */
public class IPC1Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario unico[] = new Usuario[1];
        unico[0]= new Usuario("202105630","Marta","Sequen","202105630");
        
        LoginT login= new LoginT(unico);
          login.setVisible(true);
    }
    
}
