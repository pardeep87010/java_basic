import java.util.*;

// string tokenizer - hasMoreToken(), nextToken(), CountToken()

public class string_tokenizer {
    public static void main(String[] args) {
        String str = "Java,Python,C++";
        StringTokenizer st = new StringTokenizer(str,",");
        System.err.println("token : " +st.countTokens());
        while (st.hasMoreTokens()) {
            System.err.println(st.nextToken());
            
        }

    }
}
