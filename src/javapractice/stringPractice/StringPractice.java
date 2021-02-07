package javapractice.stringPractice;

public class StringPractice {
	//new String
	void practice01() {
		String s = new String("Hello");
		System.out.println(s);
	}
	
	//new String(char[] ch)
	void practice02() {
		char[] c = {'H', 'e', 'l', 'l', 'o','!'};
		String s = new String(c);
		
		System.out.println(s);
	}
	
	//new String(new StringBuffer(""))
	void practice03() {
		StringBuffer sb = new StringBuffer("Hi");
		String s = new String(sb);
		
		System.out.println(s);
	}
	
	//compareTo()
	void practice04() {
		int i1 = "aaa".compareTo("aaa");
		int i2 = "bbb".compareTo("aaa"); // 사전순으로 더 나중에 나오면 1
		int i3 = "aaa".compareTo("ccc"); //         더 이전에 나오면 음수
		
		System.out.println(i1 + " " + i2 + " " + i3 );
	}
	
	//concat()
	void practice05() {
		String s = "Hello";
		String s2 = s.concat(" World");
		System.out.println(s2);
	}
	
	//contains()
	void practice06() {
		String s = "abcdefg";
		boolean b = s.contains("Bc");
		System.out.println(b);
	}
	
	//endsWith(), startsWith()
	void practice07() {
		String file = "Hello.txt";
		boolean b = file.endsWith(".txt");
		System.out.println(b);
	
		boolean c = file.startsWith("Hello.t");
		System.out.println(c);
		
	}
	
	//equalsIgnoreCase()
	void practice08() {
		String s = "Hello";
		boolean b = s.equalsIgnoreCase("Hello");
		boolean c = s.equalsIgnoreCase("hello");
		
		System.out.println(b + " " + c);
	}
	
	//indexOf()
	void practice09() {
		String s = "Hello";
		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('c');
		
		int idx3 = s.indexOf('o', 3);
		int idx4 = s.indexOf('e', 1);
		
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);
		
		int idx5 = s.indexOf("l");
		System.out.println(idx5);
	}
	
	//intern()
	void practice10() {
		String s = new String("abc");
		String s2 = new String("abc");
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		boolean b = (s == s2);
		boolean b2 = s.equals(s2);
		boolean b3 = (s.intern() == s2.intern());
		
		System.out.println(b + " " + b2 + " " + b3);
	}
	
	//lastIndexOf()
	void practice11() {
		String s = "java.lang.java";
		int idx1 = s.lastIndexOf('.');
		int idx2 = s.indexOf('.');
		int idx3 = s.lastIndexOf("java");
		int idx4 = s.indexOf("java");
		System.out.println(idx1 + " " + idx2 + " " + idx3 + " " + idx4);
	}

	//replace, replaceAll, replaceFirst
	void practice12() {
		String s = "Hello";
		String s2 = s.replace("ll", "LL");
		System.out.println(s2);
		String s3 = "AABBAABB";
		String s4 = s3.replace("AA", "aa");
		System.out.println(s4);
		String s5 = s3.replaceAll("BB", "bb");
		System.out.println(s5);
		String s6 = s3.replaceFirst("AA", "aa");
		System.out.println(s6);
	}
	
	//split()
	void practice13() {
		String animals = "dog,cat,bear";
		String[] starr = animals.split(",");
		String[] starr2 = animals.split(",", 2);
		
		for(int i = 0; i < starr.length; i++) {
			System.out.println(starr[i]);
		}
		
		for(int i = 0; i < starr2.length; i++) {
			System.out.println(starr2[i]);
		}
	}
	
	//substring()
	void practice14() {
		String s = "java.lang.Object";
		String s1 = s.substring(10); //Object
		String s2 = s.substring(5, 9); //lang
		System.out.println(s1);
		System.out.println(s2);
	}
	//trim()
	void practice15() {
		String s = "Hello";
		String s1 = s.toString();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		String s2 = "   Hello World    ";
		String s3 = s.trim();
		System.out.println(s3);
	}
	
	//valueOf
	void practice16() {
		String b = String.valueOf(true);
		String c = String.valueOf('a');
		String i = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		
		String Date = String.valueOf(new java.util.Date());
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(Date);
	}
	
	//StringBuffer()
	void practice17() {
		StringBuffer sb = new StringBuffer();  //sb = ""
		StringBuffer sb2 = new StringBuffer(10); //sb2 = ""  숫자크기 길이의 문자열 담을 수 있 
		StringBuffer sb3 = new StringBuffer("Hi"); //sb3 = "Hi"
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb3);
		
		sb3.append(true).append('c').append("AB").append(10).append(1);
		System.out.println(sb3);
	
	}
	
	//capacity(), charAt()
	void practice18() {
		StringBuffer sb = new StringBuffer(100);
		sb.append("abcd");
		int bufferSize = sb.capacity();
		int stringSize = sb.length();
		System.out.println(bufferSize);
		System.out.println(stringSize);
		System.out.println(sb.charAt(1));
	}
	
	//delete(), deleteCharAt()
	void practice19() {
		StringBuffer sb = new StringBuffer("0123456");
		StringBuffer sb2 = sb.delete(3, 6);
		System.out.println(sb2);
		System.out.println(sb.deleteCharAt(1));
	}
	
	//replace(), reverse()
	void practice20() {
		StringBuffer sb = new StringBuffer("0123456");
		System.out.println(sb.replace(3, 6, "AB"));
		System.out.println(sb.reverse());
	}
	
	//setCharAt()
	void practice21() {
		StringBuffer sb = new StringBuffer("0123456");
		sb.setCharAt(0, 'o');
		System.out.println(sb);
		
		sb.setLength(4);
		System.out.println(sb);
	}
	
	//insert()
	void practice22() {
		StringBuffer sb = new StringBuffer("0123456");
		System.out.println(sb.insert(4, 'a'));
		System.out.println(sb.insert(4, '.'));
		
	}
}
