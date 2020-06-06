package PetShop;

import javax.swing.*;

public class ClientePetShop {

    public static void main(String[] args) {

        int cadastrarCliente = JOptionPane.showConfirmDialog(null, "Deseja cadastar um cliente?", ".: Cadastro de Cliente :.", JOptionPane.YES_NO_OPTION);
        if (cadastrarCliente == JOptionPane.YES_OPTION) {
            int i = 0;
            while (i<2){
                // Entrada de dados do Cliente

                PetShop idCliente = new PetShop();
                String nome = JOptionPane.showInputDialog(null, "Nome do Pet:", "..:: Detalhes do pedido ::.. ", 1);
                idCliente.setnomeAnimal(nome);
                String porte = JOptionPane.showInputDialog(null, "Porte do Pet [Pequeno, Médio ou Grande]", "..:: Detalhes do pedido ::.. ", 1);
                idCliente.setporteAnimal(porte);
                String tipo = JOptionPane.showInputDialog(null, "Tipo do Pet [Cachorro, Gato ou Outros]", "..:: Detalhes do pedido ::.. ", 1);
                idCliente.settipoAnimal(tipo);
                idCliente.getexame();

                // JOptionPane.showMessageDialog

                idCliente.detalhesDoPedido(); // total R$210
                i++;
            }
        }
    }
}