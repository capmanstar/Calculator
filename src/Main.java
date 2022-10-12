import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        final String input = ReadInput.read();
        Queue<String> numbers;
        Queue<String> operators;

        String[] numsArr = input.split("[-+*/]");
        String[] operatorArr = input.split("[0-9]+");

        numbers = new LinkedList<>(Arrays.asList(numsArr));
        operators = new LinkedList<>(Arrays.asList(operatorArr));

        Double res = Double.parseDouble(numbers.poll());

        while(!numbers.isEmpty()){
            String op = operators.poll();
            Operate operate;
            switch (op){
                case "+":
                    operate = new Add();
                    break;
                case "-":
                    operate = new Subtract();
                    break;
                case "*":
                    operate = new Multiply();
                    break;
                case "/":
                    operate = new Divide();
                    break;
                default:
                    continue;
            }
            Double n = Double.parseDouble(numbers.poll());
            res = operate.getResult(res,n);
        }
        System.out.println(res);

    }
}
