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
public class BancoHoras {

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {
        private Long bancoHorasId;
        private Long movimentacaoId;
        private Long usuarioId;
    }


    @EmbeddedId
    private BancoHorasId id;

    private LocalDateTime dataTrabalhada;

    private BigDecimal horaTrabalhada;

    private BigDecimal saldoHoraTrabalhada;
}
