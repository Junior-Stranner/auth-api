package br.com.jujubaprojects.authapi.Model.domain.Product;

import jakarta.validation.constraints.NotBlank;

public record ProductRequestDTO(
    
    @NotBlank
    String name, 
    @NotBlank
    long price
    
    ) {

}
