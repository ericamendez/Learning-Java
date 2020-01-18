package com.company;

public class Main {
    public static void main(String[] args) {
//        int can be numbers from -2.147b through 2.147b, int is 4bytes, width of 32
        int myMinNum = -2_147_483_648;
        int myMaxNum = 2_147_483_647;

//        byte are 255 sum of all bits, when 11111111(byte) one of the ones is a bit, you get value 255. width of 8
        byte myByteMinNum = -128;
        byte myByteMaxNum = 127;
//        the value of all operations are integers, you need to type cast to wanted type
        byte newByte = (byte) (myByteMaxNum/2);

//        2 bytes, 1111111111111111, width of 16
        short myShortMin = -32768;
        short myShotMas = 32767;

//        8bytes, width of 64
        long myLongMin = -9_223_372_036_854_775_808L;
        long myLongMax = 9_223_372_036_854_775_807L;

        String var = "run";

        System.out.println(var);
    }
}
