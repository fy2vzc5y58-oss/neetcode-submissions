class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return 0;
        }

        int result = 0;

        Stack<Integer> values = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int num2 = values.pop();
                int num1 = values.pop();

                switch (s) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    case "*":
                        result = num1 * num2;
                }

                values.push(result);

            } else {
                int num = Integer.parseInt(s);
                values.push(num);
            }
        }

        return values.pop();
    }
}
