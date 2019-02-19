import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdplayer;

    @Before
    public void before(){
        cdplayer = new CDPlayer("Sony", "104");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", cdplayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("104", cdplayer.getModel());
    }

    @Test
    public void hasNumberOfCDs(){
        assertEquals(0, cdplayer.getNumberofcds());
    }

    @Test
    public void canIncreaseVolume(){
        cdplayer.changeVolume(1);
        assertEquals(11, cdplayer.getVolume());
    }

    @Test
    public void canChangeQuality(){
        cdplayer.setQuality("mono");
        assertEquals("mono", cdplayer.getQuality());
    }

    @Test
    public void canAddCD(){
        cdplayer.increaseNumberofcds(1);
        assertEquals(1, cdplayer.getNumberofcds());
    }

}