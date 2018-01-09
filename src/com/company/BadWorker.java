package com.company;

import java.util.LinkedList;

public class BadWorker {
    private LinkedList<String> inputData = new LinkedList<>();

    public BadWorker(LinkedList<String> inputData) {
        this.inputData = inputData;
    }

    LinkedList<Character> characters = new LinkedList<>();

    public void process() {
        characters= new LinkedList<>();
        for (int i = 0; i < inputData.size() -1 ; i++) {
            String cur1 = inputData.get(i);
            String cur2 = inputData.get(i + 1);
            int l = cur1.length();
            if (cur1.length() > cur2.length()) {
                l=cur2.length();
            }
            for (int j = 0; j < l; j++) {
                char char1 = cur1.charAt(j);
                char char2 = cur2.charAt(j);
                if (char1 != char2) {

                    if(characters.contains(char1) && !characters.contains(char2)) {
                        int pos = characters.indexOf(char1);
                        characters.add(pos+1,char2);
                        System.out.println(characters);
                    }
                    if(!characters.contains(char2) && !characters.contains(char1)){
                        characters.addLast(char1);
                        characters.addLast(char2);
                        System.out.println(characters);
                    }
                    if (characters.contains(char1) && characters.contains(char2)) {

                        int post1 = characters.indexOf(char1);
                        int post2 = characters.indexOf(char2);
                        if (post1 > post2) {
                            characters.add(post1+1,char2);
                            characters.remove(post2);
                            System.out.println(characters);
                        }
                    }
                    break;
                } else {
                    if(!characters.contains(char1)) {
                        characters.addLast(char1);
                        System.out.println(characters);
                    }
                }
            }
        }
    }

    public LinkedList<Character> getCharacters() {
        process();
        return characters;
    }
}
