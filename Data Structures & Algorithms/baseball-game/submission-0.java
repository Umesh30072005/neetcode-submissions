

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for (String str : operations) {

            if (str.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();

                int c = a + b;

                stack.push(b); // restore
                stack.push(a); // restore
                stack.push(c);

            } else if (str.equals("C")) {

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else if (str.equals("D")) {

                int a = stack.peek(); // double the previous score
                stack.push(2 * a);

            } else {

                stack.push(Integer.parseInt(str));
            }
        }

        for (int num : stack) {
            ans += num;
        }

        return ans;
    }
}