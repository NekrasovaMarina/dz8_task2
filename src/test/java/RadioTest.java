/*import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(-1);
        assertEquals(0,radio.getCurrentNumberRadioStation());

        radio.setCurrentNumberRadioStation(10);
        assertEquals(0,radio.getCurrentNumberRadioStation());

        radio.setCurrentNumberRadioStation(5);
        assertEquals(5,radio.getCurrentNumberRadioStation());
    }

    @Test
    void setSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(5);
        assertEquals(5,radio.getSoundVolume());
    }

    // граничные значения: 0 и 9, классы эквивалентности: меньше 0, от 0 до 9, больше 9
    @Test
    void next() {
        Radio radio = new Radio();

        radio.next(-1);
        assertEquals(0, radio.getCurrentNumberRadioStation());

        radio.next(10);
        assertEquals(0, radio.getCurrentNumberRadioStation());

        radio.next(0);
        assertEquals(1, radio.getCurrentNumberRadioStation());

     //   radio.next(5);
     //   assertEquals(6, radio.getCurrentNumberRadioStation());

        radio.next(9);
        assertEquals(0, radio.getCurrentNumberRadioStation());
    }

    // граничные значения: 0 и 9, классы эквивалентности: меньше 0, от 0 до 9, больше 9
    @Test
    void prev() {
        Radio radio = new Radio();

        radio.prev(-1);
        assertEquals(0, radio.getCurrentNumberRadioStation());

        radio.prev(10);
        assertEquals(0, radio.getCurrentNumberRadioStation());

        radio.prev(0);
        assertEquals(9, radio.getCurrentNumberRadioStation());

     //   radio.prev(5);
     //   assertEquals(4, radio.getCurrentNumberRadioStation());

        radio.prev(9);
        assertEquals(8, radio.getCurrentNumberRadioStation());
    }

    @Test
    void increaseSoundVolume() {
        Radio radio = new Radio();

        radio.increaseSoundVolume(-1);
        assertEquals(0, radio.getSoundVolume());

        radio.increaseSoundVolume(11);
        assertEquals(0, radio.getSoundVolume());

        radio.increaseSoundVolume(4);
        assertEquals(5, radio.getSoundVolume());
    }

    @Test
    void decreaseSoundVolume() {
        Radio radio = new Radio();

        radio.decreaseSoundVolume(-1);
        assertEquals(0, radio.getSoundVolume());

        radio.decreaseSoundVolume(11);
        assertEquals(0, radio.getSoundVolume());

        radio.decreaseSoundVolume(8);
        assertEquals(7, radio.getSoundVolume());
    }

    // граничные значения: 0 и 10, классы эквивалентности: меньше 0, от 0 до 10, больше 10
    @Test
    void plusSoundVolume() {
        Radio radio = new Radio();

        radio.plusSoundVolume(-1);
        assertEquals(0, radio.getSoundVolume());

        radio.plusSoundVolume(11);
        assertEquals(0, radio.getSoundVolume());

        radio.plusSoundVolume(0);
        assertEquals(1, radio.getSoundVolume());

     //   radio.plusSoundVolume(5);
     //   assertEquals(6, radio.getSoundVolume());

        radio.plusSoundVolume(10);
        assertEquals(10, radio.getSoundVolume());
    }

    // граничные значения: 0 и 10, классы эквивалентности: меньше 0, от 0 до 10, больше 10
    @Test
    void minusSoundVolume() {
        Radio radio = new Radio();

        radio.minusSoundVolume(-1);
        assertEquals(0, radio.getSoundVolume());

        radio.minusSoundVolume(11);
        assertEquals(0, radio.getSoundVolume());

        radio.minusSoundVolume(0);
        assertEquals(0, radio.getSoundVolume());

      //  radio.minusSoundVolume(5);
      //  assertEquals(4, radio.getSoundVolume());

        radio.minusSoundVolume(10);
        assertEquals(9, radio.getSoundVolume());
    }
}

// избыточные проверки закомментировала