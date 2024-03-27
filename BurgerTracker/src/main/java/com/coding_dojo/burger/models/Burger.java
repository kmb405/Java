package com.coding_dojo.burger.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="burgers")
public class Burger {
    	@Id
    	@GeneratedValue(strategy = GenerationType.IDENTITY)
    	private Long id;
    	@NotNull
    	@Size(min = 1, max = 200)
    	private String name;
    	@NotNull
    	@Size(min = 1, max = 200)
    	private String restaurant;
    	@NotNull
    	@Size(min = 1, max = 40)
    	private String note;
    	@NotNull(message="Cannot be blank")
    	@Min(1)
    	@Max(5)
    	private Integer rating;
    	@Column(updatable=false)
    	@DateTimeFormat(pattern="yyyy-MM-dd")
    	private Date createdAt;
    	@DateTimeFormat(pattern="yyyy-MM-dd")
    	private Date updatedAt;
    	
    	public Burger() {
    		
    	}
    	
    	public Burger(String name, String restaurant, String note, int rating) {
    		this.name = name;
    		this.restaurant = restaurant;
    		this.note = note;
    		this.rating = rating;
    		
    	}
    	
    	
    	@PrePersist
    	protected void onCreate() {
    		this.createdAt = new Date();
    	}
    	@PreUpdate
    	protected void onUpdate() {
    		this.updatedAt = new Date();
    	}

    	public Long getId() {
    		return id;
    	}

    	public void setId(Long id) {
    		this.id = id;
    	}

    	public String getName() {
    		return name;
    	}

    	public void setName(String name) {
    		this.name = name;
    	}

    	public String getRestaurant() {
    		return restaurant;
    	}

    	public void setRestaurant(String restaurant) {
    		this.restaurant = restaurant;
    	}

    	public String getNote() {
    		return note;
    	}

    	public void setNote(String note) {
    		this.note = note;
    	}

    	public Integer getRating() {
    		return rating;
    	}

    	public void setRating(Integer rating) {
    		this.rating = rating;
    	}

    	public Date getCreatedAt() {
    		return createdAt;
    	}

    	public void setCreatedAt(Date createdAt) {
    		this.createdAt = createdAt;
    	}

    	public Date getUpdatedAt() {
    		return updatedAt;
    	}

    	public void setUpdatedAt(Date updatedAt) {
    		this.updatedAt = updatedAt;
    	}
    	
    	
    }


