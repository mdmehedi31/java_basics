package com.version1.result_show;

public class StaticOut {

    static int x;
    static int y;
    void add(int a, int b){
        x=a+b;
        y=x+b;
    }
}


class MainOut{

    public static void main(String[] args) {
        StaticOut obj1 = new StaticOut();
        StaticOut obj2= new StaticOut();

        int a=2;
        obj1.add(a,a+2);
        obj2.add(5,a);


        System.out.println(obj1.x+", "+obj2.y+", ");
    }


}
