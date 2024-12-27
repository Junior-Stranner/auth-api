package br.com.jujubaprojects.authapi.Model.domain.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProductRequestDTO(
    
    @NotBlank
    String name,
    @NotNull
    @Positive
    Long price

) {

}
