

public class test {

//    private int i;
//    private int j;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();
        String str = new String();
        String str2 = new String("123");
//        if(obj.equals(obj)){
//            System.out.println("2");
//        }
        System.out.println(obj.toString());

        System.out.println(1);

        System.out.println(1);
    }
}
