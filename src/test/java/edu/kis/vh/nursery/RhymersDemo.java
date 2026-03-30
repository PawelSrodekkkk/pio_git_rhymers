package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static final int RHYMERS_COUNT = 4;
    public static final int LAST_RHYMER_NUMBER = 15;
    public static final int MAX_RND_NUMBER = 20;
    public static final String TOTAL_REJECTED_IS_TEXT = "total rejected is ";

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        testRhymers(factory);

    }

    private static void testRhymers(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = 1; i < LAST_RHYMER_NUMBER; i++)
            for (int j = 0; j < RHYMERS_COUNT-1; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < LAST_RHYMER_NUMBER; i++)
            rhymers[RHYMERS_COUNT-1].countIn(rn.nextInt(MAX_RND_NUMBER));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println(TOTAL_REJECTED_IS_TEXT
                + ((HanoiRhymer) rhymers[RHYMERS_COUNT-1]).reportRejected());
    }

}