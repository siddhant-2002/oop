/*21) Consider a scenario where Bank is a class that provides
functionality to get the rate of interest. 
However, the rate ofinterest varies according to banks.
For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.*/

abstract class Banks{
   abstract void getrateofinterest();
}
class SBI extends Banks{
    static double SBI = 8.0;
   
    void getrateofinterest(){
        System.out.println("Interet rate of SBI is "+SBI+"%");
    }
}
class ICICI extends Banks{
    static double ICICI = 7.0;
   
    void getrateofinterest(){
        System.out.println("Interet rate of ICICI is "+ICICI+"%");
    }
}
class AXIS extends Banks{
    static double AXIS = 9.0;
   
    void getrateofinterest(){
        System.out.println("Interet rate of AXIS is "+AXIS+"%");
    }
}
public class demo21 {
    public static void main(String[] args){
        SBI s=new SBI();
        s.getrateofinterest();
        ICICI i=new ICICI();
        i.getrateofinterest();
        AXIS a=new AXIS();
        a.getrateofinterest();
    }
}
