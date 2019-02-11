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
		ArrayList<Integer> grades1=new ArrayList<Integer>();
		grades1.add(0);
		grades1.add(25);
		grades1.add(50);
		grades1.add(75);
		grades1.add(100);
		System.out.println(grades1);
		for(int i=0;i<grades1.size();i++) {
			System.out.println(grades1.get(i));
		}
		for(Integer grade:grades1) {
			System.out.println(grade);
		}
	}
}
