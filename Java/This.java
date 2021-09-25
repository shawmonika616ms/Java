 class Sup {
    int c;
    int a,b;

    void insert(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    void calculate()
    {
        c=a+b;
    }

    void display()
    {
        System.out.println("sum is"+c);
    }
    
}

class This {
    public static void main(String[] args) {
        Sup obj= new Sup();
        obj.insert(10, 20);
        obj.calculate();
        obj.display();
        

        
    }
}
