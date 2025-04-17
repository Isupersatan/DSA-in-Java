// Get Bit:
// Get The third bit (pos=2) of a number n,(n=0101)
// i) Bit Mask:1<<i
// ii) And

public class getBit {

    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("Bit is Zero");
        } else {
            System.out.println("Bit is One");
        }

    }
}
