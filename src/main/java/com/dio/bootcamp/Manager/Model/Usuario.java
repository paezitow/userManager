package com.dio.bootcamp.Manager.Model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {

    @Id
    private Long id;

    @ManyToOne
    private CategoriaUsuario codCategoria;

    private String nomeUsuario;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;

    private BigDecimal tolerencia;

    private LocalDateTime inicioJornada;

    private LocalDateTime fimJornada;
}
