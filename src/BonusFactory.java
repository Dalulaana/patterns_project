public class BonusFactory {
    public IBonus createBonus(String bonusType) {
        if ("Скидочка".equalsIgnoreCase(bonusType)) {
            return new Discount();
        }
        else if ("Промокод".equalsIgnoreCase(bonusType)) {
            return new Promocode();
        }
        else if ("Сертификат".equalsIgnoreCase(bonusType)) {
            return new Certificate();
        }
        else {
            System.out.println("Лох ты ничего не получил.");
        }

        return null;
    }
}
