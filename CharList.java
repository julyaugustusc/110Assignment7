//-------------------------------------------------------------------------
// FILENAME:      CharList.java
// DESCRIPTION:   Understanding Char arrays and creating methods thereof.
// AUTHOR:        Augustus Crosby
// FOR:           CSE 110 Assignment 7
// Time Spent:	  2 hours
//-------------------------------------------------------------------------
//1.
//a) not valid, char[] charArray = new char[26];
//b) not valid, int[] words = new int[10];
//c) not valid, char[] charArray = {'C', 'o', 'm', 'p', 'u', 't', 'e', 'r', ' ', 'S', 'c', 'i', 'e', 'n', 'c', 'e'};
//d) valid
//2. 2
//   3
//   4
//   5
//   6
//   7
//   8
//   9
//   10
//   11
//3. public static String concatenation(String[] words, int elements){
//		String finalString = "";
//		for(int i = 0; i < elements; i++)
//			finalString = finalString + words[i];
//		}
import java.util.Random;

public class CharList {
	private char[] array1 = null;
	private int numberOfChar = 0;
	
	public CharList (int size) {
		array1 = new char[size];
		numberOfChar = size;
	}
	
	public void randomize() {
		Random r = new Random();
		for(int i = 0; i < array1.length; i++)
			array1[i] = (char)(r.nextInt(25) + 'a');
	}
	
	public void addChar (char newChar, int index) {
		
		if(array1.length == numberOfChar) 
			this.increaseSize();
		for(int j = array1.length-1; j > index; j--)
			array1[j] = array1[j-1];
		array1[index] = newChar;
		numberOfChar++;
	}
	
	private void increaseSize() {
		char[] array2 = new char[array1.length*2];
		for(int i = 0; i < array1.length; i++) 
			array2[i] = array1[i];
		array1 = array2;
	}
	
	public void removeFirst (char charToRemove) {
		int x = array1.length;
		for(int i = 0; i <= x; i++)
			if(array1[i] == charToRemove) {
				x = i;
				for(int j = i; j < array1.length-1; j++) {
					array1[j] = array1[j+1];
				}
				array1[array1.length-1] = 0;
			}
		numberOfChar--;
	}
	
	public int[] countLetters() {
		int[] count = new int[26];
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] == 'a')
				count[0]++;
			if(array1[i] == 'b')
				count[1]++;
			if(array1[i] == 'c')
				count[2]++;
			if(array1[i] == 'd')
				count[3]++;
			if(array1[i] == 'e')
				count[4]++;
			if(array1[i] == 'f')
				count[5]++;
			if(array1[i] == 'g')
				count[6]++;
			if(array1[i] == 'h')
				count[7]++;
			if(array1[i] == 'i')
				count[8]++;
			if(array1[i] == 'j')
				count[9]++;
			if(array1[i] == 'k')
				count[10]++;
			if(array1[i] == 'l')
				count[11]++;
			if(array1[i] == 'm')
				count[12]++;
			if(array1[i] == 'n')
				count[13]++;
			if(array1[i] == 'o')
				count[14]++;
			if(array1[i] == 'p')
				count[15]++;
			if(array1[i] == 'q')
				count[16]++;
			if(array1[i] == 'r')
				count[17]++;
			if(array1[i] == 's')
				count[18]++;
			if(array1[i] == 't')
				count[19]++;
			if(array1[i] == 'u')
				count[20]++;
			if(array1[i] == 'v')
				count[21]++;
			if(array1[i] == 'w')
				count[22]++;
			if(array1[i] == 'x')
				count[23]++;
			if(array1[i] == 'y')
				count[24]++;
			if(array1[i] == 'z')
				count[25]++;
			//I know there is probably a better way of doing this, but I've spend a little too long trying to 
			//come up with something, so I'm just going to let this be.
		}
		return count;
	}
	
	public String toString() {
		String finalString = "";
		for(int i = 0; i < array1.length; i++)
			finalString = finalString + " " + array1[i];
		return finalString;
		
	}
	
	
}	
