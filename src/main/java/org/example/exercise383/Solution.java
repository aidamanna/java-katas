package org.example.exercise383;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // SOLUTION 1
//        var ransomNoteList = getList(ransomNote);
//        var magazineList = getList(magazine);
//        boolean canConstruct = true;
//
//
//        for (Character ransomNoteChar: ransomNoteList) {
//            if (!magazineList.remove(ransomNoteChar)) {
//                canConstruct = false;
//                break;
//            }
//        }
//
//        return canConstruct;

        //SOLUTION 2
//        for (int i = 0; i < ransomNote.length(); i++) {
//            char r = ransomNote.charAt(i);
//
//            int matchingIndex = magazine.indexOf(r);
//
//            if (matchingIndex == -1) {
//                return false;
//            }
//
//            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
//        }
//
//        return true;

        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char magazineChar = magazine.charAt(i);

            int charCount = magazineLetters.getOrDefault(magazineChar, 0);
            magazineLetters.put(magazineChar, charCount + 1);

        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ransomNoteChar = ransomNote.charAt(i);

            int charCount = magazineLetters.getOrDefault(ransomNoteChar, 0);

            if (charCount == 0) {
                return false;
            }

            magazineLetters.put(ransomNoteChar, charCount - 1);
        }

        return true;
    }

    private static List<Character> getList(String ransomNote) {
        return ransomNote.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
