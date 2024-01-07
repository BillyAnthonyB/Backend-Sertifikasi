//model untuk katalog
package com.tugasPraktik.UC.model;

//import
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
@Table(name = "katalog") //nama table
public class katalog {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "judul")
    private String judul;

    @Column(name = "pengarang")
    private String pengarang;

    @Column(name = "penerbit")
    private String penerbit;

    @Column(name = "tahun_terbit")
    private int tahunTerbit;

    @Column(name = "stok")
    private int stok;
}
