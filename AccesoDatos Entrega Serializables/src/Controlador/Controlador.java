/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.Web;
import java.io.*;


/**
 *
 * @author Usuario
 */
public class Controlador {
    File fichero;
    FileOutputStream fileout;
    ObjectOutputStream dataOS;
    ObjectInputStream dataIS;
    
    public Controlador() throws FileNotFoundException, IOException{
        File fichero = new File("fichCursos.dat");
        FileOutputStream fileout = new FileOutputStream(fichero,true);  //crea el flujo de salida
         //conecta el flujo de bytes al flujo de datos
        dataOS = new ObjectOutputStream(fileout); 
        dataIS = new ObjectInputStream(new FileInputStream(fichero));
    }
    
    public void escribiWeb(Web w) throws IOException{
        
        dataOS.writeObject(w);
        
    }
    
    public Web leerWeb() throws IOException, ClassNotFoundException{
        Web w = new Web();
        w = (Web)dataIS.readObject();
        dataIS.close();
        return w;
    }
    
    public void cerrarFlujo() throws IOException{
        dataOS.close();
    }
    
    
}
