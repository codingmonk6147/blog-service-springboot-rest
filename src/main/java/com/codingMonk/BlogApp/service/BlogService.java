package com.codingMonk.BlogApp.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.codingMonk.BlogApp.model.Blog;

public interface BlogService {

	   /**
     * AbstractMethod to save a blog
     */
    Blog saveBlog(Blog blog);

    /**
     * AbstractMethod to get all blogs
     */
    Iterable<Blog> getAllBlogs();

    /**
     * AbstractMethod to get blog by id
     */
    Blog getBlogById(int id);

    /**
     * AbstractMethod to delete blog by id
     */
    void deleteBlog(int id);

    /**
     * AbstractMethod to update a blog
     */
    Blog updateBlog(int id,String name,String content,String title);

}
