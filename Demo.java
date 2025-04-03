public class Demo {
	public static void main(String[] args) {
		String s1 = "Hello", s2 = "World!";
		System.out.println(s1.charAt(0));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.codePointBefore(1));
		System.out.println(s1.codePointCount(2, 4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s1.contentEquals(s2));
		//System.out.println(copyValueOf(char[] data));
		//System.out.println(copyValueOf(char[] data, int offset, int count));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.format(s2));
		System.out.println(s1.getBytes());
		//System.out.println(s1.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin));
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.intern());
		System.out.println(s1.isEmpty());
		System.out.println(s1.join(" ", s1, s2));
		System.out.println(s1.lastIndexOf("l"));
		System.out.println(s1.length());
		//System.out.println(s1.matches(String regex));
		System.out.println(s1.offsetByCodePoints(0, 1));
		System.out.println(s1.replace('l', 'w'));
		System.out.println(s1.replaceAll("w", "l"));
		System.out.println(s1.replaceFirst("l", "w"));
		//System.out.println(s1.split());
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.subSequence(2, 4));
		System.out.println(s1.substring(3));
		System.out.println(s1.toCharArray());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toString());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.valueOf(3));
	}
}