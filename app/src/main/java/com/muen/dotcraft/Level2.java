package com.muen.dotcraft;

class Level2 implements Level {

    private final int[] dotArr = new int[9];
    private final int[] containerArr = new int[9];

    public Level2() {
        int x1 = (int)(Math.random()*9);
        int x2 = (int)(Math.random()*9);
        while(x2 == x1){
            x2 = (int)(Math.random()*9);
        }
        int x3 = (int)(Math.random()*9);
        while(x3 == x2 || x3 == x1){
            x3 = (int)(Math.random()*9);
        }

        int y1 = (int)(Math.random()*9);
        int y2 = (int)(Math.random()*9);
        while(y2 == y1){
            y2 = (int)(Math.random()*9);
        }
        int y3 = (int)(Math.random()*9);
        while(y3 == y2 || y3 == y1){
            y3 = (int)(Math.random()*9);
        }

        dotArr[x1] = 1;
        dotArr[x2] = 1;
        dotArr[x3] = 1;

        containerArr[y1] = 1;
        containerArr[y2] = 1;
        containerArr[y3] = 1;
        /*dotArr[0] = 1;
        dotArr[5] = 1;
        dotArr[6] = 1;
        dotArr[7] = 1;

        containerArr[0] = 1;
        containerArr[2] = 1;
        containerArr[5] = 1;
        containerArr[4] = 1;*/
    }

    @Override
    public int[] getDotArray() {
        return dotArr;
    }

    @Override
    public int[] getContainerArray() {
        return containerArr;
    }

}
