package HomeWork_11_String_Collection;
import java.util.*;

public class HW_11 {

    public static void main(String[] args) {
        String word = new Method().InputSentence();
        List <String> list2=new Method().CreateList(word);
        //System.out.println(list2);
        Set<String> treeSet = new TreeSet<>(list2);
        for (String h : treeSet) {
            System.out.println(h);
        }
    }
}