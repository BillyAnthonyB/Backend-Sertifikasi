//controller untuk katalog
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
import com.tugasPraktik.UC.model.katalog;
import com.tugasPraktik.UC.service.katalogService;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3000") //Setting CORS untuk localhost:3000
@RestController //menandakan ini controller
@RequestMapping("/katalog") //membuat entrypoint routes /katalog
public class katalogController {

    @Autowired
    private katalogService KatalogService; //panggil katalog service


    @GetMapping("/list") //get all data (method : GET) katalog
    public List<katalog> getAllKatalog() {
        return KatalogService.getAllKatalog();
    }

    @PostMapping("/add") //add data (method: POST) katalog
    public katalog insertKatalog(@RequestBody katalog Katalog) {
        return KatalogService.insertKatalog(Katalog);
    }

    @PutMapping("/update/{id}/{stok}") //update stok berdasarkan path variabel id dan jumlah stok (method: PUT) pada katalog
    public katalog updateKatalog(@PathVariable Long id, @PathVariable int stok) {
        return KatalogService.updateKatalog(id, stok);
    }

    @DeleteMapping("/delete/{id}") //delete katalog berdasarkan path variable id (method: delete)
    public ResponseEntity<String> deleteKatalog(@PathVariable Long id) {
        KatalogService.deleteKatalog(id);
        return ResponseEntity.ok("Peminjaman dengan ID " + id + " berhasil dihapus.");
    }
}
