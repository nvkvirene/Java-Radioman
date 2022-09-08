import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadoTest {
    @Test
    public void shouleSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(80);

        int expected = 80;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}