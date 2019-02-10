public class Main {

    public static void main(String[] args) {

        System.out.println("Enter some variable\n" +
                "from one to nine thousand nine hundred ninety nine\n" +
                "or print \"stop\" to stop the program.");
        Memory memory = new Memory();
        Reader myReaderThread = new Reader(memory);
        Deleter myDeleterThread = new Deleter(memory);

        myReaderThread.start();
        myDeleterThread.start();
    }
}
