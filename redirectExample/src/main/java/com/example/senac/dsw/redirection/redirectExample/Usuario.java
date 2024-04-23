package com.example.senac.dsw.redirection.redirectExample;

import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author orlando
 */
public class Usuario {
    
    @Getter @Setter
    private Long id;
    
    @Getter @Setter @NotEmpty(message = "O nome é obrigatório")
    private String nome;
    
    @Getter @Setter @NotEmpty(message = "O sobrenome é obrigatório")
    private String sobrenome;
    
    @Getter @Setter @NotEmpty(message = "O cargo é obrigatório")
    private String cargo;

   
}
