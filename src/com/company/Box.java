package com.company;

public class Box<Q,R> {
    private Q var1;
    private R var2;

    public Box() {
    }

    public Box(Q var1, R var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public Q getVar1() {
        return var1;
    }

    public void setVar1(Q var1) {
        this.var1 = var1;
    }

    public R getVar2() {
        return var2;
    }

    public void setVar2(R var2) {
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "Box:" +
                " var1: " + var1 +
                " var2: " + var2;
    }

    public static  <T> Box method() {
        Box bo = new Box(33,"Generics");
        return bo;

    }
}
