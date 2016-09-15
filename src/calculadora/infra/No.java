/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.infra;

/**
 *
 * @author Victor
 */
public class No {
    
    private String dado;
    
    private No prox;

    public No(String dado) {
        this.dado = dado;
        this.prox = null;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
}
