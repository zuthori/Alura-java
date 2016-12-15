//Modelando e criando metodos para funcinário.

public class Funcionario {
    
    String registroGeral;
    String departamento;
    String nome;
    double salario;
    String dataEntrada;
    
    void recebeAumento(double valor){
        this.salario += valor; 
    }
    
    double calculaGanhoAnual(){
       return this.salario = salario * 12;
    }
    
}