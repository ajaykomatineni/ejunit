package com.epam_junit;
public class del_char {
    public String remove_vowel(String s)
    {
        String finalString = "";
        int i;
        for(i=0; i<s.length(); i++)
        {
            if (!isVowel(Character.toLowerCase(s.charAt(i))))
            {
                finalString = finalString + s.charAt(i);
            }
        }
        return finalString;
    }
    private static boolean isVowel(char c)
    {
        String vowels = "aeiou";
        int i;
        for(i=0; i<5; i++)
        {
            if(c == vowels.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}
