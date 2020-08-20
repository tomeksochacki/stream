package com.company;

class Main4 {
    public static void main(String[] args) {
        String sentence = "Speak is silver and notspeak is gold";
        String name = new String ("Tomek");

        String tomek = "Tomek";
        String name2 = new String("Tomek");

        System.out.println(tomek == name2);
        System.out.println(tomek.equals(name2));
        System.out.println(tomek.toUpperCase());
        System.out.println(tomek);


        System.out.println();

        StringBuilder stringBuilder = new StringBuilder("Tomek");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(1);
        System.out.println(stringBuilder);
        stringBuilder.insert(1, "e");
        System.out.println(stringBuilder);

    }
}
