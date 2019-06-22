import java.util.*;

public class Exceptions{
    public static void junk(){
        ArrayList<Object> trashCan = new ArrayList<Object>();
        trashCan.add("19");
        trashCan.add("Broken Stereo");
        trashCan.add("9");
        trashCan.add("Garbo");
        trashCan.add("41");
        trashCan.add("58");

        try{
            for(int i = 0; i < trashCan.size(); i++){
                Integer value = (Integer) trashCan.get(i);
            }
        }
            catch(ClassCastException e){
                System.out.println("Error: Literal Garbage");
            }
    }
    public static void main(String[] args){
        junk();
    }
}
