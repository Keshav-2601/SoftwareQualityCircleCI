package org.example.Classes;

public class CalculatorClass {
    int num1;
    int num2;

    public CalculatorClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add() {
        return num1+num2;
    }
    public int sub(){
        return num1-num2;
    }
    public int mul(){
        return num1*num2;
    }
    public int div(){
        if(num1>0 &&num2>0){
            return num1/num2;
        }
        return 0;
    }
}
