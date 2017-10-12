/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1_4u;

/**
 *
 * @author Parry Katodia
 */
public class Quiz1_4U {
    
    public String reverseString(String word){
        // if the word is 0 length, then simply return an empty string 
        if(word.length()== 0){
            // call the method, an empty string is returned 
            return""; 
        }
        // call the method again, return the last letter fisrt plus the rest of the seperated word (This chunk of the word
        // left is then going to go through the same recursion loop until theree is no more letters left) 
        // print the word backwards 
        return word.charAt(word.length()-1) + reverseString(word.substring(0, word.length() - 1)); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests 
        Quiz1_4U test = new Quiz1_4U(); 
        // print the user's answer 
        System.out.println(test.reverseString("!emosewa si gnimmargorP !ereh saw yrraP GY"));    
    } 
}
