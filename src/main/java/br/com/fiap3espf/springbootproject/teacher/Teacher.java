package br.com.fiap3espf.springbootproject.teacher;

import br.com.fiap3espf.springbootproject.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "Teachers")
@Entity(name = "Teacher")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Teacher {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Getter
    String nome;
    String email;
    String cnh;

    Especialidade especialidade;
    Endereco endereco;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCnh() {
        return cnh;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Teacher(DadosCadastroInstrutor data) {
        this.nome = data.nome();
        this.email = data.email();
        this.cnh = data.cnh();
        this.especialidade = data.especialidade();
        this.endereco = new Endereco(data.endereco());
    }


}
