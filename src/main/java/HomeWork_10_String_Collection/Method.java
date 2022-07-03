package HomeWork_10_String_Collection;

import java.util.*;

public class Method {
        public String InputSentence() {
                Scanner scan = new Scanner(System.in);
                System.out.println("Input sentence");
                String p1 = scan.nextLine();
                return p1;
        }

        public ArrayList CreateList(String word) {

                String[] word2 = word.split(" ");
                List<String> list = new ArrayList<>();
                for (String l : word2) {
                        list.add(l.replace(",", "").replace(".", "")
                                .replace(":", ""));
                }
                List<String> list2=new ArrayList<>();
                for (String q : list) {
                        String st = q.substring(0, 1).toUpperCase();
                        String rest = q.substring(1).toLowerCase();
                        String res = st + rest;
                        list2.add(res);
                }
                /*for (String t : list2) {
                        System.out.println(t);}*/

                return (ArrayList) list2;
        }



}

