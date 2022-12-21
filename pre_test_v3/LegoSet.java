package pre_test_v3;

public class LegoSet {
    public static void main(String[] args){
        Lego jungle = new Lego(10,6,30);
        Lego car = new Lego(12,5,22);

        if((jungle.brick + jungle.cube + jungle.cylinder) > (car.brick + car.cylinder + car.cube)){
            System.out.println("Jungle set has more pieces compared to Car set.");
            message(jungle.brick + jungle.cube + jungle.cylinder);
        }else{
            System.out.println("Car set has more pieces compared to Jungle set.");
            message(car.brick + car.cylinder + car.cube);
        }

    }

    static void message(int sum){
        System.out.println("This lego set has " + sum);
    }
}

class Lego{
    int brick,cylinder,cube;

    Lego(int brick,int cylinder, int cube){
        this.brick = brick;
        this.cylinder = cylinder;
        this.cube = cylinder;
    }
}
