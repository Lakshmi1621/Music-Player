package MusicPlayer;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Musicplayer musicPlayer = new Musicplayer();
        Scanner scanner = new Scanner(System.in);

        musicPlayer.addSong(new Song("Shape of You", "Ed Sheeran", Category.ENGLISH.getCategory(), 240));
        musicPlayer.addSong(new Song("Dil Diyan Gallan", "Atif Aslam", Category.HINDI.getCategory(), 210));
        musicPlayer.addSong(new Song("Butta Bomma", "Armaan Malik", Category.TELUGU.getCategory(), 180));

        boolean running = true;

        while (running) {
            System.out.println("\n--- Music Player ---");
            System.out.println("1. Display all songs by category");
            System.out.println("2. Play a song");
            System.out.println("3. Pause the current song");
            System.out.println("4. Stop the current song");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Select category (1: Hindi, 2: English, 3: Telugu): ");
                    int categoryChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Category category = null;
                    if (categoryChoice == 1) {
                        category = Category.HINDI;
                    } else if (categoryChoice == 2) {
                        category = Category.ENGLISH;
                    } else if (categoryChoice == 3) {
                        category = Category.TELUGU;
                    }
                    if (category != null) {
                        musicPlayer.displaySongsByCategory(category);
                    }
                    break;

                case 2:
                    System.out.println("Enter the song title to play: ");
                    String songTitle = scanner.nextLine();
                    Song songToPlay = null;
                    for (Song song : musicPlayer.getSongs()) {
                        if (song.getTitle().equalsIgnoreCase(songTitle)) {
                            songToPlay = song;
                            break;
                        }
                    }
                    if (songToPlay != null) {
                        musicPlayer.playSong(songToPlay);
                    } else {
                        System.out.println("Song not found.");
                    }
                    break;

                case 3:
                    musicPlayer.pauseSong();
                    break;

                case 4:
                    musicPlayer.stopSong();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting Music Player...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

        

}
