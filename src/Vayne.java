public class Vayne {

    public static void main(String[] args) {
        String champName = "Vayne";
        String role = "ADC";
        int baseHealth = 447;
        int baseMana = 196;
        float baseArmor = 18.4F;
        float baseMagicResist = 28.7F;
        float baseDamage = 57.64F;
        int baseMovementSpeed = 330;

        byte level = 8;
        int healthGain = 103;
        double manaGain = 35;
        float armorGain = 4.6F;
        float magicResistGain = 1.3F;
        float damageGain = 2.36F;



        System.out.println("Champion: " + champName);
        System.out.println("Role: " + role);
        System.out.println("Stats: ");
        System.out.println("Level: " +level);
        System.out.println("Health: " + (level * healthGain + baseHealth));
        System.out.println("Mana: " + (level * manaGain + baseMana));
        System.out.println("Armor: " + (level * armorGain + baseArmor));
        System.out.println("Magic Resist: " + (level * magicResistGain + baseMagicResist));
        System.out.println("Damage: " + (level * damageGain + baseDamage));
        System.out.println("Movement Speed: " + baseMovementSpeed);



    }

}
