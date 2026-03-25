public class bitwiseopreator {
    public static void main(String[] args) {
        int a=5;//0101
        int b=2;//0010

     System.out.println("AND: "+(a & b));
     System.out.println("OR: "+(a | b));
     System.out.println("XOR: "+(a ^ b));
     System.out.println("NOT: "+(~b));

      char c=345;
    System.out.println(c);
    long unsignedvalue= Integer.toUnsignedLong(c);
    System.out.println("long unsignedvalue: "+unsignedvalue);
    }
    
}
