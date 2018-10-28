
package pbo3.pkg10117110.latihan61.bangunruang;


public abstract class BangunRuang {
    
    protected final double phi = 3.14;
    protected int jari2,tinggi;

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    
    public abstract double volumeTabung();
    public abstract double volumeKerucut();
    public abstract double volumeBola();
    
    
    
}
