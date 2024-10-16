package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        int result = calculator.calculate(input);
        System.out.println("결과 : " + result);
    }
}

class StringCalculator {
    public int calculate(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        // 쉼표(,) 또는 콜론(:)을 구분자로 분리
        String[] numbers = input.split("[,:]");

        int sum = 0;
        for(String number : numbers) {
            sum += Integer.parseInt(number.trim()); // 공백 제거 후 정수 변환 및 더하기
        }

        return sum;
    }
}