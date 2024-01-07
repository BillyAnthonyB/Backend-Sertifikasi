//controller untuk peminjam
package com.tugasPraktik.UC.controller;

//import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tugasPraktik.UC.model.peminjam;
import com.tugasPraktik.UC.service.peminjamService;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3000") //Setting CORS untuk localhost:3000
@RestController //menandakan ini controller
@RequestMapping("/peminjam") //membuat entrypoint routes /peminjam
public class peminjamController {

    @Autowired
    private peminjamService PeminjamService; //panggil peminjam service

    @GetMapping("/list") //get all data (method : GET) peminjam
    public List<peminjam> getAllPeminjam() {
        return PeminjamService.getAllPeminjam();
    }

    @PostMapping("/add") //add data (method: POST) peminjam
    public peminjam insertPeminjam(@RequestBody peminjam Peminjam) {
        return PeminjamService.insertPeminjam(Peminjam);
    }

    @PutMapping("/update/{id}/{status}") //update status peminjaman berdasarkan pathvariable id (method: PUT) pada peminjam
    public peminjam updatePeminjam(@PathVariable Long id, @PathVariable String status) {
        return PeminjamService.updatePeminjam(id, status);
    }

    @DeleteMapping("/delete/{id}") //delete peminjam berdasarkan path variable id (method: delete)
    public ResponseEntity<String> deletePeminjam(@PathVariable Long id) {
        PeminjamService.deletePeminjam(id);
        return ResponseEntity.ok("Peminjaman dengan ID " + id + " berhasil dihapus.");
    }
}
