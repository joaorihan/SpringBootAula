package br.com.fiap3espf.springbootproject.teacher;

public record DadosListagemInstrutor(
        String nome,
        String email,
        String cnh,
        Especialidade especialidade)
{

    public DadosListagemInstrutor(Teacher teacher){
        this(teacher.getNome(), teacher.getEmail(), teacher.getCnh(), teacher.getEspecialidade());
    }


}
