/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author emili
 */
import javax.swing.JOptionPane;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n=JOptionPane.showInputDialog("Ingresa los números, separalos por un espacio");
        String j="";
        String m="";
        
        for(int x=0;x<n.length();x++){
        if(n.charAt(x)!=' '){
           j+=n.charAt(x);
        }else{
         x++;
                 while(x<n.length()){
                 m+=n.charAt(x);
                 x++;
                 }
        }
        }
        int w=Integer.parseInt(j);
        int e=Integer.parseInt(m);
        int resultado= w-e;
        JOptionPane.showMessageDialog(null,w+" - "+e+": "+resultado);
    }
    
}
