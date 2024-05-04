package section7_function;

import java.io.File;

public class FindFile {
    public static void main(String[] args) {
        String dir = "C:\\Users\\devonline\\IdeaProjects\\java-basic";
        String query = "FindFile.java";

        findFile(new File(dir), query);
    }

    private static void findFile(File dir, String fileName) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                findFile(file, fileName);
            } else if (file.isFile()) {
                if (fileName.equals(file.getName())) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}