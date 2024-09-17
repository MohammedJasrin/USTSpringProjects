package com.iist.jpaone2many.mdel;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book implements Serializable  {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String author;
	    @Column(unique = true)
	    private String isbn;

	 
	   @OneToMany(cascade = CascadeType.ALL)
	   @JoinColumn(name =  "bookid_fk", referencedColumnName ="id") // ID OF THE BOOK CLASS
		   // private Set<Page> pages
	    private Set<Page> pages= new HashSet<>();

	    public Book() {
	    }

	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public Set<Page> getPages() {
			return pages;
		}

		public void setPages(Set<Page> pages) {
			this.pages = pages;
		}
	    
}




////   @OneToMany(mappedBy = "book", fetch = FetchType.LAZY,cascade = CascadeType.ALL)


