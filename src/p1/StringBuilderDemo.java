package p1;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Deepak");	
		
		System.out.println(sb.length());
		
		System.out.println(sb.append('c'));
		
		System.out.println(sb.append('w'));
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.replace(0, 1,"c"));
		
		System.out.println(sb.append(true));
		
		System.out.println(sb.append(345.66543));
		
		System.out.println(sb.indexOf("D"));
	}
}
