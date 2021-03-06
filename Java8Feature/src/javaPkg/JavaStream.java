package javaPkg;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStream {

	public static void main(String[] args) {
		
		///To get the sum of array by using Stream
		List<Integer> ls = Arrays.asList(1,2,3,4,5);
		Optional<Integer> sum_of_List=ls.stream().reduce((x,y)->x+y);
		System.out.println("the sum of array is ="+sum_of_List);
		
		///To get the Average  of array by using Stream
				List<Integer> ls01 = Arrays.asList(1,2,3,4,5);
				Double avg= ls01.stream().mapToInt(e->e).average().getAsDouble();
				System.out.println("the Average of array is ="+avg);
				
		///To get the Even no from array by using Stream
		List<Integer> ls02 = Arrays.asList(1,2,3,4,5);
		List<Integer> even=ls02.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("the Even no from array is ="+even);		
		
		///To get the Odd no from array by using Stream
				List<Integer> ls03 = Arrays.asList(1,2,3,4,5);
				List<Integer> Odd=ls03.stream().filter(e->e%2!=0).collect(Collectors.toList());
				System.out.println("the Odd no from array is ="+Odd);	
		//To Filter out the String Start with the AA
				List<String> ls04 = Arrays.asList("AAjinkya","Anil","APawar","AApan","AAhe");
				List<String> StartWith_AA = ls04.stream().filter(e->e.startsWith("AAj")).collect(Collectors.toList());
				System.out.println("the StartWith_AA from array is ="+StartWith_AA);	
				
				///To get the Max value/no from array by using Stream
				List<Integer> ls05 = Arrays.asList(1,2,3,4,5,56565,4665564,64646);
				int Max_no=ls05.stream().max(Comparator.comparing(Integer::valueOf)).get();
				System.out.println("the Max value/no from array is ="+Max_no);	
				
				///To get the Min value/no from array by using Stream
				List<Integer> ls06 = Arrays.asList(1,2,3,4,5,0,-1);
				int Min_no=ls06.stream().min(Comparator.comparing(Integer::valueOf)).get();
				System.out.println("the Min value/no from array is ="+Min_no);	
				
				///To get the Sort Asecnding order no from array by using Stream
				List<Integer> ls07 = Arrays.asList(1,2,3,4,5,0,-1);
				List<Integer> Sorted_List=ls07.stream().sorted().collect(Collectors.toList());
				System.out.println("Sort Asecnding order from array is ="+Sorted_List);	
				///To get the Sort Desecnding order no from array by using Stream
				List<Integer> ls08 = Arrays.asList(1,2,3,4,5,0,-1);
				List<Integer> Decs_Sorted_List=ls08.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
				System.out.println("Sort Desecnding order from array is ="+Decs_Sorted_List);	
				
				
				
	}

}
