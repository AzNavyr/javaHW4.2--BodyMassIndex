public class MassIndex {
    public static void main(String[] args) {
        IndexService service = new IndexService();
        Analytica service1 = new Analytica();
        Analytica1 service2 = new Analytica1();
        double height = 1.82;
        int weight = 99;
        int age = 33;
        double massIndex = service.calculate(height, weight);
        String massIndex1 = String.format("%.1f.", massIndex);
        String analysisResults = service1.indexAnalysis(massIndex);
        String analysisResults2 = service2.indexAnalysis2(massIndex);
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
