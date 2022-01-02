public class IndexService {
    public double calculate(int weight, double height) {

        double subtotal = height * height;//промежуточный итог умножения
        double index = weight / subtotal;//индекс массы тела
        return index;

    }
}
