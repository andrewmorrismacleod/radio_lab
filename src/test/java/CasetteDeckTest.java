import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasetteDeckTest {

        CasetteDeck casettedeck;

        @Before
        public void before(){
            casettedeck = new CasetteDeck("CasDec", "102");
        }

        @Test
        public void hasMake(){
            assertEquals("CasDec", casettedeck.getMake());
        }

        @Test
        public void hasModel(){
            assertEquals("102", casettedeck.getModel());
        }

        @Test
        public void hasWriteProtection(){
            assertEquals(false, casettedeck.isWriteprotected());
        }

        @Test
        public void canIncreaseVolume(){
            casettedeck.changeVolume(1);
            assertEquals(11, casettedeck.getVolume());
        }

        @Test
        public void canChangeQuality(){
            casettedeck.setQuality("mono");
            assertEquals("mono", casettedeck.getQuality());
        }

        @Test
        public void canChangeWriteProtection(){
            casettedeck.setWriteProtect(true);
            assertEquals(true, casettedeck.isWriteprotected());
        }

    }



