package br.com.arthur.sistemasoap.dominio;

import br.com.arthur.sistemasoap.dominio.cliente.Cliente;
import br.com.arthur.sistemasoap.infra.WebserviceSoap;
import br.com.arthur.sistemasoap.infra.integracao.ClienteWrapper;
import br.com.arthur.sistemasoap.infra.integracao.ClienteXml;
import br.com.arthur.sistemasoap.infra.integracao.EnderecoXml;
import br.com.arthur.sistemasoap.infra.integracao.PagamentoXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnviaClienteAoWebservice {
    private WebserviceSoap webserviceSoap;

    @Autowired
    public EnviaClienteAoWebservice(WebserviceSoap webserviceSoap) {
        this.webserviceSoap = webserviceSoap;
    }

    public ClienteWrapper envia(Cliente cliente) {
        ClienteWrapper clienteEmXml = converteClienteEmXml(cliente);
        webserviceSoap.salvaCliente(clienteEmXml);
        return clienteEmXml;
    }

    private ClienteWrapper converteClienteEmXml(Cliente cliente) {
        PagamentoXml pagamentoXml = new PagamentoXml();
        pagamentoXml.setAgencia(cliente.getPagamento().getAgencia());
        pagamentoXml.setBanco(cliente.getPagamento().getBanco());
        pagamentoXml.setConta(cliente.getPagamento().getConta());
        pagamentoXml.setValorTotal(cliente.getPagamento().getValorTotal());

        EnderecoXml enderecoXml = new EnderecoXml();
        enderecoXml.setBairro(cliente.getEndereco().getBairro());
        enderecoXml.setCep(cliente.getEndereco().getCep());
        enderecoXml.setCidade(cliente.getEndereco().getCidade());
        enderecoXml.setEstado(cliente.getEndereco().getEstado());
        enderecoXml.setLogradouro(cliente.getEndereco().getLogradouro());
        enderecoXml.setNumero(cliente.getEndereco().getNumero());

        ClienteXml clienteXml = new ClienteXml();
        clienteXml.setCpf(cliente.getCpf());
        clienteXml.setDataDeNascimento(cliente.getDataDeNascimento());
        clienteXml.setEmail(cliente.getEmail());
        clienteXml.setNome(cliente.getNome());
        clienteXml.setRg(cliente.getRg());
        clienteXml.setSenha(cliente.getSenha());
        clienteXml.setTelefone(cliente.getTelefone());
        clienteXml.setEndereco(cliente.getEndereco());
        clienteXml.setPagamento(cliente.getPagamento());

        return new ClienteWrapper(clienteXml);
    }
}
