package arrayPractice;
import java.util.ArrayList;
public class notes {
	public static void main(String[] args) {
		int [] grades = new int [2];
		grades[0]=100;
		grades[1]=0;
		for(int i=0;i<grades.length;i++) {
			System.out.println(grades[i]);
		}
		ArrayList<String> band=new ArrayList<String>();
		band.add("Lindsey");
	  	band.add("Mick");
		band.add("Stevie");
		band.add("Dave");
		band.add("Christine");
		band.add(band.remove(2));
		band.set(0,band.get(4));

		System.out.println(band);
	}
}
