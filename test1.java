package qwerty;

public class test1 {
    public static void main(String[] args) {

        // 실습문제 1  정수형 변수 2개를 선언하여,
        //각 20과 30으로 초기화 한 후,
        //두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요.
        int x1 = 20;
        int x2 = 30;

        System.out.println("더하기 결과 :" + (x1+x2));
        System.out.println("빼기 결과 :" + (x1-x2));
        System.out.println("곱하기 결과 :" + (x1*x2));
        System.out.println("나누기한 몫 :" + (x1/x2));
        System.out.println("나누기한 나머지:" + (x1%x2));

        //실습문제 2 사각형의 넓이와 둘레를 구하여 출력합니다.
        //너비 12.5 높이 36.4를 변수에 저장하고,
        //넓이와 둘레를 계산한 뒤 변수에 담아 아래와 같이 출력하세요.

        double y1 = 12.5; //너비
        double y2 = 36.4; //높이

        double z1 = y1*y2; //넓이
        double zz1 = 2 *(y1+y2); //둘레

        System.out.println("면적 :" + z1);
        System.out.println("둘레 :" + zz1);


        //실습문제 3
        //문자형 변수를 하나 선언하고 'a'를 대입한 후,
        //문자 'a'가 가지는 유니코드값을 출력하세요.

        char qwerty = 'a';

        System.out.println("문자 a의 unicode :" + (int)qwerty);




        //- 실습문제 4
        //    국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤,
        //    총점과 평균을 정수 형태로 출력하세요.
        double r = 80.5; // 국어
        double t = 50.6; // 수학
        double d = 70.8; //영어

        double total = r+t+d; //
        double average = (r+t+d)/3; // 평균값 구하기

        total = (int)total;
        average = (int)average;

        System.out.println("총점 : " + (int)total);
        System.out.println("총점 : " + (int)average);



    }
}
