package Service;

import Entities.Cliente;
import Program.Cortesias;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private List<Cliente> listaClientes = new ArrayList<>();

    public void adicionarCortesia(Cliente cliente){
        listaClientes.add(cliente);

    }

    public Cliente buscaNumero(String telefone){
        return listaClientes.stream().filter(p-> p.getNumero().equals(telefone)).findFirst().orElse(null);

    }

    public void atualizarStatus(String telefone, boolean resgatado){
        Cliente cliente = buscaNumero(telefone);
        if (cliente != null){
            cliente.setResgatado(resgatado);
        }
    }

    public String  buscaCortesia(String telefone){
        Cliente cliente = buscaNumero(telefone);
        if (cliente == null){
            return "Cortesia não encontrada!";
        }

        String Status;

        if (Boolean.TRUE.equals(cliente.getResgatado())){
            Status = "Resgatado!";
        } else {
            Status = "Pendente";
        }
        return "Nome do cliente: "
                +cliente.getNome()
                + "\nItem: "
                + cliente.getItem()
                + "\nValor: "
                + cliente.getValor()
                + "\nStatus: "
                + Status
                + "\n";
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public boolean listaVazia(){
        return listaClientes.isEmpty();
    }


}
