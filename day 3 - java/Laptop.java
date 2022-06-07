class Storage{
    String type;
    int size;

    Storage(String type, int size){
        this.type = type;
        this.size = size;
    }
}
class Os{
    String name;
    int version;

    Os(String name, int version)
    {
        this.name = name;
        this.version = version;
    }
}

class Screen{
    int dimension;
    int refRate;
    int pixCount;

    Screen(int dimension, int refRate, int pixCount)
    {
        this.dimension = dimension;
        this.refRate = refRate;
        this.pixCount = pixCount;
    }
}
class Laptop{
    Storage st;
    Os opSy;
    Screen sc;

    Laptop(Storage st, Os opSy, Screen sc)
    {
        this.st = st;
        this.opSy = opSy;
        this.sc = sc;
    }

    public static void main(String[] args){
        Storage st =new Storage("SSD",512);
        Os o=new Os("Windows",11);
        Screen sc=new Screen(123,60,234);
        Laptop lap1=new Laptop(st,o,sc);

        System.out.println(lap1.st.size + " " + lap1.st.type + " " + lap1.sc.dimension + " " + lap1.sc.pixCount + " " + lap1.sc.refRate + " " + lap1.opSy.name + " " + lap1.opSy.version );
    }
}
