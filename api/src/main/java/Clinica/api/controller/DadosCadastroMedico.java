package Clinica.api.controller;
import Clinica.api.endereco.DadosEndereco;
//Clinica.api.controller.DadosEndereco endereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco ) {

}
