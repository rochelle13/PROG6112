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
class PodcastFile extends MediaFile {

    //variables
    private String podcastSeries;
    private int episodeNumber;

    //constructor
    public PodcastFile(String filename, long fileSize, String podcastSeries, int episodeNumber) {
        super(filename, fileSize);
        this.podcastSeries = podcastSeries;
        this.episodeNumber = episodeNumber;
    }

    //methods from parent class that are being overriden
    @Override
    public void play() {
        System.out.println("Playing podcast with optimized speech");
        System.out.println("Series: " + podcastSeries + " - Episode " + episodeNumber);
        System.out.println("Enabling voice enhancement and speed controls");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Podcast | series: " + podcastSeries + "/ Episode: " + episodeNumber);

    }

}
