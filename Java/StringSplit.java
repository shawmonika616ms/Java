public class StringSplit {
    public static void main(String[] args) {
        String str= "tom, Jerry, Abc,Def";

        String names[]= str.split(",");

        // System.out.println(names[2]);
        for(String val: names)
        System.out.println(val);
    }
    
}
