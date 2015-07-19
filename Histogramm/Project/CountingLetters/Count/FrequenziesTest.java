package Count;

import org.junit.Test;
import org.junit.Before;

public class FrequenziesTest
{
    private Frequenzies freq;
    
    public FrequenziesTest(){}
   
    @Before
    
    public void setUp(){
        freq = new Frequenzies();
    }
    
    @Test
    public void test1(){
        freq.doCounting("1","Count/files/Test1.txt");
    }
    @Test
    public void test2(){
        freq.doCounting("2","Count/files/Test2.txt");
    }
    @Test
    public void test3(){
        freq.doCounting("3","Count/files/Test3.txt");
    }
    
}
