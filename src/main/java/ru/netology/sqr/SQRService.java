package ru.netology.sqr;

public class SQRService {
    public int calculateSqrtBorder (int min, int max){
        int j = 0;
        for (int i = 10; i <=99; i++){
            if (i * i >= min && i * i <= max){
                j++;
                System.out.println("значение " +i);
            }
        }
        return j;
    }
}

