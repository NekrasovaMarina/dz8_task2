public class Radio {
    private int currentNumberRadioStation;
    private int soundVolume;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    // Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - 9)
    public void setCurrentNumberRadioStation(int currentNumberRadioStation) {
        if (currentNumberRadioStation<0) {
            return;
        }
        if (currentNumberRadioStation>9) {
            return;
        }
        this.currentNumberRadioStation = currentNumberRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

/*    Требования к работе с радиостанциями:

    Номер текущей радиостанции изменяется в пределах от 0 до 9
    Если текущая радиостанция - 9 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
    Если текущая радиостанция - 0 и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать 9-ая
    Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - 9)
*/

    // Если текущая радиостанция - 9 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
    public void next(int currentNumberRadioStation){
        if (currentNumberRadioStation < 0) {
            return;
        }
        if (currentNumberRadioStation > 9) {
            return;
        }
        if (currentNumberRadioStation == 9) {
            this.currentNumberRadioStation = 0;
        }
        else {
            this.currentNumberRadioStation = currentNumberRadioStation + 1;
        }
    }

    // Если текущая радиостанция - 0 и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать 9-ая
    public void prev(int currentNumberRadioStation){
        if (currentNumberRadioStation < 0) {
            return;
        }
        if (currentNumberRadioStation > 9) {
            return;
        }
        if (currentNumberRadioStation == 0) {
            this.currentNumberRadioStation = 9;
        }
        else {
            this.currentNumberRadioStation = currentNumberRadioStation-1;
        }
    }

/*    Требования к работе с уровнем громкости звука:

    Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука (в пределах от 0 до 10)*
    Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить
    Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить
*/

    // Клиент должен иметь возможность увеличивать уровень громкости звука (в пределах от 0 до 10)*
    public void increaseSoundVolume(int soundVolume){
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume >= 10) {
            return;
        }
        this.soundVolume = soundVolume+1;
    }

    // Клиент должен иметь возможность уменьшать уровень громкости звука (в пределах от 0 до 10)*
    public void decreaseSoundVolume(int soundVolume){
        if (soundVolume <= 0) {
            return;
        }
        if (soundVolume > 10) {
            return;
        }
        this.soundVolume = soundVolume-1;
    }

    // Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить
    public void plusSoundVolume(int soundVolume){
        if (soundVolume<0) {
            return;
        }
        if (soundVolume>10) {
            return;
        }
        if (soundVolume==10) {
            this.soundVolume = soundVolume;
        }
        else {
            this.soundVolume = soundVolume + 1;
        }
    }

    // Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить
    public void minusSoundVolume(int soundVolume){
        if (soundVolume<0) {
            return;
        }
        if (soundVolume>10) {
            return;
        }
        if (soundVolume==0) {
            this.soundVolume = soundVolume;
        }
        else {
            this.soundVolume = soundVolume - 1;
        }
    }

}




