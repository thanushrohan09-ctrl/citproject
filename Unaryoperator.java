public class Unaryoperator {
    public static void main(String[] args) {
        int x=5;
        System.out.println("original: "+x);
        //x++(postincreament)

        System.out.println("preincreament: "+(x--));//5
        System.out.println("After preincrement: "+ x);//4
        System.out.println("post increament: "+(x++));//4
        System.out.println("After postincrement: "+x);//5

    }
}
