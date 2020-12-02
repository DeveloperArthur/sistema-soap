package br.com.arthur.sistemasoap.infra.integracao;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sistemasoap")
public class ClienteWrapper {
    private ClienteXml clienteXml;

    //para uso do JAXB
    @Deprecated
    public ClienteWrapper() {
    }

    public ClienteWrapper(ClienteXml clienteXml) {
        this.clienteXml = clienteXml;
    }

    @XmlElement(name = "cliente")
    public ClienteXml getClienteXml() {
        return clienteXml;
    }

    public void setClienteXml(ClienteXml clienteXml) {
        this.clienteXml = clienteXml;
    }
}
