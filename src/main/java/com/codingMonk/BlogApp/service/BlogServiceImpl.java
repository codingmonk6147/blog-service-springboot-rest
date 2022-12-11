package com.codingMonk.BlogApp.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingMonk.BlogApp.model.Blog;
import com.codingMonk.BlogApp.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {
	
	
    @Autowired
	private BlogRepository repo;
    
    
	@Override
	public Blog saveBlog(Blog blog) {
	
		return repo.save(blog);
	}

	@Override
	public Iterable<Blog> getAllBlogs() {
		// TODO Auto-generated method stub
		
		return  repo.findAll();
	}

	@Override
	public Blog getBlogById(int id) {
		// TODO Auto-generated method stub
		return (Blog) repo.findById(id).get();
	}

	@Override
	public void deleteBlog(int id) {
		// TODO Auto-generated method stub
		Blog blog = repo.findById(id).get();
		repo.delete(blog);
		return;
	}

	@Override
	public Blog updateBlog(int id,String name,String content,String title) {
		// TODO Auto-generated method stub
		Blog blog = repo.findById(id).get();
		blog.setAuthorName(name);
		blog.setBlogContent(content);
		blog.setBlogTitle(title);
		
		return repo.save(blog);
	}
	
 
}
