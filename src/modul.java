import java.util.Scanner;

public class modul {
    public static void main(String[] args) {
        Library library = new Library();
        Odtwarzacz player = new Odtwarzacz();
        Scanner scanner = new Scanner(System.in);


        library.AddSong(new Song("Enter Sandman - Metallica"));
        library.AddSong(new Song("Master of puppets - Metallica"));
        library.AddSong(new Song("One - Metallica"));

        while (true) {
            System.out.println("\n1. Wyświetl utwory");
            System.out.println("2. Odtwórz utwór");
            System.out.println("3. Utwórz playlistę");
            System.out.println("4. Wyświetl playlisty");
            System.out.println("0. Wyjście");
            System.out.print("Wybór: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //

            switch (choice) {
                case 1 -> {
                    int i = 1;
                    for (Song song : library.getSongs()) {
                        System.out.println(i++ + ". " + song);
                    }
                }
                case 2 -> {
                    System.out.print("Podaj numer utworu do odtworzenia: ");
                    int idx = scanner.nextInt() - 1;
                    if (idx >= 0 && idx < library.getSongs().size()) {
                        player.odtwarzaj(library.getSongs().get(idx));
                    } else {
                        System.out.println("Nieprawidłowy numer.");
                    }
                }
                case 3 -> {
                    System.out.print("Nazwa playlisty: ");
                    String name = scanner.nextLine();
                    Playlist playlist = new Playlist(name);
                    System.out.println("Dodaj utwory (numery, 0 aby zakończyć):");
                    for (int i = 0; i < library.getSongs().size(); i++) {
                        System.out.println((i + 1) + ". " + library.getSongs().get(i));
                    }
                    while (true) {
                        int songNum = scanner.nextInt();
                        if (songNum == 0) break;
                        if (songNum > 0 && songNum <= library.getSongs().size()) {
                            playlist.dodaj_piosenke(library.getSongs().get(songNum - 1));
                        }
                    }
                    scanner.nextLine(); //
                    library.DodajPlayliste(playlist);
                    System.out.println("Playlistę dodano.");
                }
                case 4 -> {
                    for (Playlist pl : library.getPlaylists()) {
                        System.out.println(pl);
                    }
                }
                case 0 -> {
                    System.out.println("Koniec.");
                    return;
                }
                default -> System.out.println("Nieznana opcja.");
            }
        }
    }
}