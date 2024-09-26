public class Hospede {
    // Atributos
    String nome;
    int idade;
    String quarto;

    // Construtor
    Hospede() {
        this.quarto = "Nenhum";
    }

    // Métodos
    void setNome(String nomeHospede) {
        if (nomeHospede.equals("")) {
            this.nome = "Hospede sem nome";
        } else {
            this.nome = nomeHospede;
        }
    }

    void setIdade(int idadeHospede) {
        this.idade = idadeHospede;
    }

    void setQuarto(String quartoHospede) {
        this.quarto = quartoHospede;
    }

    void apresentar() {
        System.out.printf("Olá, sou o hóspede %s!\n", this.nome);
        System.out.printf("Tenho %d anos e estou no quarto %s\n", this.idade, this.quarto);
        System.out.println();
    }

    // Método main para testar a classe Hospede
    public static void main(String[] args) {
        // Criando e apresentando um hóspede
        Hospede hospede1 = new Hospede();
        hospede1.setNome("Carlos");
        hospede1.setIdade(30);
        hospede1.setQuarto("101");
        hospede1.apresentar();
    }
}
