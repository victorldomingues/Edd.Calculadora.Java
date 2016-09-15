/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.comandos;

/**
 *
 * @author Victor
 */
public class CalculadoraComando {
    char codOperacao;
    String resultadoOp;
    public String multiplicacao(String op1, String op2){
        resultadoOp = "";
        if(!op2.equals("null") || !op2.isEmpty())
            resultadoOp += (Float.parseFloat(op1) * Float.parseFloat(op2));
        else
            resultadoOp += Float.parseFloat(op1) * Float.parseFloat(op1);  
        return resultadoOp;
    }
    
    public String divisao(String op1, String op2){
        resultadoOp = "";    
        if(Float.parseFloat(op2) != 0){
        if(!op2.equals("null") || !op2.isEmpty())
            resultadoOp += (Float.parseFloat(op1) / Float.parseFloat(op2));
        else
            resultadoOp += Float.parseFloat(op1) / Float.parseFloat(op1);  
        }else
                resultadoOp = "Não é possível dividir por zero!";
        return resultadoOp;
    }
    
    public String soma(String op1, String op2){
        resultadoOp = "";
        if(!op2.equals("null") || !op2.isEmpty())
            resultadoOp += (Float.parseFloat(op1) + Float.parseFloat(op2));
        else
            resultadoOp += Float.parseFloat(op1) + Float.parseFloat(op1);  
        return resultadoOp;
    }
    
    public String subtracao(String op1, String op2){
        resultadoOp = "";
        if(!op2.equals("null") || !op2.isEmpty())
            resultadoOp += (Float.parseFloat(op1) - Float.parseFloat(op2));
        else
            resultadoOp += Float.parseFloat(op1) - Float.parseFloat(op1);  
        return resultadoOp;
    }
    
    public boolean eOperacao(String op){
        boolean validacao = false;
        switch (op) {
            case "+" :
                validacao = true;
                break;
            case "-" :
                validacao = true;
                break;
            case "*" :
                validacao = true;
                break;
            case "/" :
                validacao = true;
                break;
            default :
                validacao = false;
        }
        return validacao;
    }
}
