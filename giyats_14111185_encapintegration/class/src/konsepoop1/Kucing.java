/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package konsepoop1;

/**
 *
 * @author Oracle
 */
public class Kucing {
    String jenis;
    String warna;
    String mata;
    String mulut;
    String kaki;
    

    public void mengeong() {
    this.mulut="mengeong";
    System.out.println("Mulutnya sedang "+mulut+"");    
}
    
    public void berlari() {
    this.kaki="berlari";
    System.out.println("Kakinya sedang "+kaki+"");    
}
    
    public void berjalan() {
    this.kaki="berjalan";
    System.out.println("Kakinya sedang "+kaki+"");    
}
    
}
