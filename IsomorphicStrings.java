import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null)
            return true;
        if(s==null || t==null)
            return false;
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap=new HashMap<>();
        for(int i=0; i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
            }
            else {
                if(sMap.get(sChar)!=tChar)
                    return false;
            }
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar,sChar);
            }
            else {
                if(tMap.get(tChar)!=sChar)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings=new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphic("egg","add"));
    }
}
