package ui;

import dominio.Cliente;
import dominio.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(1000.0F);
        ContaCorrente c2 = new ContaCorrente();
        c2.depositar(200.0F);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Vitor");
        c1.setCliente(cliente1);
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Thiago");
        c2.setCliente(cliente2);

        List contas = new ArrayList();

        contas.add(c1);
        contas.add(c2);

        for (int i = 0; i< contas.size(); i++){
           ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println("Cliente: " + cc.getCliente().getNome() + "\nSaldo: " + cc.getSaldo() + "\n=============");
        }
    }
}
