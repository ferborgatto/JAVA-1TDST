package PetShop;

import javax.swing.*;
import java.io.Serializable;

public class PetShop extends Animal implements Serializable {

    // Atributos

    private double vacina;
    private double banho;
    private double exame = 70;
    private double total;
    private Animal animal;

    // Métodos

    public void detalhesDoPedido(){
        JOptionPane.showMessageDialog(null,
                "Pet Nome: "+getnomeAnimal()+
                        "\nPorte do Pet: "+getporteAnimal()+
                        "\nTipo do Pet: "+gettipoAnimal()+
                        "\nTotal: R$ "+this.total, "..:: Detalhes do pedido ::.. ",1);
    }

    public double totalDoCliente(){
        setTotal(exame + vacina + banho);
        return this.total;
    }

    public void realizarBanho() {
        int confirmarBanho = JOptionPane.showConfirmDialog(null, "Deseja dar Banho em seu Pet?", ".: Banho :.", JOptionPane.YES_NO_OPTION);
        if (confirmarBanho == JOptionPane.YES_OPTION) {
            if (getporteAnimal().toUpperCase().equals("PEQUENO")) {
                setbanho(40);
            } else if (getporteAnimal().toUpperCase().equals("MEDIO")) {
                setbanho(50);
            } else if (getporteAnimal().toUpperCase().equals("GRANDE")) {
                setbanho(60);
            } else {
                setbanho(0);
            }
        }
    }


    public void vacinaAnimal() {
        int confirmarVacina = JOptionPane.showConfirmDialog(null, "Deseja vacina seu Pet?", ".: Vacina :.", JOptionPane.YES_NO_OPTION);
        if (confirmarVacina == JOptionPane.YES_OPTION) {
            if (gettipoAnimal().toUpperCase().equals("CACHORRO") || gettipoAnimal().toUpperCase().equals("GATO")) {
                setvacina(100);
            } else if (gettipoAnimal().toUpperCase().equals("OUTROS")){
                setvacina(150);
            } else {
                setvacina(0);
            }
        }
    }

    // Geters and Setters

    public double getvacina() {
        return vacina;
    }

    public void setvacina(double vacina) {
        this.vacina = vacina;
    }

    public double getbanho() {
        return banho;
    }

    public void setbanho(double banho) {
        this.banho = banho;
    }

    public double getexame() {
        realizarBanho();
        vacinaAnimal();
        totalDoCliente();
        return exame;
    }

    public void setexame(double exame) {
        this.exame = exame;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
