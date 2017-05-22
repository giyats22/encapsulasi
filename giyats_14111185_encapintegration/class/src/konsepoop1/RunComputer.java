/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package konsepoop1;

/**
 *
 * @author Oracle
 */
public class RunComputer {
        public static void main(String[] args){
            Komputer Komputertipe1 = new Komputer();
            Komputertipe1.Paket = "Home Computer";
            System.out.println("Paket "+ Komputertipe1.Paket +" ");
            System.out.println("-------------------------------Rincian------------------------------");
            Komputertipe1.PROCESSORTIPE1();
            Komputertipe1.RAMTIPE1();
            Komputertipe1.VGATIPE1();
            System.out.println("--------------------------------------------------------------------");
            
            Komputer Komputertipe2 = new Komputer();
            Komputertipe2.Paket = "Gaming Computer";
            System.out.println("Paket "+ Komputertipe2.Paket +" ");
            System.out.println("-------------------------------Rincian------------------------------");
            Komputertipe2.PROCESSORTIPE2();
            Komputertipe2.RAMTIPE2();
            Komputertipe2.VGATIPE2();
            System.out.println("--------------------------------------------------------------------");
            
            Komputer Komputertipe3 = new Komputer();
            Komputertipe3.Paket = "Gaming Computer II";
            System.out.println("Paket "+ Komputertipe3.Paket +" ");
            System.out.println("-------------------------------Rincian------------------------------");
            Komputertipe2.PROCESSORTIPE3();
            Komputertipe2.RAMTIPE3();
            Komputertipe2.VGATIPE3();
            System.out.println("--------------------------------------------------------------------");
                        
        }
}
