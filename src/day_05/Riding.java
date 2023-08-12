package day_05;

public class Riding {

	public static void main(String[] args) {
		System.out.println(get_Driving(true,true,true,true));
	}
public static String get_Driving(boolean cycle,boolean bike,boolean car,boolean lorry) {
	if(cycle==true) {
		if(bike==true) {
			if(car==true) {
				if(lorry==true) {
					return "You are elegile for All driving ";
				}else return "Not eligible";
			}else  return "Not eligible";
		}else return "Not eligible";
	}else return "Not eligible";
}
}
