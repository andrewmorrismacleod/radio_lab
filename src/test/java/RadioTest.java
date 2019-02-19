import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Radio 1 FM");
    }

    @Test
    public void hasStation(){
        assertEquals("Radio 1 FM", radio.getTune());
    }




}
