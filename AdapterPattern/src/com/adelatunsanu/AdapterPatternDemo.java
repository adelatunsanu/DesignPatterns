package com.adelatunsanu;

public class AdapterPatternDemo {

    public static void main(String[] args) {
	    AudioPlayer audioPlayer = new AudioPlayer();

	    audioPlayer.play("mp3", "beyond the skyline.mp3");
	    audioPlayer.play("mp4", "blue eyes.mp4");
	    audioPlayer.play("vlc", "be happy.vlc");
		audioPlayer.play("avi", "mind me.avi");
    }
}
