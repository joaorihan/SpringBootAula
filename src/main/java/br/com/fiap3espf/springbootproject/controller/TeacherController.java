package br.com.fiap3espf.springbootproject.controller;

import br.com.fiap3espf.springbootproject.teacher.DadosCadastroInstrutor;
import br.com.fiap3espf.springbootproject.teacher.Especialidade;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @PostMapping
    public void cadastrarInstrutor(@RequestBody DadosCadastroInstrutor data){
        System.out.println(data);
    }

}
