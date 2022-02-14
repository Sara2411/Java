public class PhraseOMatic {

	public static void main(String[] args) {
		final String[]l1 = {"salve", "ciao","hello", "buongiorno", "scialla"};
		final String[]l2 = {"egregio", "eclettico","intelligentissimo,astutissimo"};
		final String[]l3 = {"studente","ragazzo","giovane","scapestrato","fannullone","studioso"};
	
	String s1= l1[(int)(Math.random()*l1.length)];
	String s2= l2[(int)(Math.random()*l2.length)];
	String s3= l3[(int)(Math.random()*l3.length)];
	
	System.out.println(s1+" "+s2+" "+s3);
	}

}
