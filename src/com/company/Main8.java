package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Date;

class Main8 {
    public static void main(String[] args) {

        try {
            File catalog = new File("something2" + File.separator + "php" + File.separator + "msql");
            catalog.mkdirs();

            File file2 = new File("something2" + File.separator + "php" + File.separator + "msql", "lesson1.txt");
            if (!file2.exists()) ;
            file2.createNewFile();

            File file = new File("test2.txt");
            if (!file.exists()) ;
            file.createNewFile();
            System.out.println("_________");
            System.out.println(file.getCanonicalPath());
            System.out.println(file.getAbsolutePath());
            System.out.println("_________");
            System.out.println("Can write? " + file.canWrite());
            System.out.println("Can execute? " + file.canExecute());
            System.out.println("Can read? " + file.canRead());
            System.out.println("Is hidden? " + file.isHidden());
            System.out.println("Is file? " + file.isFile());
            System.out.println("Last modification?" + new Date(file.lastModified()));
            System.out.println("Length file with bite. " + file.length());

            file.list();
            //file.delete();
            System.out.println("_________");
            Main8.writeAllPath(new File(System.getProperty("user.dir")));


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //System.out.println(System.getProperty("java.home"));
    }

    public static void writeAllPath(File namePath) {
        String[] nameFileAndCatalog = namePath.list();
        //System.out.println(namePath.getPath());
        for (int i = 0; i < nameFileAndCatalog.length; i++) {
            File p = new File(namePath.getPath(), nameFileAndCatalog[i]);
            System.out.println(p.getPath());

            //if (p.isFile())
            //    writeAllPath(new File(p.getPath()));

            if (p.isDirectory()){
                System.out.println(p.getPath());
                writeAllPath(new File(p.getPath()));
            }
        }
    }
}
