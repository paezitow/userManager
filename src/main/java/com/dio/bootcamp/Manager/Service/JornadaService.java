package com.dio.bootcamp.Manager.Service;

import com.dio.bootcamp.Manager.Model.JornadaTrabalho;
import com.dio.bootcamp.Manager.controller.Repositories.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    private JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }


    //Salva uma Jornada de Trabalho
    @Transactional
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){return jornadaTrabalhoRepository.save(jornadaTrabalho);}

    //Atualiza uma Jornada de Trabalho
    @Transactional
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){return jornadaTrabalhoRepository.save(jornadaTrabalho);}

    //Lista todas as Jornadas
    @Transactional(readOnly = true)
    public List<JornadaTrabalho> listJornada() {return jornadaTrabalhoRepository.findAll();}

    //Lista a jornada de um Usuário
    @Transactional(readOnly = true)
    public Optional<JornadaTrabalho> listByID(Long idJornada) {return jornadaTrabalhoRepository.findById(idJornada);}

    @Transactional
    public void deleteJornada(Long idJornada) {jornadaTrabalhoRepository.deleteById(idJornada);}
}
