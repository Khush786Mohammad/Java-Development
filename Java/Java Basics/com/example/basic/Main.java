package com.example.basic;

public class Main {
    public static void main(String[] args) {
        String str = "Khush";
        String str2 = str;
        str2 += "Mohammad";

        System.out.println(str.hashCode()+ " " + str2.hashCode());
    }
}
