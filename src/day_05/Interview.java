package day_05;

public class Interview {

	public static void main(String[] args) {
		
System.out.println(get_Interview(true,true,false,true));
	}
public static String get_Interview(boolean round1,boolean round2,boolean round3,boolean round4) {
	if(round1==true) {
		if(round2==true) {
			if(round3==true) {
				if(round4==true) {
					return "Selected for job";
				}else return "Not selected";
			}else return "Not selected";
		}else return "Not selected";
	}else return "Not selected";
}
}
