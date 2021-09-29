public class IndexAnalysis {
    public String indexAnalysis(double index) {
        String analysis;
        if (index < 20.0) {
            analysis = "Дефицит массы тела";
        } else if (index >= 20.1 && index < 25.9) {
            analysis = "Нормальный вес тела";
        } else if (index >= 26.0 && index < 27.9) {
            analysis = "Избыток массы тела";
        } else if (index >= 28.0 && index < 30.9) {
            analysis = "Ожирение 1-ой степени";
        } else if (index >= 31.0 && index < 35.9) {
            analysis = "Ожирение 2-ой степени";
        } else if (index >= 36.0 && index < 40.9) {
            analysis = "Ожирение 3-ей степени";
        } else {
            analysis = "Ожирение 4-ой степени";
        }
        return analysis;
    }
}
