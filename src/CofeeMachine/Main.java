package CofeeMachine;

public class Main {

    public static void main(String[] args) {
        int moneyAmount = 10;

        int cappucinoPrice = 150;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        boolean isMilkEnough = true;
        boolean canBuyAnything = false;

        if (moneyAmount >= cappucinoPrice && isMilkEnough) {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }
        if (moneyAmount >= lattePrice && isMilkEnough) {
            System.out.println("Вы можете купить латте");
        }
        if (moneyAmount >= espressoPrice) {
            System.out.println("Вы можете купить еспрессо");
            canBuyAnything = true;
        }
        if (moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }
        if (canBuyAnything == false) {
            System.out.println("Недостаточно средств!");
        }

	// write your code here
    }
}
