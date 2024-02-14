package br.com.jujubaprojects.authapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jujubaprojects.authapi.Model.domain.Product.Product;

public interface ProductReporitory extends JpaRepository<Product, Long>{
    
}
