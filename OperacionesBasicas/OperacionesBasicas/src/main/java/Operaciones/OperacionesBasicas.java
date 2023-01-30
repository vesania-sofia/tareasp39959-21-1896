/*1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author daguilae
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declaramos las variables para la opciones, los datos numericos y el resultado
        float opc=0,dato1=0,dato2=0,result=0;
        // imprime en pantalla las ociones de operar
        System.out.println("1.-sumar    2.-restar   3.-multiplicar  4.-dividir  otro numero.-salir");
        System.out.println("seleccione una opcion: ");
        
        // saca en pantalla una ventana emergente para elegir la opcion
        opc=Integer.parseInt(JOptionPane.showInputDialog("ingrese opcion: "));
        
        //ciclo if para ingresar los numeros en una ventana emergente
        if(opc>0&&opc<5){
            dato1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
            dato2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero numero: "));
            
        // otro ciclo if para que ejecute la operacion seleccionada
        if(opc!=0){
            if(opc==1)
                result=dato1+dato2;
            if(opc==2)
                result=dato1-dato2;
            if(opc==3)
                result=dato1*dato2;
            if(opc==4)
                result=dato1/dato2;
            
         //imprime en pantalla el resultado 
            System.out.print("el resultado es: ");
            System.out.println(result);
        }
        
        //imprime el resultado en la ventana emergente
        JOptionPane.showMessageDialog(null, "el resultado es: "+result);
        }
            System.out.println("Cerrando el programa...");
            JOptionPane.showMessageDialog(null,"Hasta luego");        
    }
    
}
