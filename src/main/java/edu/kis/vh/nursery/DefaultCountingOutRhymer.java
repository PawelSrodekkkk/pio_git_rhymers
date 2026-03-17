package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ERROR_CODE = -1;
    public static final int NUMBERS_COUNT = 12;
    private int[] numbers = new int[NUMBERS_COUNT];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == -1;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return ERROR_CODE;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return ERROR_CODE;
                        return numbers[total--];
                    }

}
