package DATA_STRUCTURES_FUNDAMENTALS.Recursions_.Problems_recu;
//remove letter a from the string
public class Remove_a {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("baccaaaaab aas");
        remove_a(sb, 0);
        System.out.println(sb);
    }
    

    static void remove_a(StringBuilder s, int index) {
        // Base condition
        if (index >= s.length()) {
            return;
        }

        Character ch=s.charAt(index);
        if (ch.equals('a')) {
            s.deleteCharAt(index);
            // Don't increment 'index' as the current character has been removed
        } else {
            // Only increment 'index' when 'a' is not removed
            index++;
        }
        remove_a(s, index); // Recursive call with strdated index
    }
}

