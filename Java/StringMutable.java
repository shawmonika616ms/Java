public class StringMutable {

    public static void main(String[] args) {
        
        StringBuffer sbf= new StringBuffer("navin");
        sbf.append("reddy");
        sbf.replace(0, 5, "Manoj");
        System.out.println(sbf);
    }
}
