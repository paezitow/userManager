package com.dio.bootcamp.Manager.controller;

import com.dio.bootcamp.Manager.Model.JornadaTrabalho;
import com.dio.bootcamp.Manager.Service.JornadaService;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {


    private final JornadaService jornadaService;

    public JornadaTrabalhoController (JornadaService jornadaService){
        this.jornadaService = jornadaService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JornadaTrabalho> createJornada(@Valid @RequestBody JornadaTrabalho jornadaTrabalho){return ResponseEntity.ok(jornadaService.saveJornada(jornadaTrabalho));}

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JornadaTrabalho> updateJornada(@Valid @RequestBody JornadaTrabalho jornadaTrabalho){return ResponseEntity.ok(jornadaService.updateJornada(jornadaTrabalho));}

    @GetMapping
    public List<JornadaTrabalho> listJornada(){return jornadaService.listJornada();}

    @GetMapping("/{id}")
    public Optional<JornadaTrabalho> listJornadaById(@PathVariable("id") Long idJornada){return jornadaService.listByID(idJornada);}

    @DeleteMapping("/{id}")
    public void deleteJornadaById (@PathVariable("id") Long idJornada) {jornadaService.deleteJornada(idJornada);

    }
}
