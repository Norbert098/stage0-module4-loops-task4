package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int countedSum = 0;
        for(int i = 0; i <= lastInRow; i++) {
            countedSum += i;
            if (i == numberToSkip) {
                skippedSum += countedSum;
                continue;
            }
        }
        countedSum = countedSum - skippedSum;
        if(numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        }
        else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else
        System.out.println("skipped sum is " + skippedSum + "\ncounted sum is " + countedSum);
    }
}
