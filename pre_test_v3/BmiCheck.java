package pre_test_v3;

public class BmiCheck {
    public static void main(String[] args){
        Bmi brian = new Bmi(1.53,45.2);

        double formula_bmi = brian.weight/Math.pow(brian.height,2);

        if(formula_bmi < 18.5){
            System.out.println("Brian is at underweight");
        }else if(formula_bmi < 25){
            System.out.println("Brian is at normal weight");
        }else{
            System.out.println("Brian is at overweight");
        }
    }
}

class Bmi{
    double height,weight;

    Bmi(double h, double w){
        this.height = h;
        this.weight = w;
    }
}