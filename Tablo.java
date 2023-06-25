package Homework;
import java.util.Random;

public class Tablo {

    public static void main(String[] args) {
            int workSeconds = 28800; // Максимальное количество секунд в рабочем дне (8 часов)
            int secondsLeft = getRandomSeconds(workSeconds); // Получаем случайное количество оставшихся секунд

            System.out.println("Осталось секунд: " + secondsLeft);
            System.out.println(hoursLeft(secondsLeft));
        }

        public static int getRandomSeconds(int workSeconds) {
            Random random = new Random();
            return random.nextInt(workSeconds + 1);
        }

        public static String hoursLeft(int seconds) {
            int hoursLeft = seconds / 3600; // Количество полных часов осталось до конца рабочего дня

            if (hoursLeft > 1) {
                return "Осталось " + hoursLeft + " часов.";
            } else if (hoursLeft == 1) {
                return "Остался 1 час.";
            } else {
                return "Осталось менее часа.";
            }
        }
}

