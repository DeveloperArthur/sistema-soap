package br.com.arthur.sistemasoap.web;

import br.com.arthur.sistemasoap.dominio.EnviaClienteAoWebservice;
import br.com.arthur.sistemasoap.dominio.cliente.Cliente;
import br.com.arthur.sistemasoap.infra.integracao.ClienteWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private EnviaClienteAoWebservice enviaCliente;

    @PostMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<ClienteWrapper> enviaAoWebService(@RequestBody Cliente cliente) {
        ClienteWrapper clienteXml = enviaCliente.envia(cliente);
        return ResponseEntity.ok(clienteXml);
    }
}