
public class Countytest {
public static void main(String[] args) {
		
		County County1 = new County("Dekalb", 2000000, 1973,7823100);
		System.out.println(County1.CountyName);
		System.out.println(County1.CountyPopulation);	
		System.out.println(County1.CountyYearEstablished);			
		System.out.println(County1.CountyLandVolume);			
			
		County County2 = new County("Fulton", 3500000, 1959,5241862);
		System.out.println(County2.CountyName);
		System.out.println(County2.CountyPopulation);	
		System.out.println(County2.CountyYearEstablished);			
		System.out.println(County2.CountyLandVolume);			
			
		}
}
