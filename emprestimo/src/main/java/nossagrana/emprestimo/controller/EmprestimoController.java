package nossagrana.emprestimo.controller;

import nossagrana.emprestimo.dto.EmprestimoDTO;
import nossagrana.emprestimo.service.EmprestimoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("emprestimos")
public class EmprestimoController {

    private final EmprestimoService service;

    public EmprestimoController(EmprestimoService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmprestimoDTO> getAll() {
        return this.service.getAll();
    }
}
