
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Intermediate {
    public String wordArray[]={"check","spray","seek","abbey","carbon","budge","script","sum","polite","use"
            ,"get","affair","read","rest","break","danger","embox","die","piano","lane","stab","idea","pigeon"
            ,"tempt","clash","canvas","sigh","pilot","cage","agony","graze","decade","loop","means","put"
            ,"part","accept","sniff","offer","end","sunday","forbid","dark","virus","sweet","chaos","ally"
            ,"shave","tiger","haunt","raid","swipe","eaux","sweep","lid","move","heat","race","cater","locate"
            ,"dash","lie","stun","arena","morsel","rear","animal","pledge","export","uncle","entry","silk","boat"
            ,"aware","bomb","arch","yard","mean","link","cancel","cane","member","sale","wait","tap","ankle","buffet"
            ,"bean","new","sticky","meadow","bond","harsh","screw","update","finger","oppose","tree","stamp","fix"};
              
                
            public void shuffleWords(){

                List<String> intList = Arrays.asList(wordArray);
		Collections.shuffle(intList);
		intList.toArray(wordArray);    
            }
}
