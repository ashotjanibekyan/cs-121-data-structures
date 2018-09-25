public class AsBs {
	public static String AsBsDeconstruct(String str) {
		String temp = "";

		for(int i = 0; i < str.length()-1; i++) {
			if("AB".equals("" + str.charAt(i) + str.charAt(i+1))) {
				temp+="A";
				i++;
			} else if(i < str.length()-2 && "BBA".equals("" + str.charAt(i) + str.charAt(i+1) + str.charAt(i+2))){
				temp+="B";
				i+=2;
			} else {
				temp = str;
				break;
			}
		}
		System.out.println(str);
		if(temp.equals(str)) {
			return "";
		}
		return AsBsDeconstruct(temp);
	}

	public static String AsBsConstruct(String str, int level) {
		if(level <= 0) {
			return str;
		}
		String temp = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A') {
				temp += "AB";
			} else if(str.charAt(i) == 'B') {
				temp += "BBA";
			} else {
				temp += str.charAt(i);
			}
		}
		System.out.println(str);
		return AsBsConstruct(temp, level-1);
	}

	public static void main(String[] args) {
		System.out.println(AsBsDeconstruct("SABS"));
	}
}