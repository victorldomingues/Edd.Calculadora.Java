/*
-----------------------------------------------------------
===========================================================
***********************************************************
Alunos: 
    Victor Luiz Domingues Ra: 20747083
***********************************************************
===========================================================
-----------------------------------------------------------
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import calculadora.infra.Pilha;
import java.util.Scanner;
import calculadora.comandos.CalculadoraComando;

/**
 *
 * @author Victor
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String entrada;
        boolean end = false;
        Pilha pilha  = new Pilha();
        CalculadoraComando comando  =  new CalculadoraComando();
        System.out.println("================ CALCULADORA ================ \n");
        System.out.println("\t - Digite 'sair' para sair do programa \n  ");
        System.out.println("\t - Operações \n  ");
        System.out.println("\t \t - Digite '+' para somar   ");
        System.out.println("\t \t - Digite '-' para subtrair   ");
        System.out.println("\t \t - Digite '*' para multiplicar   ");
        System.out.println("\t \t - Digite '/' para dividir  ");
        System.out.println("\t \t - Digite '=' para mostrar o resultado \n \n  ");
        System.out.println("\t \t - Obs: Informe pelo menos 1(um) numero e em seguida uma operação  \n \n  ");
        while(!end){
            String resultado  = "";
            String expressao  = "";
            if(pilha.isEmpty())
                System.out.println("Digite um número: ");
            else
                System.out.println("Digite um número ou uma operação: ");
            
            entrada =  new Scanner(System.in).next();
            if(entrada.equals("sair"))
                end = true;
            else if(entrada.equals("=")){
                String op = pilha.pop();
                if(comando.eOperacao(op)){
                    String op2 = pilha.pop();
                    String op1 = pilha.pop();                    
                    switch (op) {
                        case "+":
                            resultado = comando.soma(op1, op2);
                            break;
                        case "-":
                            resultado = comando.subtracao(op1, op2);
                            break;
                        case "*":
                            resultado = comando.multiplicacao(op1, op2);
                            break;
                        case "/":
                            resultado = comando.divisao(op1, op2);
                            break;
                    }
                    expressao = op1 + " " + op + " " + op2 + " = " + resultado;
                }
                System.out.println("---------------------------------");
                System.out.println("Resultado: " + resultado);
                System.out.println("Expressão: " + expressao);
            }else
                pilha.push(entrada);
        }
        System.out.println("Você saiu do programa, Oringado por usar a calculadora! ");
    }
    
}
