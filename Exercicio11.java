public class Funcionario {
 
    String registroGeral;
    String departamento;
    String nome;
    double salario;
    Data dataEntrada;
    
    void recebeAumento(double valor){
        this.salario += valor; 
    }
    
    double calculaGanhoAnual(){
       return this.salario = salario * 12;
    }
    
}
    class Data{
        int dia;
        int mes;
        int ano;
        
        void preencheData(int dia, int mes, int ano){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
    }
}
public class TestaFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        
        f1.nome = "Albert";
        f1.salario = 1000;
        
        f1.dataEntrada = new Data();
        f1.dataEntrada.preencheData(13, 9, 2012);
     }
}