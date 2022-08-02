package ru.netology.sqr;

public class SQRService {

    public int squareNumberInRange (int lowerBound, int upperBound) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerBound <= i * i && i * i <= upperBound) {
                count++;
            }
        }
        return count;
    }
}
