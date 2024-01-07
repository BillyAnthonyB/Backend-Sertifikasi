//Service untuk katalog
package com.tugasPraktik.UC.service;

// import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tugasPraktik.UC.repository.katalogRepository;
import jakarta.transaction.Transactional;
import com.tugasPraktik.UC.model.katalog;
import java.util.List;

@Service //menandakan bahwa ini service
public class katalogService {
    
    @Autowired
    private katalogRepository KatalogRepository; //panggil repo katalog

    public List<katalog> getAllKatalog() { 
        List<katalog> result = KatalogRepository.findAll(); //untuk get all katalog
        return result;
    }

    public katalog insertKatalog(katalog Katalog) {
        return KatalogRepository.save(Katalog); //untuk add katalog
    }

    public katalog updateKatalog(Long id, int stok) {
        katalog Katalog = KatalogRepository.findFirstById(id);
        if(Katalog!= null) {
            Katalog.setStok(stok);
        }
        return KatalogRepository.save(Katalog); //untuk update stok katalog
    }

    @Transactional
    public void deleteKatalog(Long id) {
        KatalogRepository.deleteById(id); //untuk delete katalog
    }
}
