package br.com.jujubaprojects.authapi.Model.domain.Product;


public record ProductResponseDTO(long id, String name, long price) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}
