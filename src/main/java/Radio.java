public class Radio {

    public int currentRadioStation;    //номер текущей радиостанции
    public int currentVolume;   //громкость звука

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }
//
//    public void increaseRadioStation() {
//    int target = currentRadioStation +1;
//    setCurrentRadioStation(target);
//    }
//
//    public void decreaseRadioStation() {
//    int target = currentRadioStation -1;
//    setCurrentRadioStation(target);
//    }

    //увеличение громкости от 0 до 10
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
