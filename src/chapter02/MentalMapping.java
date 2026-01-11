package chapter02;

import java.util.List;

public class MentalMapping {

    public void processData(){
        List<String> l = List.of("user1","user2");
        for (String s : l){
            String r = s.toLowerCase();
            System.out.println(r);
        }
    }

    public void processUserNames(){
        List<String> userNames = List.of("user1","user2");
        for (String userName : userNames){
            String lowercaseName = userName.toLowerCase();
            System.out.println(lowercaseName);
        }
    }
}
