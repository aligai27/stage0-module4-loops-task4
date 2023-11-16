package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(lastInRow < numberToSkip) {
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int sumSkip = 0;
            int sumCount = 0;
            for (int i = 0; i <= lastInRow; i++) {
                if (i <= numberToSkip) {
                    sumSkip += i;
                    continue;
                }
                sumCount += i;
            }
            System.out.println("skipped sum is " + sumSkip);
            System.out.println("counted sum is " + sumCount);
        }
    }
}
