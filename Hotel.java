import java.util.ArrayList;

public class Hotel {
    ArrayList<Hospede> hospedes = new ArrayList<>();

    // Método para adicionar um hóspede
    void adicionarHospede(Hospede h) {
        hospedes.add(h);
    }

    // Exibir a lista de hóspedes
    void listarHospedes() {
        int quantidadeHospedes = hospedes.size();
        System.out.printf("O hotel atualmente possui %d hóspedes:\n", quantidadeHospedes);

        for (Hospede hospede : hospedes) {
            hospede.apresentar();
        }
    }

    // Método main para testar a classe Hotel
    public static void main(String[] args) {
        Hotel meuHotel = new Hotel();

        // Criando hóspedes e adicionando ao hotel
        Hospede hospede1 = new Hospede();
        hospede1.setNome("Carlos");
        hospede1.setIdade(30);
        hospede1.setQuarto("101");
        meuHotel.adicionarHospede(hospede1);

        Hospede hospede2 = new Hospede();
        hospede2.setNome("Maria");
        hospede2.setIdade(25);
        hospede2.setQuarto("102");
        meuHotel.adicionarHospede(hospede2);

        Hospede hospede3 = new Hospede();
        hospede3.setNome("João");
        hospede3.setIdade(40);
        hospede3.setQuarto("103");
        meuHotel.adicionarHospede(hospede3);

        // Listar todos os hóspedes
        meuHotel.listarHospedes();
    }
}
