package com.will.jsondemo;

public class Score {
    private int math;
    private int English;
    private int Chinese;

    public Score(int math, int english, int chinese) {
        this.math = math;
        English = english;
        Chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }
}
