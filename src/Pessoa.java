public class Pessoa {
    private String nome;
    private int idade;
    private String localOrigem;

    // Construtores...
    public Pessoa(String nome, int idade, String localOrigem) {
        this.nome = nome;
        this.idade = idade;
        this.localOrigem = localOrigem;
    }

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.localOrigem = "Brasil";
    }

    // Getters && Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    // Metodos...
    public String printPessoa() {
        return "Nome: " + nome + ", Idade: " + idade + ", Local de Origem: " + localOrigem;
    }

    public void envelhecer() {
        this.idade += 1;
    }

    public Pessoa clonar(Pessoa pessoa) {
        Pessoa clone = new Pessoa();

        clone.nome = pessoa.nome;
        clone.idade = pessoa.idade;
        clone.localOrigem = pessoa.localOrigem;

        return clone;
    }

}
