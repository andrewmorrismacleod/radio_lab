import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recorddeck;

    @Before
    public void before(){
        recorddeck = new RecordDeck("RDR", "101");
    }

    @Test
    public void hasMake(){
        assertEquals("RDR", recorddeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("101", recorddeck.getModel());
    }

    @Test
    public void canPlaySpeed(){
        assertEquals(75, recorddeck.getPlaySpeed());
    }

    @Test
    public void canIncreaseVolume(){
        recorddeck.changeVolume(1);
        assertEquals(11, recorddeck.getVolume());
    }

    @Test
    public void canChangeQuality(){
        recorddeck.setQuality("mono");
        assertEquals("mono", recorddeck.getQuality());
    }

}
