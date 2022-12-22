package test_20212022;

class Speed{
	public static void main(String[] args){
		Car sedan = new Car(85);
		Car mpv = new Car(110);

		if(sedan.speed > mpv.speed){
			System.out.println("Sedan is " + (sedan.speed- mpv.speed) + " mph faster than Mpv");
			checkSpeed(sedan.speed);
		}else{
			System.out.println("Mpv is " + (mpv.speed-sedan.speed) + " mph faster than Sedan");
			checkSpeed(mpv.speed);
		}
	}

	static void checkSpeed(int current_speed){
		if(current_speed > 110){System.out.println("The car over speed limit");}
	}
}