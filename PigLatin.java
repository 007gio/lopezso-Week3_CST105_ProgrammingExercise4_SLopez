/**Program: PigLatin
 * File: PigLatin.java
 * Summary:Converts English to Pig Latin 
 * Author: Sergio M. Lopez
 * Date: October 3, 2017
 **/
class Piglatin{

    public static boolean isVowel(char C) {
        String vowels = "AEIOU";
        char upper = Character.toUpperCase(C);//converting words into uppercase
 
        for(int I=0; I < vowels.length(); I++){
            if(upper == vowels.charAt(I)){
                return true;
            }
 
        }
 
        return false;
 
    }
    public static String toPigLatin(String str){
        if(isVowel(str.charAt(0))){//converting piglatin if vowel exists
            return str.substring(1) + str.charAt(0) + "WAY";
 
        }
 
        for(int I = 1; I < str.length(); I++){
            if(isVowel(str.charAt(I))){
                return str.substring(I) + str.substring(0, I) + "AY";
            }
        }
 
        return "";
    }
 
    public static void main (String[] args) throws java.lang.Exception
    {
        //inserted text to be translated here:
        String test = "IT";
        String result = toPigLatin(test);
 
        System.out.println(result);
 
        test = "WAS";
        result = toPigLatin(test);
 
        System.out.println(result);
 
        test = "A";
        result = toPigLatin(test);
 
        System.out.println(result);
 
        test = "DARK";
        result = toPigLatin(test);
 
        System.out.println(result);
 
        test = "AND";
        result = toPigLatin(test);
 
        System.out.println(result);
 
        test = "STORMY";
        result = toPigLatin(test);
 
        System.out.println(result);
 
        test = "NIGHT"; 
        result = toPigLatin(test);
 
        System.out.println(result);
    }
}