public class printcombi {
    public static String[] keypadd={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombi(String str , int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return ;
        }
        char current = str.charAt(idx);
        String mapping =keypadd[current-'0'];
        for(int i =0;i<mapping.length();i++){
            printCombi(str, idx+1, combination+mapping.charAt(i));

        }

        
    }
    public static void main(String[] args) {
        String str = "23";
        printCombi(str, 0, "");
        
    }
    
}
