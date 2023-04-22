package org.launchcode.studio7;

public class BaseDisc {
    Double storageCapacity;
    String title;
    String genre;
    String length;
    Boolean isScratched = false;

    public String reportInfo() {
        return "";
    }

    public BaseDisc(Double storageCapacity, String title, String genre, String length, Boolean isScratched) {
        this.storageCapacity = storageCapacity;
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.isScratched = isScratched;
    }

    public BaseDisc() {

    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Boolean getScratched() {
        return isScratched;
    }

    public void setScratched(Boolean scratched) {
        isScratched = scratched;
    }
}
