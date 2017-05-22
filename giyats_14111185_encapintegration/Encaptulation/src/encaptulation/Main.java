package Encaptulation;

public class Main {
    
        public static void main(String[] args) {
            Encaptulation ren = new Encaptulation();
            ren.setAge (19);
            ren.setName("giyats abdurrahman") ;
            ren.setPersonId("TI12345");
            System.out.println("\nMy name is" +ren.getName()+"\nMy Id :" + ren.getPersonId());
            
        }
}