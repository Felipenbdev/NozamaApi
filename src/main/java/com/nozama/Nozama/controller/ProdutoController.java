package com.nozama.Nozama.controller;

import com.nozama.Nozama.model.Product;
import com.nozama.Nozama.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @GetMapping("/{id})")
    public ResponseEntity<Product> findById(@RequestParam String id){
        return productRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        productRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable String id, @RequestBody Product product){
        product.setId(id);
        return productRepository.save(product);
    }
}
