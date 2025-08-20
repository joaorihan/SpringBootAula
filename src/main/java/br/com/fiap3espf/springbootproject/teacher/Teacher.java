package br.com.fiap3espf.springbootproject.teacher;

import br.com.fiap3espf.springbootproject.endereco.Endereco;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Table(name = "Teachers")
@Entity(name = "Teacher")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Teacher {


    @Id
    Integer id;
    String nome;
    String email;
    String cnh;

    Especialidade especialidade;
    Endereco endereco;

}
