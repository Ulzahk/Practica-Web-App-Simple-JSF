/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author PRACTICANTE
 */
@ManagedBean
@ApplicationScoped
public class Test {
    private String user, pwd;
    private Integer pais, puntoCardinal;
    /**
     * Creates a new instance of Test
     */
    public Test() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getPais() {
        return pais;
    }

    public void setPais(Integer pais) {
        this.pais = pais;
    }

    public Integer getPuntoCardinal() {
        return puntoCardinal;
    }

    public void setPuntoCardinal(Integer puntoCardinal) {
        this.puntoCardinal = puntoCardinal;
    }

}
