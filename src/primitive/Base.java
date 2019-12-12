package primitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.Stack;

public class Base {

	public static void main(String[] args) {
		Base obj = new Base();
		Reader reader = new Reader();
		int base,num;
		while(true) {
			base = reader.nextInt();
			num = reader.nextInt();
			String rep = obj.getBaseNRepresentation(num, base);
			System.out.print(rep+" ");
			if(num == obj.getDecimalRepresentation(rep, base)) {
				System.out.println("Verified");
			}
			
		}
		
	}

	public String getBaseNRepresentation(int n, int base) {
		Stack<String> stack = new Stack<>();
		StringBuilder result = new StringBuilder();
		int remainder = n;
		while (n >= base) {
			remainder = n % base;
			if (remainder > 9) {
				int value = remainder - 10;
				char newValue = (char) ('A' + value);
				stack.push(Character.toString(newValue));
			} else
				stack.push(String.valueOf(remainder));
			
			n = n / base;
		}
		if (n > 9) {
			int value = n - 10;
			char newValue = (char) ('A' + value);
			stack.push(Character.toString(newValue));
		} else
			stack.push(String.valueOf(n));

		while (!stack.isEmpty())
			result.append(stack.pop());
		return result.toString();
	}

	public int getDecimalRepresentation(String number, int base) {
		int result = 0;
		char[] ch = number.toCharArray();
		int len = ch.length;
		int value;
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(ch[i]))
				value = Integer.parseInt(String.valueOf(ch[i]));
			else
				value = 10+Integer.parseInt(String.valueOf(ch[i]-'A'));
			result += value * (Math.pow(base, len - i - 1));
		}
		return result;
	}
	
    private static class Reader {
        BufferedReader bufferedReader;
        LinkedList<String> inputToken;
        String line;
        boolean partial = false;
        public Reader() {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(System.in,"utf-8"));
                inputToken = new LinkedList();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        private void readTokens() {
            try {
                line = bufferedReader.readLine();
                //System.out.println(line);
                for(String s :line.split("\\s")) {
                    inputToken.add(s);
                }
                partial = false;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        private String nextToken() {
            if(inputToken.size() == 0) {
                readTokens();
            }
            partial = true;
            return inputToken.remove();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }

        public String nextString() {
            return nextToken();
        }

    }

}
