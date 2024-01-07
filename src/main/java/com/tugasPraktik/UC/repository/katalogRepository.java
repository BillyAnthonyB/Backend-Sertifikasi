// Repository untuk Katalog
package com.tugasPraktik.UC.repository;

//import
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.tugasPraktik.UC.model.katalog;

@Repository //menandakan bahwa ini adalah repository
public interface katalogRepository extends JpaRepository<katalog, Long>{
    
    List<katalog> findAll(); //untuk get all data

    katalog findFirstById(Long id); //untuk find by id
}
