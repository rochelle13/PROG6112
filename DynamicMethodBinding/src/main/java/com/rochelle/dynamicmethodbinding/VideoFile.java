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
class VideoFile extends MediaFile {

    //variables
    private String resolution;
    private int fps;

    //constructor
    public VideoFile(String filename, long fileSize, String resolution, int fps) {
        super(filename, fileSize);
        this.resolution = resolution;
        this.fps = fps;
    }

    //methods from parent class that are being overriden
    @Override
    public void play() {
        System.out.println("Playing video with video codec");
        System.out.println("Resolution: " + resolution + " at " + fps + " FPS");
        System.out.println("Using video rendering pipeline with hardware acceleration");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Video File | Resolution: " + resolution + " / FPS: " + fps);
    }

}
