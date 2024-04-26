import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputorTest {
    @Test
    public void shouldReturn2when1Plus1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computor computor = new Computor();
        int actualResult=computor.compute(1,1,"Add");
        int expectResult=2;
        Assert.assertEquals(expectResult,actualResult);
    }

    @Test
    public void shouldReturn0when1Sub1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computor computor = new Computor();
        int actualResult=computor.compute(1,1,"Sub");
        int expectResult=0;
        Assert.assertEquals(expectResult,actualResult);
    }

    @Test
    public void shouldReturn4when2Multi2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computor computor = new Computor();
        int actualResult=computor.compute(2,2,"Multi");
        int expectResult=4;
        Assert.assertEquals(expectResult,actualResult);
    }

}