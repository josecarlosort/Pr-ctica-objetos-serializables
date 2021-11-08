/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.io.Serializable;
/**
 *
 * @author Usuario
 */
public class Web implements Serializable{
    private String dominio;
    private String propietario;
    private int num_cursos;
    private String tema;
    private String nombre;

    public Web(String dominio, String propietario, int num_cursos, String tema, String nombre) {
        this.dominio = "";
        this.propietario = propietario;
        this.num_cursos = num_cursos;
        this.tema = tema;
        this.nombre = nombre;
    }

    public Web() {
       this.dominio = "";
        this.propietario = "";
        this.num_cursos = 0;
        this.tema = "";
        this.nombre = "";
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getNum_cursos() {
        return num_cursos;
    }

    public void setNum_cursos(int num_cursos) {
        this.num_cursos = num_cursos;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
