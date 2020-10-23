import java.util.*;

public class Test710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] notes = new String[1000];
        int counter = 0;
        while(true) {
            System.out.println("Please enter command");
            String command = sc.nextLine();
            switch (command) {
                case "add":
                    add(counter, notes, sc);
                    break;
                case "remove":
                    remove(counter, notes);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "printAll":
                    printAll(notes);
                    break;
                case "print":
                    print(sc, notes);
                    break;
                case "longest":
                    printLongest(notes, counter);
                    break;
                default:
                    System.out.println("Unknown command! Try again");
            }
        }
    }

    public static void add(int counter, String[] notes, Scanner sc) {
        boolean flag = true;
        counter = notes.length;
        for (int i = 0; i < counter && flag; i++) {
            notes[i] = sc.nextLine();
            if (notes[i].equals("")) {
                flag = false;
                notes[i] = null;
            }
        }
    }

    public static void remove(int counter, String[] notes) {
        boolean flag = true;
        counter = notes.length;
        for (int i = counter-1; i >= 0 && flag; i--) {
            if (notes[i] == null) {
                continue;
            } else {
                notes[i] = null;
                flag = false;
            }
        }
    }
    
    public static void printAll(String[] notes) {
        boolean flag = true;
        for (int i = 0; (i < notes.length) && flag; i++) {
            if (notes[i] == null) {
                flag = false;
                break;
            }
            System.out.print(notes[i] + " ");
        }
        System.out.println();
    }
    
    public static void print(Scanner sc, String[] notes) {
        String line = sc.nextLine();
        for ( int j = 0; j < notes.length; j++ ) {
            if (line.equals(notes[j])){
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
    
    public static void printLongest(String[] notes, int counter) {
        int max = -1;
        String word = "";
        counter = notes.length;
        for (int i = 0; i < counter; i++) {
            if (notes[i] == null) {
                break;
            }
            if (notes[i].length() > max) {
                max = notes[i].length();
                word = notes[i];
            }
        }
        if (max != -1) {
            System.out.println(word);
        } else {
            System.out.println("There are not word here");
        }
    }
}
