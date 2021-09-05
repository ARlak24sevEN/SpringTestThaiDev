package com.example.springthaidevtest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductCotroller {

    @GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable Long id) {
        //TODO: get product from db

        return ResponseEntity.ok().body(new Product(id, "arlak", "Fruit"));
    }

    @PostMapping
    public ResponseEntity<ProductResponse> saveProduct(@RequestBody Product product) {
        //TODO: Save Product to db

        return ResponseEntity.ok().body(new ProductResponse("00", "Success"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponse> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        //TODO:update to db
        return ResponseEntity.ok().body(new ProductResponse("00", "Success"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductResponse> deleteProduct(@PathVariable Long id) {
        //TODO: delete produc by id in database

        return ResponseEntity.ok().body(new ProductResponse("00", "Success"));
    }

}
