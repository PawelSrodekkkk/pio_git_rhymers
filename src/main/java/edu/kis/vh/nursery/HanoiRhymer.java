package edu.kis.vh.nursery;

/**
 *
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * funkcja zwraca totalRejected
     * @return
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * funkcja liczy total rejected i wywoluje countIn gdy warunek zostanie spelniony
     * @param in
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
