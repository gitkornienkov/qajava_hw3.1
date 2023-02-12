public class BonusMilesService {

    public int calculate(int price) {
        int bonus;
        int constanta = 20;
        bonus = price / constanta;
        return bonus;
    }
}
