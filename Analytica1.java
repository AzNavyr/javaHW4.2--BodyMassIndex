public class Analytica1 {
    public String indexAnalysis2(double index) {
        String analysis1;
        if (index < 19.5) {
            analysis1 = "Дефицит массы тела";
        } else if (index >= 19.6 && index < 22.9) {
            analysis1 = "Нормальный вес тела";
        } else if (index >= 23.0 && index < 27.4) {
            analysis1 = "Избыток массы тела";
        } else if (index >= 27.5 && index < 29.9) {
            analysis1 = "Ожирение 1-ой степени";
        } else if (index >= 30.0 && index < 34.9) {
            analysis1 = "Ожирение 2-ой степени";
        } else if (index >= 35.0 && index < 39.9) {
            analysis1 = "Ожирение 3-ей степени";
        } else {
            analysis1 = "Ожирение 4-ой степени";
        }
        return analysis1;
    }

}
