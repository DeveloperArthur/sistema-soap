package br.com.arthur.sistemasoap.infra.integracao;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class PagamentoXml {
    private String agencia;
    private String conta;
    private String banco;
    private Double valorTotal;

    @XmlAttribute(name = "agencia", required = true)
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @XmlAttribute(name = "conta", required = true)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @XmlAttribute(name = "banco", required = true)
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @XmlElement(name = "valortotal", required = true)
    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
