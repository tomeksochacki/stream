package com.company;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.Date;

class Main6 {
    public static void main(String[] args) {
        try {

            File catalog = new File("something" + File.separator + "php" + File.separator + "msql");
            catalog.mkdirs();
            File catalog2 = new File("something" + File.separator + "php" + File.separator + "msql", "");
            if (!catalog2.exists()){
                catalog2.createNewFile();
            }

                File file = new File("test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalPath());
            System.out.println("----------------");
            System.out.println("Can write?" + file.canWrite());
            System.out.println("Can execute?" + file.canExecute());
            System.out.println("Can read?" + file.canRead());
            System.out.println("Is hidden?" + file.isHidden());
            System.out.println("Is it file?" + file.isFile());
            System.out.println("Last modification." + new Date(file.lastModified()));
            System.out.println("Lenght file with byte." + file.length());

            System.out.println("----------------");
            Main6.writeAllPath(new File(System.getProperty("user.dir")));
            //file.delete();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //System.out.println(System.getProperty("user.dir"));

    }

    public static void writeAllPath(File namePath){
        System.out.println(namePath.getPath());
        String[] nameFileAndCatalog = namePath.list();
        for (int i = 0; i< nameFileAndCatalog.length; i++){
            File p = new File(namePath.getPath(), nameFileAndCatalog[i]);


            System.out.println(p.getPath());

        if (p.isDirectory()){
            writeAllPath(new File(p.getPath()));
        }
        }

    }

}
