public class Main {
    public static void main(String[] args) {
        
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        SortTextFile sorter = new SortTextFile(inputFile, outputFile);
        sorter.sortFile();

        System.out.println("File ordinato scritto con successo.");
    }
}