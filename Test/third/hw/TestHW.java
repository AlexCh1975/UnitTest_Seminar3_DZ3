package third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.*;

public class TestHW {
    private MainHW mainHW;

    @BeforeEach
    void setUp(){
        mainHW = new MainHW();
    }

    @Test
    void testEventOddNumberReturnTrue(){
        assertTrue(mainHW.eventOddNumber(2));
    }

    @Test
    void testEventOddNumberReturnFalse(){
        assertFalse(mainHW.eventOddNumber(3));
    }

    @Test
    void testIsTheNumberInTheRange(){
        assertTrue(mainHW.numberInInterval(50));
    }

    @ParameterizedTest
    @CsvSource({
            "24",
            "101"
    })
    void teatNumberIsLessThanInterval(int n){
        assertFalse(mainHW.numberInInterval(n));
    }
}
