package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    String band;
    Integer numberOfSongs;

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }
    @Override
    public void loadDisc() {

    }
    @Override
    public void ejectDisc() {

    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Integer getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(Integer numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
