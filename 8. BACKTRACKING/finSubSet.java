public class finSubSet {
    public static void main(String[] args) {
        String s = "abc";
        subSet(s, "", 0);

    }
    public static void subSet(String s, String a,int i){
        if(i==s.length()){
            if(a.length()==0){
                System.out.println("null");
            }else{
                System.out.println(a);
            }
            return;
        }
        subSet(s, a+s.charAt(i), i+1); 
        subSet(s, a, i+1); 
    }
}
//string are immutable
 
