/*Crie um método mostra(), que não recebe nem devolve parâmetro 
algum e simplesmente imprime todos os atributos do nosso funcionário.
*/
void mostra(){
        System.out.println("Registro Geral: " + this.registroGeral);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("nome: " + this.nome);
        System.out.println("Salario R$: " + this.salario);
        System.out.println("Data de entrada: " + this.dataEntrada);
    }
}