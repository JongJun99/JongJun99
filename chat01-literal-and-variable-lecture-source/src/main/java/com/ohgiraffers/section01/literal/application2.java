package com.ohgiraffers.section01.literal;

public class application2 {
    public static void main(String[] args) {

        System.out.println("====== 정수와 정수의 연산 ======");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("===== 실수와 실수의 연산 =====");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0); //약간의 오차가 발생함

        System.out.println("===== 정수와 실수의 연산 =====");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        System.out.println("===== 문자와 문자의 연산 "); // 아스키코드의 계산
        System.out.println('a' + 'b'); //아스키코드 a ==97
        System.out.println('a' - 'b'); //아스키코드 b ==98
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("===== 문자와 정수의 연산 ====="); // 아스키코드의 계산
        System.out.println('a' + 1); // 아스키코드 a == 97
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("===== 문자와 실수의 계산 ====="); //실수의 값으로 결과가 나옴
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 1.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        System.out.println("===== 문자열과 문자열의 연산 ====="); //문자열끼리의 계산 할 때는 +제외하고는 다 에러가남
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");


        System.out.println("===== 문자열과 다른 형태의 값 연산 ======");
        System.out.println("helloworld" + 123); //문자열과의 정수 연산
        System.out.println("helloworld" + 123.456); //문자열과 실수의 연산
        System.out.println("helloworld" + 'a'); //문자열과 문자의 연산
        System.out.println("helloworld" + true); //문자열과 논리값은 연산

        System.out.println("===== 문자열 형태의 숫자 값 연산 ======");//논리연산자 끼리의 연산은 불가능
        /* System.out.println(true + false);
        System.out.println(true - false);
        System.out.println(true * false);
        System.out.println(true / false);
        System.out.println(true % false); */

        System.out.println("===== 문자열 형태의 숫자 '+' 연산 ======"); // 문자열끼리 더했을 때 이어붙여서 나옴
        System.out.println("123" + "456");


        /* 논리값과 정수의 연산은 불가능 에러
        System.out.println(true + 1);
        System.out.println(true - 1);
        System.out.println(true * 1);
        System.out.println(true / 2);
        System.out.println(true % 2); */

        /* 논리값과 실수의 연산은 불가능 에러
        System.out.println(true + 1.0);
        System.out.println(true - 1.0);
        System.out.println(true * 1.0);
        System.out.println(true / 2.0);
        System.out.println(true % 2.0); */

        /* 논리값과 문자열의 연산은 불가능 에러
        System.out.println(true + 'a');
        System.out.println(true - 'a');
        System.out.println(true * 'a');
        System.out.println(true / 'a');
        System.out.println(true % 'a'); */

        System.out.println("===== 논리와 문자열의 연산 =====");
        System.out.println(true + "a"); //이어 붙여서 결과가 실행됨
        /* System.out.println(true - "a");
        System.out.println(true * "a");
        System.out.println(true / "a");
        System.out.println(true % "a"); */




















    }
}
