/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package konsepoop1;

/**
 *
 * @author Oracle
 */
public class RunKucing {
    public static void main (String[] args){
    Kucing kucingpertama = new Kucing();
    kucingpertama.jenis= "anggora";
    kucingpertama.warna= "putih";
    kucingpertama.mata= "biru";
    System.out.println ("Ada kucing jenisnya "+kucingpertama.jenis+"");
    System.out.println ("warnanya "+kucingpertama.warna+"");
    System.out.println ("bermata "+kucingpertama.mata+"");
            
    kucingpertama.mengeong();
    kucingpertama.berjalan();
    
    Kucing kucingkedua = new Kucing();
    kucingkedua.jenis= "persia";
    kucingkedua.warna= "hitam";
    kucingkedua.mata= "hijau";
    System.out.println ("Ada kucing jenisnya "+kucingkedua.jenis+"");
    System.out.println ("warnanya "+kucingkedua.warna+"");
    System.out.println ("bermata "+kucingkedua.mata+"");
    kucingkedua.mengeong();
    kucingkedua.berlari();
    
    }
}

