package com.dio.bootcamp.Manager.Model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoID implements Serializable {

        private Long idMovimentacao;
        private Long idUsuario;
    }


    @EmbeddedId
    private MovimentacaoID id;

    private LocalDateTime dataEntrada;

    private LocalDateTime dataSaida;

    private BigDecimal permanencia;

    @ManyToOne
    private Ocorrencia ocorrencia;

    @ManyToOne
    private Calendario calendario;

}
