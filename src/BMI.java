public class BMI {
    public static void main(String[] args) {
        double height = 169;
        double weight = 90;
        double index = weight / (height * height / 10000);
        System.out.print("Ваш индекс массы тела составляет ");
        double scale = Math.pow(10, 2);
        double result = Math.ceil(index * scale) / scale;
        System.out.print((result));
        System.out.println(" кг/м2");
    }
}
