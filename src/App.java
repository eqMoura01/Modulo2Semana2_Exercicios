public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programa iniciado...\n");

        /*
         * Instancia a classe Pessoa para a chamada dos metodos. (Isso não é necessario
         * mas facilita pra quem visualizar o codigo, principalmente pra Jrs.)
         */
        Pessoa pessoa = new Pessoa();

        /*
         * Essas variaveis serão usadas apenas para usar o construtor que não inicializa
         * vazio!
         * (Não é um requisito dos exercicios mas eu quis fazer, tão pouco são
         * necessarias essas variaveis na classe Main.)
         */
        String nome;
        String localOrigem;
        int idade;

        /*
         * Cria um objeto da classe Pessoa com minhas informações e o construtor vazio.
         * O que deve retornar um localOrigem = "Brasil".
         */
        Pessoa a = new Pessoa();
        a.setNome("Victor");
        a.setIdade(21);

        /*
         * Salva nas variaveis abaixo todas os dados do objeto criado a cima
         * (Usarei eles para criar um novo Objeto de pessoa usando o construtor que
         * recebe os parametros de inicialização).
         */
        nome = a.getNome();
        localOrigem = a.getLocalOrigem();
        idade = a.getIdade();

        /*
         * Cria um novo objeto da classe Pessoa com o valor das variaveis inicializadas
         * acima. (Não era um requisito dos exercicios, mas eu quis usar o construtor
         * que nao inicializa um objeto vazio)
         */
        Pessoa b = new Pessoa(nome, idade, localOrigem);

        /*
         * Chama o metodo clonar() da classe Pessoa, que deve retornar um NOVO Objeto
         * com as mesmas caracteristicas do objeto usado como base para ser clonado.
         */
        Pessoa c = pessoa.clonar(b);

        /*
         * Adiciona +1 a variavel 'idade' do objeto 'b'
         * (Apesar do objeto 'c'ser um clone do objeto 'b' que envelhece um ano, ele
         * ainda está
         * com a idade = 21. Pois o metodo envelhecer é chamado somente após o objeto
         * 'b' ter sido clonado!)
         */
        b.envelhecer();

        /*
         * Imprime no console o objeto e sua referencia na memoria e em seguida o valor
         * de cada atributo e de cada objeto
         * 
         * Obs: '\n' faz a quebra de linha pra nao precisar usar mais um 'sout'!
         */
        System.out.println(a);
        System.out.println(a.printPessoa() + "\n");

        System.out.println(b);
        System.out.println(b.printPessoa() + "\n");

        System.out.println(c);
        System.out.println(c.printPessoa() + "\n");
    }
}
