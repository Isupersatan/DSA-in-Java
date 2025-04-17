// Clear Bit:
// clear the Third bit (pos=2) of a number n.(n=0101)
// i)Bit Mask:1<<i
// ii) And with NOT
public class clearBit {
    public static void main(String[] args) {
        int n = 5; // 0101 in binary
        int pos = 2; // position of bit to be cleared
        int mask = 1 << pos; // create a mask
        int notMask = ~mask; // NOT of mask
        int result = n & notMask; // clear the bit at pos
        System.out.println("Result after clearing the bit at position " + pos + " is " + result);
    }
}
