import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int a = 3, b = 2;
        int [] Array1 = new int [a];
        int [] Array2 = new int [b];
        int [] Array3 = new int [a+b];
        // заполнение массивов
        Random rand = new Random();
        for (int i=0;i<a;i++) {
            int r = rand.nextInt(100);
            Array1[i] = r;
        }
        for (int i=0;i<b;i++) {
            int r = rand.nextInt(100);
            Array2[i] = r;
        }
        // объединение массивов
        for (int i = 0;i<a+b;i++){
            if (i<a){
                Array3[i] = Array1[i];}
            else {Array3[i] = Array2[i-a];}
        }
        // выведение массива
        System.out.println("Объединение массивов \n");
        for (int i=0;i<a+b;i++)
            System.out.println(Array3[i]+"   ");
    }
}
