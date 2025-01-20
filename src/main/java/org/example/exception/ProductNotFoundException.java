package org.example.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String name, String value) {
        super(String.format("ProductEntity with '%s' = %s not found", name, value));
    }
}
