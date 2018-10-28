
package pbo3.pkg10117110.latihan61.bangunruang;


public class Kerucut extends BangunRuang {

    @Override
    public double volumeTabung() {
       return phi * jari2 * jari2 * tinggi;
    }

    @Override
    public double volumeKerucut() {
        return 0.33333333333 * phi * jari2 * jari2 * tinggi;
    }

    @Override
    public double volumeBola() {
        return 0.6666666667 * phi * jari2 * jari2;
    }
    
}
