/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.jah.model.POJO;

import java.util.Date;

/**
 *
 * @author 1946810
 */
public class Cliente extends Cadastro{
    
    //atributos
    private String tipoAposentadoriaCliente;
    private double _RMI;
    private Date _DIB;
    private Date dataE;
    private Date dataS;
    private long tempoComum;
    private long tempoConvertido;

    //métodos
    public String getTipoAposentadoriaCliente() {
        return tipoAposentadoriaCliente;
    }

    public void setTipoAposentadoriaCliente(String tipoAposentadoriaCliente) {
        this.tipoAposentadoriaCliente = tipoAposentadoriaCliente;
    }

    public double getRMI() {
        return _RMI;
    }

    public void setRMI(double _RMI) {
        this._RMI = _RMI;
    }

    public Date getDIB() {
        return _DIB;
    }

    public void setDIB(Date _DIB) {
        this._DIB = _DIB;
    }

    public Date getDataE() {
        return dataE;
    }

    public void setDataE(Date dataE) {
        this.dataE = dataE;
    }

    public Date getDataS() {
        return dataS;
    }

    public void setDataS(Date dataS) {
        this.dataS = dataS;
    }

    public long getTempoComum() {
        return tempoComum;
    }

    public void setTempoComum(long tempoComum) {
        this.tempoComum = tempoComum;
    }

    public long getTempoConvertido() {
        return tempoConvertido;
    }

    public void setTempoConvertido(long tempoConvertido) {
        this.tempoConvertido = tempoConvertido;
    }
    
    
}
