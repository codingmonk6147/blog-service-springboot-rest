package com.codingMonk.BlogApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="blog")
public class Blog {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int blogId;
	    private String blogTitle;
	    private String authorName;
	    private String blogContent;
		public int getBlogId() {
			return blogId;
		}
		public void setBlogId(int blogId) {
			this.blogId = blogId;
		}
		public String getBlogTitle() {
			return blogTitle;
		}
		public void setBlogTitle(String blogTitle) {
			this.blogTitle = blogTitle;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public String getBlogContent() {
			return blogContent;
		}
		public void setBlogContent(String blogContent) {
			this.blogContent = blogContent;
		}
	    
	    

}
