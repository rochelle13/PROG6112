/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rochelle.dynamicmethodbinding;

/**
 *
 * @author 27790
 */
//Parent Class -represents any media file 
abstract class MediaFile {

    //variables
    protected String filename;
    protected long fileSize;

    //constructor 
    public MediaFile(String filename, long fileSize) {
        this.filename = filename;
        this.fileSize = fileSize;
    }

    //Abstract Method - implemented by subclass
    public abstract void play();

    //Virtual method that can be overriden
    public void displayInfo() {
        System.out.println("File: " + filename + " ("
                + fileSize + "bytes");
    }

    //Method that uses dynamic binding internally
    public void startPlayback() {
        System.out.println("Intializing playback system...");
        displayInfo();//will call the overriden versions if available
        play();//will call the appropriate  subclass implementation
        System.out.println("Playback started successfully!\n");
    }
}
