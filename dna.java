
/**
 * Write a description of dna here.
 * Finding Gene from DNA
 * Starts with ATG & Ends with ATT.
 * @author (Sonali Rathod) 
 * @version (a version number or a date)
 */
public class dna {
    
public String GetGene(String dna)
{
    String result="";
    int Start=dna.indexOf("ATG");
    if (Start == -1)
    {
        return "No ATG";
    }
    int End=dna.indexOf("TAA",Start+3);//Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found.
    //If there is no such “TAA”, return the empty string.
        if (End == -1)
    {
        return "No TAA";
    }
    int valid=Start-End;
    if (valid%3==0)
    {
        result=dna.substring(Start,End+3);
        return result;
    }
    else
    {
        return "Invalid Genes";
    }
}

public void test()
{
    String dna="AATGGCCGTATAATGG";
    System.out.println("The DNA is="+dna);
    String gene=GetGene(dna);
    System.out.println("The Gene is="+gene);
    
}
}
