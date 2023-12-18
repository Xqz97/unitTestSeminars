package seminar1.task7;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);
        checkingHero(emmett);
    }

    public static void checkingHero(Hero hero) {
        // Проверка имени героя
        assert hero.getName().equals("Emmett") : "Имя героя должно быть 'Emmett'";

        // Проверка прочности брони героя
        assert hero.getArmorStrength() == 50 : "Прочность брони героя должна быть равна 50";

        // Проверка типа оружия героя
        assert hero.getWeapon().equals("sword") : "Оружие героя должно быть типа 'sword'";

        // Проверка содержимого инвентаря героя
        List<String> expectedInventory = Arrays.asList("Bow", "Axe", "Gold");
        List<String> actualInventory = hero.getBag();

        assert expectedInventory.size() == actualInventory.size() : "Размер инвентаря героя должен быть равен 3";

        for (String item : expectedInventory) {
            assert actualInventory.contains(item) : "Инвентарь героя должен содержать предмет '" + item + "'";
        }

        // Проверка, что герой является человеком
        assert hero.isHuman() : "Герой должен быть человеком";

        // Все проверки успешно пройдены
        System.out.println("Все проверки успешно пройдены!");
    }

}

