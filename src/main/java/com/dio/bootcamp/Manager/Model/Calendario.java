package com.dio.bootcamp.Manager.Model;

import lombok.*;

import javax.persistence.*;
import java.time.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {

    @Id
    private Long id;

    @ManyToOne
    private TipoData tipoData;

    private String descricaoData;

    private LocalDateTime dataEspecial;
}
