
public class Main {
	
	final static String PROP_NAME = "arquivo.teste";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = System.getProperty(PROP_NAME);
		System.out.println(PROP_NAME + " : " + s);
	}

}
