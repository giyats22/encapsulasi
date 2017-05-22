/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package konsepoop1;

/**
 *
 * @author Oracle
 */
public class Komputer {

    String Processor;
    String Motherboard;
    String RAM;
    String VGA;
    String Merek;
    String Kapasitas;
    String Harga;
    String Paket;

    public void PROCESSORTIPE1(){ 
    this.Processor = "AMD AM3";
    this.Merek = "AMD Phenom II X2";   
    this.Kapasitas = "3.2Ghz,2x512KB,6Mb";
    this.Harga = "RP. 890.000";
    System.out.println("Processor "+ Processor + " "+ Merek +"  "+ Kapasitas +" | Harga "+ Harga +"");
    }
    
    public void PROCESSORTIPE2(){
        
    this.Processor = "AMD FM2";
    this.Merek = "AMD A8-5600K";  
    this.Kapasitas = "3.6Ghz Cache 4MB 100W";
    this.Harga = "RP. 1.050.000";
     System.out.println("Processor "+ Processor + " "+ Merek +"  "+ Kapasitas +" | Harga "+ Harga +"");
    }
    
    public void PROCESSORTIPE3(){
    this.Processor = "AMD FM2";
    this.Merek = "AMD A10-5800K";  
    this.Kapasitas = "3.8Ghz Cache 4MB 100W";
    this.Harga = "RP. 1.360.000";
    System.out.println("Processor "+ Processor + " "+ Merek +"  "+ Kapasitas +" | Harga "+ Harga +"");
    }
     
    public void RAMTIPE1(){
    this.RAM = "DDR3";
    this.Merek = "Kingston";
    this.Kapasitas = "2 GB";
    this.Harga = "RP. 200.000";
    System.out.println("RAM "+ Merek +"  "+ RAM +" "+ Kapasitas +" | Harga "+ Harga +"");
    }
    
    public void RAMTIPE2(){
    this.RAM = "DDR3";
    this.Merek = "Apacer";
    this.Kapasitas = "4 GB";
    this.Harga = "RP. 350.000";
    System.out.println("RAM "+ Merek +"  "+ RAM +" "+ Kapasitas +" | Harga "+ Harga +"");
    }
    
    public void RAMTIPE3(){
    this.RAM = "DDR3";  
    this.Merek = "Visipro";
    this.Kapasitas = "8 GB (2 x 4GB)";
    this.Harga = "RP. 700.000";
    System.out.println("RAM "+ Merek +"  "+ RAM +" "+ Kapasitas +" | Harga "+ Harga +"");
    }
    
    public void VGATIPE1(){
    this.VGA = "NVIDIA PCI EXP";
    this.Merek = "Biostar GT 440";
    this.Kapasitas = "1Gb 128Bit DDR3";
    this.Harga = "RP. 510.000";
    System.out.println("VGA "+ VGA + " "+ Merek +" "+ Kapasitas +" | Harga "+ Harga +"");
    }
    
    public void VGATIPE2(){
    this.VGA = "NVIDIA PCI EXP";
    this.Merek = "Digital Alliance GT 640";
    this.Kapasitas = "2 Gb 128Bit DDR3";
    this.Harga = "RP. 999.000";
    System.out.println("VGA "+ VGA + " "+ Merek +" "+ Kapasitas +" | Harga "+ Harga +"");
    }
    
    public void VGATIPE3(){
    this.VGA = "NVIDIA PCI EXP";
    this.Merek = "Digital Alliance GTX 660 OC";
    this.Kapasitas = "2Gb 192Bit DDR5";
    this.Harga = "RP. 2.400.000";
    System.out.println("VGA "+ VGA + " "+ Merek +" "+ Kapasitas +" | Harga "+ Harga +"");
    }
}
