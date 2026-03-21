package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

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
                        return -1;
                    return numbers[getTotal()];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return -1;
                        setTotal(getTotal() - 1);
                        return numbers[getTotal()+1];
                    }

}
