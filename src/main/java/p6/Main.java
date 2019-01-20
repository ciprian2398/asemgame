package p6;

import p3_4.Song;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Song> getSongs() {
        return Arrays.asList(
                new Song(),
                new Song("denumire1",
                        "gen1",
                        "interpret1"),
                new Song("denumire2",
                        "gen2",
                        "interpret2",
                        22.2,
                        "autorVersuri2",
                        "autorMuzica2",
                        2022,
                        2.2)
        );
    }

    public static void main(String[] args) {
        List<Song> songArrayListSongs = new ArrayList<>();
        List<Song> songLinkedListSongs = new LinkedList<>();
        songArrayListSongs.addAll(getSongs());
        songLinkedListSongs.addAll(getSongs());

        songArrayListSongs.forEach(System.out::println);
        songLinkedListSongs.forEach(System.out::println);
    }
}
