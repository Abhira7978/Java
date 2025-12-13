public class subsequence {
    public static void subSequence(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return ;
        }
        char current=str.charAt(idx);
        //To Be
        subSequence(str, idx+1, newString+current);
        //To Not Be
        subSequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str ="abc";
        subSequence(str, 0, "");
        
    }
    
}
