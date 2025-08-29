package br.com.fiap3espf.springbootproject.controller;

import br.com.fiap3espf.springbootproject.teacher.DadosCadastroInstrutor;
import br.com.fiap3espf.springbootproject.teacher.Especialidade;
import br.com.fiap3espf.springbootproject.teacher.Teacher;
import br.com.fiap3espf.springbootproject.teacher.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    @PostMapping
    public void cadastrarInstrutor(@RequestBody DadosCadastroInstrutor data){

        teacherRepository.save(new Teacher(data));
    }

}
