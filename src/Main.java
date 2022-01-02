public class Main {
    public static void main(String[] args) {
        IndexService service = new IndexService();
        double index1 = service.calculate(70, 1.78);
        double index2 = service.calculate(40, 1.78);
        double index3 = service.calculate(70, 1.60);
        double index4 = service.calculate(60, 1.60);
        double index5 = service.calculate(120, 1.60);

        System.out.println("Индекс массы тела 1: " + index1);
        System.out.println("Индекс массы тела 2: " + index2);
        System.out.println("Индекс массы тела 3: " + index3);
        System.out.println("Индекс массы тела 4: " + index4);
        System.out.println("Индекс массы тела 5: " + index5);
    }
}
