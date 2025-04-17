// Set Bit:
// Set second bit(pos=1) of a number n.(n=0101)
// i)Bit Mask:1<<i
// ii)OR
public class setBit {
    public static void main(String[] args) {
        int n = 5;//0101 in binary
        int pos = 1;// position of bit to be cleared
        int bitMask = 1 << pos;// create a mask
        int result = n | bitMask;// set the bit at pos
        System.out.println("Result after setting the bit at position " + pos + " is " + result);
    }
}
