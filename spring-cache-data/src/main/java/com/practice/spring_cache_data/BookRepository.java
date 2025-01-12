package com.practice.spring_cache_data;

public interface BookRepository {

  Book getByIsbn(String isbn);

}