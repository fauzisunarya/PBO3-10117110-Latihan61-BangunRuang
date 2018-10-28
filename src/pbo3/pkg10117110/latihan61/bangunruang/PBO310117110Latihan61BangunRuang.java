

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Hasil Perhitungan Volume Pada Bangun Ruang Dengan Menggunakan Konsep OOP 
 * Abstrak
 */


package pbo3.pkg10117110.latihan61.bangunruang;

public class PBO310117110Latihan61BangunRuang {

    public static void main(String[] args) {
        
        Tabung obj = new Tabung();
        obj.setJari2(10);
        obj.setTinggi(21);
        System.out.println("Sebuah Tabung Memiliki Jari - jari berukuran "+obj.getJari2()+
                " cm Jika Tingginya "+obj.getTinggi()+" cm");
        System.out.println("Maka Volumenya adalah "+obj.volumeTabung());
        
        System.out.println("");
        System.out.println("");
        
        Kerucut obj1 = new Kerucut();
        obj.setJari2(14);
        obj.setTinggi(9);
        System.out.println("Diketahui tinggi sebuah kerucut "+obj.getTinggi()+
                " cm Jika jari-jarinya "+obj.getJari2()+" cm");
        System.out.println("Maka Volumenya adalah "+obj.volumeKerucut());
        
        System.out.println("");
        System.out.println("");
        
        Bola obj2 = new Bola();
        obj2.setJari2(7);
        System.out.println("Jari-jari dari sebuah bola basket adalah "+obj2.getJari2()+
                " cm");
        System.out.println("Maka Volumenya adalah "+obj2.volumeBola());
       
    }
    
}
