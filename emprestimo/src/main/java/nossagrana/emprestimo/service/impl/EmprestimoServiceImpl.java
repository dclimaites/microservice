package nossagrana.emprestimo.service.impl;

import nossagrana.emprestimo.dto.EmprestimoDTO;
import nossagrana.emprestimo.entity.Emprestimo;
import nossagrana.emprestimo.repository.EmprestimoRepository;
import nossagrana.emprestimo.service.EmprestimoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmprestimoServiceImpl implements EmprestimoService {
    private EmprestimoRepository emprestimoRepositorio;

    public EmprestimoServiceImpl(EmprestimoRepository emprestimoRepositorio) {
        this.emprestimoRepositorio = emprestimoRepositorio;
    }

    @Override
    public List<EmprestimoDTO> getAll() {
        List<Emprestimo> emprestimosEntity = this.emprestimoRepositorio.findAll();

        return emprestimosEntity.stream()
                .map(EmprestimoDTO::new)
                .collect(Collectors.toList());
    }
}
