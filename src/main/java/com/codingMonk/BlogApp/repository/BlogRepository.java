package com.codingMonk.BlogApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.codingMonk.BlogApp.model.Blog;

public interface BlogRepository extends CrudRepository<Blog,Integer> {

}
