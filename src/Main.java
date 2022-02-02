public class Main {
    public static void main(String[] args) {
        int start = 100;  // Начальный баланс
        int contributed = 1200; // Внесено на баланс
        int balance1 = start + contributed; // Баланс без бонусных рублей
        int balance2 = contributed / 100 + balance1; // Баланс с бонусными рублями
        if (contributed > 1000) {
            boolean balance = true;

            int balance3 = balance ? balance2 : balance1;
            System.out.println("Ваш баланс - " + balance3);
        } else {
            System.out.println("Ваш баланс - " + balance1);
        }
    }
}
// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете превысила ли
// сумма пополнения порог и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.
