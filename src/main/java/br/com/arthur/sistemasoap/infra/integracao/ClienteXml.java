package br.com.arthur.sistemasoap.infra.integracao;

import br.com.arthur.sistemasoap.dominio.endereco.Endereco;
import br.com.arthur.sistemasoap.dominio.pagamento.Pagamento;

import javax.xml.bind.annotation.XmlElement;
import java.time.LocalDate;

public class ClienteXml {
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String rg;
    private LocalDate dataDeNascimento;
    private String telefone;
    private Endereco endereco;
    private Pagamento pagamento;

    @XmlElement(name = "nome", required = true)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlElement(name = "email", required = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "senha", required = true)
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @XmlElement(name = "cpf", required = true)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @XmlElement(name = "rg", required = true)
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @XmlElement(name = "datanascimento", required = true)
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @XmlElement(name = "telefone", required = true)
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @XmlElement(name = "endereco", required = true)
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @XmlElement(name = "pagamento", required = true)
    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
