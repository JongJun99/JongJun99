package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {

        System.out.println("===== 두개의 문자열 합치기 =====");
        System.out.println(9 + 9); //18
        System.out.println(9 + "9"); //99
        System.out.println("9" + 9); //99
        System.out.println("9" + "9"); //99

        System.out.println("===== 3개의 문자열 합치기 =====");
        System.out.println(9 + 9 + "9"); //189
        System.out.println(9 + "9" + 9); //999
        System.out.println("9" + 9 + 9); //999

        System.out.println("9" + (9 + 9)); //918

        System.out.println("===== 10과 20의 사칙연산 결과 =====");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("===== 10과 20의 사칙연산 결과 보기 좋게 출력=====");
        System.out.println("10과 20의 합 : " + (10 + 20)); //묶지 않으면 문자열 합치기가 일어나서 결과가 1020이 됨.
        System.out.println("10과 20의 차 " + (10 - 20)); //문자열은 마이너스 연산이 불가능하기에 앞에서 생성된 문자열과 마이너스 연산이 불가능하다.
        System.out.println("10과 20의 곱 :" + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 :" + (10 / 20));
        System.out.println("10과 20의 나머지 :" + (10 % 20));

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println(123 + 45 + "기차" + "출발" );

        int point = 100;
        System.out.println("1번 고객에게 포인트를" +point + "포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를" +point + "포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를" +point + "포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를" +point + "포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를" +point + "포인트를 지급하였습니다.");

        System.out.println("===== 변수에 ㅔ저장된 값 변경 테스트");

        int sum = 0;
        System.out.println("현재 sum의 값은?");
        sum = sum + 10;
        System.out.println("sum에 10을 추가로 더하면?" +sum);
        sum = sum +10 ;
        System.out.println("sum에 10이 있었으니 10을 추가로 더하면?" + sum);

        int count = 0;
        count = count +1;
        System.out.println("count에 1을 더하면 현재 count의 값은?" + count);











    }
}
