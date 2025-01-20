package org.example.exception;

public class ArticleExistsException extends RuntimeException {

    public ArticleExistsException(String name, String value, String nameId, String id) {
        super(String.format("ProductEntity with '%s' = %s already exists. His '%s' = %s", name, value, nameId, id));
    }
}
