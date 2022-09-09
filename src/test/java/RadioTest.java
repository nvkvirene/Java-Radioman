import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadoTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetMaxStation() {
        radio.setMaxStation(12);
        Assertions.assertEquals(12, radio.getMaxStation());
    }

    @Test
    public void shouldIncreaseWithNewMaxStation() {
        radio.setMaxStation(12);
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        Assertions.assertEquals(11, radio.getCurrentStation());
    }

    @Test
    public void shouldSetRequiredStation() {
        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStation() {
        radio.setCurrentStation(6);
        radio.increaseCurrentStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationIfLimit() {
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationIfOverLimit() {
        radio.setCurrentStation(13);
        radio.increaseCurrentStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStation() {
        radio.setCurrentStation(5);
        radio.decreaseCurrentStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfLimit() {
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfUnderLimit() {
        radio.setCurrentStation(-10);
        radio.decreaseCurrentStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(50);
        radio.increaseCurrentVolume();
        Assertions.assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfOverLimit() {
        radio.setCurrentVolume(150);
        radio.increaseCurrentVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseCurrentVolume();
        Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfUnderLimit() {
        radio.setCurrentVolume(-100);
        radio.decreaseCurrentVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}