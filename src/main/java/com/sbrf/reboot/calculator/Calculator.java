package com.sbrf.reboot.calculator;

public class Calculator
{
    public int getAddition(int var1, int var2)
    {
        return var1 + var2;
    }

    public int getSubtraction(int var1, int var2)
    {
        return var1 - var2;
    }

    public int getMultiplication(int var1, int var2)
    {
        return var1 * var2;
    }

    public int getDivision(int var1, int var2)
    {
        return var1 / var2;
    }

    public int getPower(int var1)
    {
        return var1 * var1;
    }

    public int getArraySumm(int [] inp){
        int result = 0;
        for (int i: inp)
        {
            result += i;
        }
        return result;
    }

    public int getFactorial(int var1)
    {
        int result = 1;
        for (int i = 1; i <= var1; i++)
        {
            result *= i;
        }
        return result;
    }

}
