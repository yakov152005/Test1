public class Answers {
	public static void main(String[] args) {
		one();
		two();
		three1();
		three2();
		four();
		five();
		six();
	}
	//--------------------------------------------------------------------
	//question 1
	public static void one() {
		int[] array = {52, 87, 1, 83, 76, 12, 76, 12, 98, 12, 6, 54};
		int number = 50;
		int[] result = arrayStats(array, number);
		printIntArr(result);
	}
	public static int[] arrayStats(int[] array, int number) {
		int countSmall = 0;
		int countEquals = 0;
		int countMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < number) {
				countSmall++;
			} else if (array[i] > number) {
				countMax++;
			} else {
				countEquals++;
			}
		}
		int[] newArr = new int[3];
		newArr[0] = countSmall;
		newArr[1] = countEquals;
		newArr[2] = countMax;

		return newArr;
	}
	public static void printIntArr(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print("]");
	}
	//--------------------------------------------------------------------
	//question 2
	public static void two() {
		String[] original = {"Check", "For", "To", "remove"};
		char toRemove = 'o';
		String[] newArr = cleanUp(original, toRemove);
		printStrArr(newArr);
	}
	public static String[] cleanUp(String[] original, char toRemove) {
		int counter = 0;
		for (int i = 0; i < original.length; i++) {
			if (original[i].contains(toRemove + "")) {
				counter++;
			}
		}
		String[] newArr = new String[original.length - counter];
		int index = 0;
		for (int i = 0; i < original.length; i++) {
			if (!original[i].contains(toRemove + "")) {
				newArr[index] = original[i];
				index++;
			}
		}
		return newArr;
	}
	public static void printStrArr(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	//--------------------------------------------------------------------
	//question 3(A)
	public static void three1() {
		int number1 = 12;
		int number2 = 18;
		int result = gcd(number1, number2);
		System.out.println(result);
	}
	public static int gcd(int number1, int number2) {
		int highestDiv = 1;
		int min = number1;
		if (min > number2) {
			min = number2;
		}
		for (int i = 1; i <= min; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				if (highestDiv < i) {
					highestDiv = i;
				}
			}
		}
		return highestDiv;
	}
	//--------------------------------------------------------------------
	//question 3(B)
	public static void three2() {
		int number1 = 18;
		int number2 = 12;
		int[] option = {0, 6, 12, 9};
		int result = highestDivisor(number1, number2, option);
		System.out.println(result);
	}
	public static int highestDivisor(int number1, int number2, int[] option) {
		int highestDiv = 1;
		for (int i = 0; i < option.length; i++) {
			if (option[i] == 0) {
				continue;
			}
			if (number1 % option[i] == 0 && number2 % option[i] == 0) {
				if (highestDiv < option[i]) {
					highestDiv = option[i];
				}
			}
		}
		return highestDiv;
	}
	//--------------------------------------------------------------------
	//question 4
	public static void four() {
		int[] array = {1, 2, 5};
		int result = linearMagic(array);
		System.out.println(result);
	}
	public static int linearMagic(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {//O(n)
			result += array[i] * array[i];
		}
		return result;
	}
//--------------------------------------------------------------------
	//question 5
	public static void five(){
		int number = 18;
		printFactorized(number);
	}
	public static void printFactorized(int number){
		int result ;
		for (int i = 2; i < number; i++) {
			if (number % i == 0){
				result = number/i;
				if (result < i ){
					break;
				}
				System.out.println(result +"*" +i);
			}
		}
	}
	//--------------------------------------------------------------------
	//question 6
	public static void six(){
		int source = 12345;
		int target = 23145;
		System.out.println(isPermutation(source,target));
	}
	public static boolean isPermutation(int source, int target) {
		String source2 = String.valueOf(source);
		String target2 = String.valueOf(target);
		boolean res = false;
		if (source2.length() == target2.length()) {
			for (int i = 0; i <source2.length(); i++) {
				target2 = target2.replaceFirst(source2.charAt(i)+"","");
			}
			if (target2.isEmpty()){
				res = true;
			}
		}
		return res;
	}
}

