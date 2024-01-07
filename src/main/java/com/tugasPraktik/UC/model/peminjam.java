//model untuk peminjam
package com.tugasPraktik.UC.model;

//import
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //agar tidak perlu mengetik metode getter, setter, equals, hashCode, atau toString secara manual
@Entity //menandakan kelas adalah sebuah entity
@AllArgsConstructor //untuk constructor dengan parameter 
@NoArgsConstructor //untuk constructor dengan parameter 
@Table(name = "peminjam") //nama table
public class peminjam {

    @Id 
    @Column(name = "id")
    private Long id;

    @Column(name = "nama_peminjam")
    private String namaPeminjam;

    @Column(name = "tanggal_pinjam")
    private Date tanggalPinjam;

    @Column(name = "tanggal_kembali")
    private Date tanggalKembali;

    @Column(name = "id_buku")
    private int idBuku;

    @Column(name = "status")
    private String status;
}
