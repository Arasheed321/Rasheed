
import java.util.Scanner;

class ProjectorRemote {
    private int brightness;

    // Constructor to initialize the projector remote
    public ProjectorRemote() {
        this.brightness = 50; // Initial brightness set to 50
    }

    // Method to increase the brightness
    public void increaseBrightness() {
        if (brightness < 100) {
            brightness += 10;
            System.out.println("Brightness increased to " + brightness + "%.");
        } else {
            System.out.println("Cannot increase brightness further.");
        }
    }

    // Method to decrease the brightness
    public void decreaseBrightness() {
        if (brightness > 0) {
            brightness -= 10;
            System.out.println("Brightness decreased to " + brightness + "%.");
        } else {
            System.out.println("Cannot decrease brightness further.");
        }
    }

    // Method to display the current brightness
    public void displayBrightness() {
        System.out.println("Current Brightness: " + brightness + "%");
    }
}

        // Creating an instance of the ProjectorRemote class
        ProjectorRemote myProjectorRemote = new ProjectorRemote();
        Scanner scanner = new Scanner(System.in);

        // Using the projector remote functionalities
        myProjectorRemote.displayBrightness();

        // Projector control loop
        while (true) {
            System.out.print("Enter 'I' to increase brightness, 'D' to decrease brightness, or 'Q' to quit: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'I':
                case 'i':
                    myProjectorRemote.increaseBrightness();
                    break;
                case 'D':
                case 'd':
                    myProjectorRemote.decreaseBrightness();
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Exiting projector remote control.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            myProjectorRemote.displayBrightness();
        }
    }
}