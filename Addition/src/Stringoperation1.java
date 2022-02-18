
public class Stringoperation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="yamini";
		String s1=" Yamini ";
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.equals(s1));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s.concat(s1));
		System.out.println(s.replace("yamini","keerthi"));
		System.out.println(s.indexOf('m'));
		System.out.println(s.startsWith("Hi"));
		System.out.println(s.substring(2,4));
		System.out.println(s.split(" ")[0]);
		System.out.println(s.lastIndexOf('s'));
	}

}
