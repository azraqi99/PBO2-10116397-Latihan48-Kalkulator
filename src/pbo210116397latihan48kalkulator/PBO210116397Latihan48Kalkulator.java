/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Kalkulator
 */
package pbo210116397latihan48kalkulator;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kalkulator ktr = new Kalkulator();
        ktr.setValue1(7);
        ktr.setValue2(5);

        System.out.println("VALUE 1 = "+ktr.getValue1());
        System.out.println("VALUE 2 = "+ktr.getValue2());
        ktr.setNameProject();
        ktr.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = "+ktr.add(ktr.getValue1(),ktr.getValue2()));
        System.out.println("Result Minus is = "+ktr.minus(ktr.getValue1(),ktr.getValue2()));
        System.out.println("Result Multiplication is = "+ktr.multiplication(ktr.getValue1(),ktr.getValue2()));
        System.out.println("Result Division is = "+ktr.division(ktr.getValue1(),ktr.getValue2()));
        
    
    }
    
}
