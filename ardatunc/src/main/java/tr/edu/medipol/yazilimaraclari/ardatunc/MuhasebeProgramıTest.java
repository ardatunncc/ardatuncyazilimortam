package tr.edu.medipol.yazilimaraclari.ardatunc;

import org.junit.Assert;
import org.junit.Test;

import tr.edu.medipol.yazilimaraclari.ardatunc.MuhasebeProgrami.Ucret;

public class MuhasebeProgramıTest {
	
	@Test
    public void birincitest() {
        Ucret sonuc = MuhasebeProgrami.ucretHesapla(8, 12);
        Assert.assertEquals(96, sonuc.ucret);
        Assert.assertEquals(12 , sonuc.saatlikUcret);
        Assert.assertEquals(8 , sonuc.calisilanSaat);
    }
	
	@Test
    public void ikincitest() {
        Ucret sonuc = MuhasebeProgrami.ucretHesapla(11, 9);
        Assert.assertEquals(99, sonuc.ucret);
        Assert.assertEquals(9 , sonuc.saatlikUcret);
        Assert.assertEquals(11 , sonuc.calisilanSaat);
    }
	
	

}
