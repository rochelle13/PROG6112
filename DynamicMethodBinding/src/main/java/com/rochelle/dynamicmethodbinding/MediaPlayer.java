/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rochelle.dynamicmethodbinding;

/**
 *
 * @author 27790
 */
//Media player class used to demonstrate dynamic method binding
class MediaPlayer {

    public void playMedia(MediaFile media) {
        //the method called depends on the runtime type of the media 
        media.startPlayback();
    }

    public void playPlaylist(MediaFile[] playlist) {
        System.out.println("STARTING PLAYLIST");
        //different implementations may be called each iteration
        //the emthods being called at runtime depends on the object type
        for (int i = 0; i < playlist.length; i++) {
            MediaFile media = playlist[i];
            playMedia(media);
        }
        System.out.println("PLAYLIST COMPLETE");
    }

}
