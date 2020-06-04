/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.samples.entities;

import java.io.Serializable;
import java.sql.Date;
/**
 *
 * @author 
 */

public class Voto implements Serializable {
    private String idUsuario;
    private int idIniciativa;

    
    public Voto (String idUsuario, int idIniciativa){
        this.idUsuario=idUsuario;
        this.idIniciativa = idIniciativa;
    }

    public String getIdUsuario() {
		//ESTO ES UN COMENTARIO
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdIniciativa() {
        return idIniciativa;
    }

    public void setIdIniciativa(int idIniciativa) {
        this.idIniciativa = idIniciativa;
    }

    @Override
    public String toString() {
        return "Voto{" + "idUsuario=" + idUsuario + ", idIniciativa=" + idIniciativa + '}';
    }    
}
