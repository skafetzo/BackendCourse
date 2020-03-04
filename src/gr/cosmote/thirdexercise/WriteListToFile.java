package gr.cosmote.thirdexercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class WriteListToFile {

    private List<String> myList;

    public WriteListToFile(List<String> myList) {
        this.myList = myList;

    }

    public void printToFile() {

        FileWriter myFile = null;
        try {
            myFile = new FileWriter("test.txt");
            for (String item : this.myList) {
                myFile.write(item);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (myFile != null) {
                try {
                    myFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//Also write read

    public static void main(String[] args) {

        List<String> testList = new ArrayList<>();

        testList.add("One");
        testList.add("Two");
        testList.add("Three");

        WriteListToFile a = new WriteListToFile(testList);

        a.printToFile();

    }
}
