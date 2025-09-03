package br.com.fiap3espf.springbootproject.controller;

import br.com.fiap3espf.springbootproject.teacher.DadosCadastroInstrutor;
import br.com.fiap3espf.springbootproject.teacher.DadosListagemInstrutor;
import br.com.fiap3espf.springbootproject.teacher.Teacher;
import br.com.fiap3espf.springbootproject.teacher.TeacherRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    @PostMapping
    public void cadastrarInstrutor(@RequestBody @Valid DadosCadastroInstrutor data){

        teacherRepository.save(new Teacher(data));
    }

    @GetMapping
    public List<DadosListagemInstrutor> listarTeachers(){
        return teacherRepository.findAll().stream().map(DadosListagemInstrutor::new).toList();
    }

}
