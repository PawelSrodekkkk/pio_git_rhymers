package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ERROR_CODE = -1;
    public static final int MAX_NUMBERS_COUNT = 12;
    private final int[] numbers = new int[MAX_NUMBERS_COUNT];

  private int total = -1;
  public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }



    public void countIn(int in) {
        if (!isFull())
        {
            setTotal(getTotal() + 1);
            numbers[getTotal()] = in;
        }

    }

        public boolean callCheck() {
            return getTotal() == -1;
        }
        
            public boolean isFull() {
                return getTotal() == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return ERROR_CODE;
                    return numbers[getTotal()];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return ERROR_CODE;
                        setTotal(getTotal() - 1);
                        return numbers[getTotal()+1];
                    }

}
