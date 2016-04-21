
import junit.framework.Assert;
import org.ifunpas.rkppl.mavenproject2.rkppl16.HITUNG;
import org.ifunpas.rkppl.mavenproject2.rkppl16.HITUNG;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sb604-16
 */
public class Test_ {
   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sb604-16
 */
public class Quiz {
    HITUNG h = new HITUNG();
    @Test
    public void test1(){
        h.setNama(null);
        Assert.assertNull(" tidak null",h.getNama());
    }
    
    @Test
    public void test2(){
      h.setPemakan("Sayur");
      Assert.assertSame("Sayur",h.getPemakan());
    }
    
    @Test
    public void test3(){
        h.setJenis("Reptil");
        Assert.assertNotSame("Reptil",h.getJenis());
    }
    
}

}
