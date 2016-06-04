package com.nickjwpark.calculator;

import android.util.Log;

/**
 * Created by Nick JongWook Park on 5/29/2016.
 */
public class myMathLibrary {

    static String tag = "debugging";

    public static int add(int a, int b){
        int ans = a + b;
        return ans;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }

    public static int abs(int a){
        if(a < 0){
            a = a * -1;
        }
        return a;
    }

    public static boolean isPrime(int a){
        boolean isPrime = true;
        for(int i=2; i<a; i++){
            if(a % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static int pow(int a, int b){
        //a의 b승을 돌려주는 함수
        int ans = 1;
        for(int i=0; i<b; i =i+1){
            ans = ans * a;
            Log.d(tag, "" + ans);
        }
        return ans;
    }


}
