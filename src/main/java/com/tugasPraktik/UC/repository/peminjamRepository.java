//Repository untuk peminjam
package com.tugasPraktik.UC.repository;

//import
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.tugasPraktik.UC.model.peminjam;

@Repository //menandakan bahwa ini adalah repository
public interface peminjamRepository extends JpaRepository<peminjam, Long>{
    
    List<peminjam> findAll(); //untuk get all data

    peminjam findFirstById(Long id); //untuk find by id
}
