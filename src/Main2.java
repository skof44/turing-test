import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько раз в неделю студент выпивает жидкость: ");
        int amountPerWeek = in.nextInt();
        System.out.print("Сколько литров жидкости студент выпивает за раз: ");
        int countPerTime = in.nextInt();
        if (amountPerWeek < 1 || countPerTime < 1){
            System.out.println("Введены некорректные данные");
        }
        else{
            int summ = countPerTime*amountPerWeek;
            for (int i = 1 ;i <= 16; i++){
                System.out.println("К " + i + " неделе будет выпито " + summ + " литров жидкости");
                summ += countPerTime*amountPerWeek;
            }
            if (summ < 120){
                System.out.println("К сожалению, студент не принят в клуб");
            }
            else{
                System.out.println("Студент принят в IT-клуб");
            }
        }
    }
}
