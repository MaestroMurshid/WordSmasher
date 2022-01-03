
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
public class Beginner {
    
    public String wordArray[]={"day","cafe","rage","ruin","sour","flu","brag","fur","tape","news"
            ,"tube","herd","pig","doll","tree","use","halt","dull","riot","twin","duty","cane",
            "slow","mood","help","weak","drag","rob","curl","tax","rare","last","zero","far",
            "slip","calf","leaf","sea","hall","huge","door","dive","pity","set","coin","pop",
            "plan","acid","gate","bet","swop","poll","slot","seat","roof","bin","goal","lid",
            "nail","pot","nap","pool","spy","just","care","list","ex","lot","cage","bing",
            "rain","fail","knee","bay","pen","wing","fare","gown","pole","mean","able",
            "frog","rack","give","hear","firm","lock","bind","back","eye","keep","taxi",
            "view","fuss","form","will","beg","loud","tell","monk"};
              
                
            public void shuffleWords(){

                List<String> intList = Arrays.asList(wordArray);
		Collections.shuffle(intList);
		intList.toArray(wordArray);    
            }
}
