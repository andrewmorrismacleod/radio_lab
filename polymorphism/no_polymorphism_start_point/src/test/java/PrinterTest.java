import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void canGetStatus(){
        Printer printer =  new Printer();
        assertEquals("Ink Low", printer.getStatus());
    }

}
