package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public class DutchNationalFlagProblem {

	public static void main(String[] args) {
		DutchNationalFlagProblem obj=new DutchNationalFlagProblem();
		Reader reader=new Reader();
		int size;int index;
		size=reader.nextInt();index=reader.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=reader.nextInt();
		}
		
		obj.arrange(arr,index);
		
		for(int k=0;k<size;k++)
			System.out.print(arr[k]+" ");
		System.out.println();
	}

	
	public void arrange(int[] A, int i) {
		int pivot=A[i];
		int len=A.length;int temp;
		int small=0,big=len-1;
		
		for(int j=0;j<len;j++) {
			if(A[j]<pivot) {
				temp=A[j];
				A[j]=A[small];
				A[small]=temp;
				small++;
			}
		}
		
		
		for(int j=len-1;j>=0;j--) {
			if(A[j]>pivot) {
				temp=A[j];
				A[j]=A[big];
				A[big]=temp;
				big--;
			}
		}	
		
		
	}
	
	private static class Reader {
        BufferedReader bufferedReader;
        LinkedList<String> inputToken;
        String line;
        public Reader() {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(System.in,"utf-8"));
                inputToken = new LinkedList<String>();
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
        
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        private String nextToken() {
            if(inputToken.size() == 0) {
                readTokens();
            }
            return inputToken.remove();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

	}
}
