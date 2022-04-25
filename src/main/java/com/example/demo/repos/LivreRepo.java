package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Livre;


public interface LivreRepo extends JpaRepository<Livre, Long> {

	@Query(value="SELECT * FROM livre ORDER BY date_sortie DESC",nativeQuery = true)
	public List<Livre> findAllByOrderByDateAsc();
	
}