import java.util.Random;

public class Homework17Program {
    private static final String[] BANK_NAMES = new String[] {"ПРИВАТБАНК", "Сенс Банк", "Сітібанк", "ІНГ Банк Україна", "Ощадбанк", "Укрексімбанк", "УКРГАЗБАНК", "Райффайзен Банк", "УКРСИББАНК", "ПУМБ", "КРЕДІ АГРІКОЛЬ БАНК", "Південний", "КРЕДОБАНК", "Банк Кредит Дніпро"};
    public static void main(String[] args) {
        Bank[] bankList = new Bank[BANK_NAMES.length];
        initializeBankArray(bankList);
        findBestOffer(bankList);
        displayBanks(bankList);
    }

    public static void initializeBankArray(Bank[] bankList) {
        Random random = new Random();
        for (int index = 0; index < BANK_NAMES.length; index++) {
            bankList[index] = new Bank(BANK_NAMES[index], random.nextInt(6) + 37);
        }
    }

    public static void findBestOffer(Bank[] bankList) {
        Bank bestOffer = bankList[0];
        for (Bank bank : bankList) {
            if (bank.price > bestOffer.price) {
                bestOffer = bank;
            }
        }
        System.out.println("Best price: " + bestOffer.toString());
    }

    public static void displayBanks(Bank[] bankList) {
        System.out.println("List of banks:");
        for (Bank bank : bankList) {
            System.out.println(bank.toString());
        }
    }
}
