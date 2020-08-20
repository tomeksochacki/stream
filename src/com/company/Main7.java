package com.company;

import java.io.*;

class Main7 {
    public static void main(String[] args) throws IOException {

        File file = new File("test");
        InputStream iS;
        OutputStream oS;
        Reader reader;
        Writer writer = new BufferedWriter(new FileWriter(file));

        writer.write("lahgjjh");


        ((BufferedWriter) writer).newLine();
        ((BufferedWriter) writer).write("next line");

        ((BufferedWriter)writer).close();

    }
}
