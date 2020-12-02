package br.com.arthur.sistemasoap.infra;

import br.com.arthur.sistemasoap.infra.integracao.ClienteWrapper;
import br.com.arthur.sistemasoap.infra.integracao.ClienteXml;
import org.springframework.stereotype.Repository;

import javax.xml.bind.JAXB;

@Repository
public class WebserviceSoap {

    public void salvaCliente(ClienteWrapper clienteXml) {
        System.out.println("Enviando xml para webservice");
        JAXB.marshal(clienteXml, System.out);
    }
}
