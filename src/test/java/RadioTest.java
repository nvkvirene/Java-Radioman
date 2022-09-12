import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(0,0);

    @Test
    public void test() {
        Radio radio = new Radio(0, 0);
        radio.setCurrentRadioStation(3);

        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio(0, 0);
        radio.setCurrentVolume(55);

        int expected = 55;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStation() {
        radio.setCurrentRadioStation(6);
        Assertions.assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetToMaxStation() {
        radio.setCurrentRadioStation(9);
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetToMinStation() {
        radio.setCurrentRadioStation(0);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldStationOutOfRange() {
        radio.setCurrentRadioStation(-2);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldStationOutOfRangeMax() {
        radio.setCurrentRadioStation(11);
        Assertions.assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldNotSetStationAboveMax() {
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetStationAboveMin() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseRadio1() {
        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseRadio1() {
        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(80);
        Assertions.assertEquals(80, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetToMaxVolume() {
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetToMinVolume() {
        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeOutOfRangeMin() {
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeOutOfRangeMax() {
        radio.setCurrentVolume(101);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseMaxLimitVolume() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseMinVolume() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void decreaseMaxVolume() {
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void decreaseMaxLimitVolume() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseMinVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}