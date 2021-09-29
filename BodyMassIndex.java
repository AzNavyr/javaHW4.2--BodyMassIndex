public class BodyMassIndex {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        IndexAnalysis service1 = new IndexAnalysis();
        IndexAnalysis2 service2 = new IndexAnalysis2();
        double height = 1.82;
        int weight = 85;
        int age = 25;
        double massIndex = service.calculate(height, weight);
        String massIndex1 = String.format("%.1f.", massIndex);
        String analysisResults = service2.indexAnalysis2(massIndex);
        String analysisResults2 = service1.indexAnalysis(massIndex);
        String age1 = null;
        if (age >= 18 && age < 30) {
            age1 = analysisResults;
        } else if (age >= 30) {
            age1 = analysisResults2;
        }
        System.out.format("Ваш индекс массы составил: %s", massIndex1);
        System.out.println(age1);
    }
}
