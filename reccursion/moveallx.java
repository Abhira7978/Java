package reccursion;

public class moveallx {
    public static void moveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i =0 ;i<count;i++){
                newString +='x';
            }
            System.out.println(newString);
            return ;
        }
        char Current=str.charAt(idx);
        if(Current == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString +=Current;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbxxcxdxx";
        moveAllX(str, 0, 0, "");
        
    }
    
}
