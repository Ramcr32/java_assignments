package _3.Q;

public class Main {
	//find prime number 
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
	
		int a=0;
		int [] arr= new int[inputArray.length];
		for(int i=0; i<inputArray.length;i++) {
			int count=0;
			for(int k=2; k<Math.ceil(Math.sqrt(inputArray[i]));k++) {
				if(inputArray[i]%k==0) {
					count++;
				}
			}
			if(count==0) {
				arr[a]=inputArray[i];
				a++;
			}
		}
		return arr;
	}
	public static void main(String[] args){
		//Create the object of Main class
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		int[] arr = {10,12,5,50,11,14,15};
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
//		message:
		// "Prime number not found in the supplied Array"
		Main m= new Main();
		int[] ans= m.findAndReturnPrimeNumbers(arr);
		for(int i=0; i<ans.length && ans[i]>0; i++) {
			System.out.println(ans[i]);
		}
	}
}
