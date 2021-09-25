public class Break {
    public static void main(String[] args) {
        myname:
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==3)
                break myname;
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
