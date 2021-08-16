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
public class NivelAcesso {

    @Id
    private Long id;

    private String descricao;
}
