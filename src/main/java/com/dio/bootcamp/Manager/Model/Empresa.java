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
public class Empresa {

    @Id
    private Long id;

    private String descricao;

    private String numCNPJ;

    private String endereco;

    private String bairro;

    private String cidade;

    private String estado;

    private String numTelefone;
}
