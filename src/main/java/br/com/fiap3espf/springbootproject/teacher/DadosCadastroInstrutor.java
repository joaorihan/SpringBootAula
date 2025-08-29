package br.com.fiap3espf.springbootproject.teacher;

import br.com.fiap3espf.springbootproject.endereco.DadosEndereco;

public record DadosCadastroInstrutor(
        String nome,
        String email,
        String cnh,
        Especialidade especialidade,
        DadosEndereco endereco)
{
}
