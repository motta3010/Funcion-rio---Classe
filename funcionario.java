public class funcionario {
    public String nome;
    public int idade;
    public double salario;
    public String endereço;
    public String funçao; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getFunçao() {
        return funçao;
    }

    public void setFunçao(String funçao) {
        this.funçao = funçao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


public void Efetua_cadastro(){
    System.out.println(nome + " Cadastrado com sucesso!");
}

public void Altera_cadastro(){
    System.out.println(nome + " Cadastro alterado com sucesso!");
}

public void Exclui_cadastro(){
    System.out.println(nome + " excluido com sucesso!");
}

public void Consulta_cadastro(){
    System.out.println("Nome: " + nome);
    System.out.println("Idade: "+ idade);
    System.out.println("Salário: "+ salario);
    System.out.println("Endereço: "+ endereço);
    System.out.println("Função: "+ funçao);
    System.out.println("Cadastro consultadoado com sucesso!");
}

public static void main(String[] args) {
    funcionario Marcelo = new funcionario();
    Marcelo.setNome("Marcelo");
    Marcelo.setIdade(21);
    Marcelo.setSalario(10.000);
    Marcelo.setEndereço("R. Nova 201");
    Marcelo.setFunçao("Gerente");
    Marcelo.Efetua_cadastro();
    Marcelo.Altera_cadastro();
    Marcelo.Exclui_cadastro();
    Marcelo.Consulta_cadastro();
}

}