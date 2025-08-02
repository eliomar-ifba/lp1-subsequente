package aula080108;

import java.util.List;
import java.util.UUID;

public class Cadastro {

    public static void main(String[] args) {
        Endereco end1 = new Endereco();
        Endereco end2 = new Endereco();
        Piloto piloto = new Piloto();
        Piloto copiloto = new Piloto();
        Passageiro passageiro = new Passageiro();
        Passageiro passageiro2 = new Passageiro();
        Aeronave aeronave = new Aeronave();
        Voo voo = new Voo();

        end1.setId(UUID.randomUUID());
        end1.setBairro("Barroca");
        end1.setRua("Rua D");
        end2.setId(UUID.randomUUID());
        end2.setBairro("BTN");
        end2.setRua("Rua E");

        piloto.setId(UUID.randomUUID());
        piloto.setNome("Zezinho");
        piloto.setCpf("123123123123");
        piloto.setEndereco(end2);
        copiloto.setId(UUID.randomUUID());
        copiloto.setNome("Maria");
        copiloto.setCpf("11111111111111");
        copiloto.setEndereco(end2);

        passageiro.setId(UUID.randomUUID());
        passageiro.setCpf("123123123");
        passageiro.setNome("Eliomar Campos");
        passageiro.setEndResidencial(end1);

        passageiro2.setId(UUID.randomUUID());
        passageiro2.setCpf("33333333333");
        passageiro2.setNome("Rafaela Ramalho Wanderley");
        passageiro2.setEndResidencial(end1);

        aeronave.setId(UUID.randomUUID());
        aeronave.setCodigo("NFH2223");
        aeronave.setModelo("AK333");
        aeronave.setPiloto(piloto);
        aeronave.setCopiloto(copiloto);

        voo.setId(UUID.randomUUID());
        voo.setDestino("São Paulo");
        voo.setOrigem("Paulo Afonso");
        voo.setAeronave(aeronave);
        voo.setPassageiros(List.of(passageiro, passageiro2));













        




        

    }
}
