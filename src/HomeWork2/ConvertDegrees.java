package HomeWork2;

public class ConvertDegrees {
    public static void main(String[] args) {

        //формула переводу з Цельсія в Фаренгейти: Fahrenheit = 5/9 * С + 32
        double a = 33.5;
        int d = 32;
        double c;
        double b = 1.8;
        //визначили змінні та їх значення відповідно до формули
        c = b * a + d;
        //сама формула
        System.out.println("33.5 градуси по Цельсію відповідають такому значенню в Фаренгейтах: "+ c);
        //виводимо результат

        //формула переводу з Цельсія в Кальвіни: Kelvin = C + 273.16
        double e = 273.15;
        double j;
        //визначили змінні та їх значення відповідно до формули. Градуси по Цельсію визначили в "а" вище.
        j = a + e;
        //сама формула
        System.out.println("33.5 градуси по Цельсію відповідають такому значенню в Кельвінах: "+ j);
        //виводимо результат
    }
}
