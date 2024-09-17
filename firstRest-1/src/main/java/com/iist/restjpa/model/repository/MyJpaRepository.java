
 package com.iist.restjpa.model.repository;
  
  import org.springframework.data.jpa.repository.JpaRepository; 
  import org.springframework.stereotype.Repository;
  
  import com.iist.restjpa.model.entity.Product;
  
  
  @Repository
  public interface MyJpaRepository extends JpaRepository<Product,Long>{
  
  }
 