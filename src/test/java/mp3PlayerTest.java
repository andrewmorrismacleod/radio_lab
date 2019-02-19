import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class mp3PlayerTest {

    mp3Player mp3player;
    Stereo stereo;

    @Before
    public void before(){
        mp3player = new mp3Player("FIIO", "V");
        stereo = new Stereo("SonyBoomBox", "Sony CD", "101", "Radio 1");

    }

    @Test
    public void canConnect(){

        assertEquals(stereo.getName(), mp3player.connect(stereo));
    }


}
