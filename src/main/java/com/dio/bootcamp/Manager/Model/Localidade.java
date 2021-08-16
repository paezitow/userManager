package com.dio.bootcamp.Manager.Model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {

    @Id
    private Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;
}
