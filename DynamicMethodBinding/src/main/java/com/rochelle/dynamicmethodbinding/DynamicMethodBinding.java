/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.dynamicmethodbinding;

/**
 *
 * @author 27790
 */
public class DynamicMethodBinding {

    public static void main(String[] args) {
        //Create different types of media files
        MediaFile song = new AudioFile("song.mp3", 5242880, 320);
        MediaFile movie = new VideoFile("shrek.mp4", 2147483648L, "1920x1080", 60);
        MediaFile podcast = new PodcastFile("tech_talk.mp3", 104857600, "Tech Weekly", 42);

        MediaPlayer player = new MediaPlayer();

        /*
        The compiler only knows these are MediaFile objects but at runtime 
        the correct overridden methods are called
         */
        System.out.println("INDIVIDUAL PLAYBACK DEMONSTRATION");

        player.playMedia(song);
        player.playMedia(movie);
        player.playMedia(podcast);

        //Creates a mixed playlist
        MediaFile[] playlist = {song, movie, podcast};

        System.out.println("PLAYLIST DEMONSTRATION");
        player.playPlaylist(playlist);

        // shows that reference type doesn't matter
        System.out.println("REFERENCE TYPE");
        MediaFile mysteryFile = new PodcastFile("mystery.mp3", 50000000, "Mystery Hour", 1);
        System.out.println("REFERENCE TYPE IS MEDIA FILE, BUT ACTUAL OBJECT IS PODCAST: ");
        //Podcast methods are still called 
        mysteryFile.startPlayback();

    }
}
