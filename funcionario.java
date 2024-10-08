public class funcionario {
    public String nome;
    public int idade;
    public double salario;
    public String endereço;
    public String funçao; 


public funcionario(){

}

public void Efetua_cadastro(){
    System.out.println("Cadastro efetuado com sucesso!");
}

public void Altera_cadastro(){
    System.out.println("Cadastro alterado com sucesso!");
}

public void Exclui_cadastro(){
    System.out.println("Cadastro excluido com sucesso!");
}

public void Consulta_cadastro(){
    System.out.println("Cadastro consultadoado com sucesso!");
}

public static void main(String[] args) {
    funcionario funcionario1 = new funcionario();

    funcionario1.Efetua_cadastro();
    funcionario1.Altera_cadastro();
    funcionario1.Exclui_cadastro();
    funcionario1.Consulta_cadastro();
}

}