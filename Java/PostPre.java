public class PostPre {
    public static void main(String[] args) {
        int i =6;
       // int j= i++;
        int j= ++i;
        i = i++;
     
        System.out.println(j+"\tanswer is\t"+i);
    }
    
}
