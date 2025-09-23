/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rochelle.dynamicmethodbinding;

/**
 *
 * @author 27790
 */
//child class that inherits from parent class
class AudioFile extends MediaFile {

    //variables
    private int bitrate;

    //constructor 
    public AudioFile(String filename, long fileSize, int bitrate) {
        super(filename, fileSize);
        this.bitrate = bitrate;
    }

    //methods from parent class that are being overriden
    @Override
    public void play() {
        System.out.println("Playing audio with audio codec");
        System.out.println("Bitrate: " + bitrate + " kbps");
        System.out.println("Using audio-only rendering pipeline");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Audio File | Bitrate: " + bitrate + "kbps");
    }

}
