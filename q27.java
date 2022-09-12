package paperQuestion_2019;

public class q27 {

    public static void main(String[] args) {
        String[][] arrayNinja = {{"Ino", "mind switching"}, {"Naruto", "shadow clone"}, {"Kakashi", "copy eye"}};
        ninja[] arr = new ninja[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = new ninja();
            arr[i].setData(arrayNinja[i][0],arrayNinja[i][1]);
        }

        for(int i = 0; i < arrayNinja.length; i++){arr[i].printArrayValues(i+1);}
    }
}

class ninja{
    String name;
    String technique;

    public void setData(String name, String technique) {
        this.name = name;
        this.technique = technique;
    }

    public void printArrayValues(int count){
        System.out.println("Ninja " + count + "\nName: " + name + "\ntechnique: " + technique);
    }

}
