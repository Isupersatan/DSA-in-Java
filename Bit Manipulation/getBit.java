// Get Bit:
// Get The third bit (pos=2) of a number n,(n=0101)
// i) Bit Mask:1<<i
// ii) And

public class getBit {

    public static void main(String[] args) {
        int n = 5; //  0101 in binary
        int pos = 2;// position of bit to be cleared
        int bitMask = 1 << pos;// create a mask

        // get the bit at pos
        if ((bitMask & n) == 0) {
            System.out.println("Bit is Zero");
        } else {
            System.out.println("Bit is One");
        }

    }
}
