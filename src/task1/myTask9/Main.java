package task1.myTask9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayMaxNum arrayMaxNum = new ArrayMaxNum(Input.setNumber());
        arrayMaxNum.setNumberOfArray();
        //arrayMaxNum.getArray();
        System.out.println(arrayMaxNum.findMaxNum());
    }
}
