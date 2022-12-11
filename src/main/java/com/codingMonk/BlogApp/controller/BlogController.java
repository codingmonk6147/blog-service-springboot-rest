package com.codingMonk.BlogApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codingMonk.BlogApp.model.Blog;
import com.codingMonk.BlogApp.service.BlogServiceImpl;


@RestController
@RequestMapping("api/v1")
public class BlogController {

	@Autowired
	BlogServiceImpl service;
	
	
	@RequestMapping(value="/blog",method=RequestMethod.POST)
	public Blog saveBlog(@RequestBody Blog p) {
		return service.saveBlog(p);
	}
	@RequestMapping(value="/blog/{id}/{name}/{content}/{title}",method=RequestMethod.PUT)
	public Blog updateBlog(@PathVariable int id, @PathVariable String name,@PathVariable String content,@PathVariable String title) {
		return service.updateBlog(id,name,content,title);
	}
	@RequestMapping(value="/blog/{id}",method=RequestMethod.DELETE)
	public String deleteBlog(@PathVariable int id) {
		
		
		 service. deleteBlog(id);
		
		return "Blog Deleted Successfully";
		 
		// return  new ResponseEntity<String>("Record Deleted",HttpStatus.OK);
	}
	
	
	
	
	@RequestMapping(value="/blog",method=RequestMethod.GET)
	public List<Blog> getAll() {
		
			List<Blog>  list = new ArrayList<Blog>();
		
	      Iterable<Blog> it =	service.getAllBlogs();
	      
	      it.forEach((blg)->{ list.add(blg);  });
	      
	      return list;
		
	}

	}

