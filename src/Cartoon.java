//Cartoon.java
//Constructor calls during inheritance

class Art {
    Art(){System.out.println("Art() Constructor");}
}

class Draw extends Art {
    Draw(){
        System.out.println("Draw Constructor");
    }
}

public class Cartoon extends Draw {
    Cartoon(){
        System.out.println("Cartoon Constructor");
    }

    public static void main(String[] args){
        Cartoon x = new Cartoon();
    }
}
