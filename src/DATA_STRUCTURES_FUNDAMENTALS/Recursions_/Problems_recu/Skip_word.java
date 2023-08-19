package DATA_STRUCTURES_FUNDAMENTALS.Recursions_.Problems_recu;

public class Skip_word {
    public static void main(String[] args) {
        System.out.println(skipApple("appleebdapplefg"));
    }
    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        else
            return str.charAt(0) + skipApple(str.substring(1));
    }
}
