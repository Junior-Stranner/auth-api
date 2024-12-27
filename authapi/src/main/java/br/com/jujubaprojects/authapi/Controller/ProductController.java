package br.com.jujubaprojects.authapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jujubaprojects.authapi.Model.domain.Product.Product;
import br.com.jujubaprojects.authapi.Model.domain.Product.ProductRequestDTO;
import br.com.jujubaprojects.authapi.Model.domain.Product.ProductResponseDTO;
import br.com.jujubaprojects.authapi.Repositories.ProductReporitory;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    ProductReporitory productReporitory;

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody @Valid ProductRequestDTO  bodyDTO){

        Product newProduct = new Product(bodyDTO);

        this.productReporitory.save(newProduct);
        return ResponseEntity.ok().build();
        
    }
 @GetMapping
 public ResponseEntity<List<ProductResponseDTO>> finAll(){

    List<ProductResponseDTO> productList = this.productReporitory.findAll().stream().map(ProductResponseDTO::new).toList();
    return ResponseEntity.ok(productList);

 }

}
