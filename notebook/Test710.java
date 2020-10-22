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
                    if (counter < notes.length) {
                        add(counter, notes, sc);
                        counter++;   
                    } else {
                        System.out.println("Array is filled");
                    }
                    break;
                case "remove":
                    if (counter >= 1) {
                        counter--;
                        remove(counter, notes);
                    } else {
                        System.out.println("There is nothing to remove");
                    }
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "printAll":
                    printAll(counter, notes);
                    System.out.println();
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

    public static void add(int counter, String[] notes, Scanner sc){
        notes[counter] = sc.nextLine();
    }

    public static void remove(int counter, String[] notes){
        notes[counter] = null;
    }
    public static void printAll(int counter, String[] notes){
        for (int i = 0; i < counter; i++){
            System.out.print(notes[i] + " ");
        }
    }
    public static void print(Scanner sc, String[] notes) {
        String line = sc.nextLine();
        for ( int j = 0; j < notes.length; j++ ) {
            if (line.equals(notes[j])){
                System.out.println(j);
            } else {
                System.out.println("Line is not found");
            }
        }
    }
    public static void printLongest(String[] notes, int counter) {
        int max = -1;
        String word = "";
        for (int i = 0; i < counter; i++) {
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
