
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
public class Advanced {
     public String wordArray[]={"nervous","defendant","explode","hilarious","hemisphere","software","housing","variant","ecstasy","rotation"
             ,"dribble","twilight","wedding","minimum","indirect","conservation","established","auditor","reduction","teacher","authority"
             ,"convince","volunteer","council","apparatus","candidate","birthday","account","organisation","citizen","precede","complex"
             ,"request","suspicion","describe","discreet","overeat","portion","hostage","contribution","empirical","hesitate","reluctance"
             ,"essential","eternal","lecture","hallway","contempt","houseplant","accident","technology","formula","approve","hospital"
             ,"communist","decrease","urgency","buttocks","provoke","conscience","operational","presidential","pavement","current"
             ,"director","equation","encourage","colorful","scramble","install","aviation","identification","dressing","celebration"
             ,"appoint","automatic","reptile","paragraph","genuine","revolutionary","treasurer","dilemma","marathon","chimney","respectable"
             ,"facility","stretch","headline","incentive","expression","experienced","science","station","athlete","nationalist","academy"
             ,"violation","arachnid","leviathan","statutory"};
              
                
            public void shuffleWords(){
                List<String> intList = Arrays.asList(wordArray);
		Collections.shuffle(intList);
		intList.toArray(wordArray);    
            }
}
