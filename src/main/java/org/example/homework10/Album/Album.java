package org.example.homework10.Album;

import java.util.ArrayList;

public class Album {
    private String title;
    private SongList songList;

    public Album(String title) {
        this.title = title;
        this.songList = new SongList();
    }

    public String getTitle() {
        return title;
    }

    public boolean addSong(String title, double duration) {
        return this.songList.addSong(new Song(title, duration));
    }

    public Song findSongByTitle(String title) {
        return this.songList.findSongByTitle(title);
    }

    public Song findSongByTrackNumber(int trackNumber) {
        return this.songList.findSongByTrackNumber(trackNumber);
    }

    private class Song {
        private String title;
        private double duration;

        public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        public double getDuration() {
            return duration;
        }
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {
            if (findSongByTitle(song.getTitle()) != null) {
                return false;
            }
            songs.add(song);
            return true;
        }

        public Song findSongByTitle(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSongByTrackNumber(int trackNumber) {
            if (trackNumber >= 1 && trackNumber <= songs.size()) {
                return songs.get(trackNumber - 1);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Album myAlbum = new Album("My Album");

        myAlbum.addSong("Song 1", 3.5);
        myAlbum.addSong("Song 2", 4.2);
        myAlbum.addSong("Song 3", 5.1);

        Song songByTitle = myAlbum.findSongByTitle("Song 2");
        if (songByTitle != null) {
            System.out.println("Song found by title: " + songByTitle.getTitle());
        } else {
            System.out.println("Song not found by title.");
        }

        Song songByTrackNumber = myAlbum.findSongByTrackNumber(2);
        if (songByTrackNumber != null) {
            System.out.println("Song found by track number: " + songByTrackNumber.getTitle());
        } else {
            System.out.println("Song not found by track number.");
        }
    }
}