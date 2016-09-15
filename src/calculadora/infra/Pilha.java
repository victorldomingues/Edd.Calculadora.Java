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
public class Pilha {
     private No topo;

    public Pilha() {
        this.topo = null;
    }
    
    public boolean isEmpty(){
        return (this.topo == null);
    }
    
    public Boolean push(String c){
        No novoNo = new No(c);
        
        novoNo.setProx(this.topo);
        this.topo = novoNo;
        
        return true;
    }
    
    public String pop(){
        No aux = this.topo;
        
        if (this.isEmpty())
            return null;
        
        this.topo = this.topo.getProx();
        
        aux.setProx(null);
        
        return aux.getDado();
        
    }
}
