// Service peminjam
package com.tugasPraktik.UC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tugasPraktik.UC.repository.peminjamRepository;
import jakarta.transaction.Transactional;
import com.tugasPraktik.UC.model.peminjam;
import java.util.List;


@Service //menandakan bahwa ini service
public class peminjamService {
    
    @Autowired
    private peminjamRepository PeminjamRepository; //panggil repo peminjam

    public List<peminjam> getAllPeminjam() {
        List<peminjam> result = PeminjamRepository.findAll(); //untuk get all data peminjam
        return result;
    }

    public peminjam insertPeminjam(peminjam Peminjam) {
        return PeminjamRepository.save(Peminjam); //untuk add data peminjam
    }

    public peminjam updatePeminjam(Long id, String status) {
        peminjam Peminjam = PeminjamRepository.findFirstById(id);
        if(Peminjam!= null) {
            Peminjam.setStatus(status);
        }
        return PeminjamRepository.save(Peminjam); //untuk update status peminjam
    }

    @Transactional
    public void deletePeminjam(Long id) {
        PeminjamRepository.deleteById(id); //untuk delete peminjam
    }
}
