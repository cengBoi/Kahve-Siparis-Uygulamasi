
import java.util.Scanner;

class CoffeeHandler {
    private final Coffee[] coffeeTypes;
    private final Scanner sc = new Scanner(System.in);

    public CoffeeHandler() {
        Coffee espresso = new Coffee("Espresso", new String[] {"1xEspresso"}, 20);
        Coffee doubleEspresso = new Coffee("Double Espresso", new String[] {"2xEspresso"}, 27);
        Coffee cappuccino = new Coffee("Cappuccino", new String[] {"1xEspresso", "2xSteamed Milk", "2xMilk Foam"}, 28);
        Coffee caffeLatte = new Coffee("Caffe Latte", new String[] {"1xEspresso", "3xSteamed Milk", "1xMilk Foam"}, 28);
        Coffee mocha = new Coffee("Mocha", new String[] {"1xEspresso", "1xSteamed Milk", "1xMilk Foam", "2xHot Chocolate"}, 32);
        Coffee americano = new Coffee("Americano", new String[] {"1xEspresso", "4xHot Water"}, 26);
        Coffee hotWater = new Coffee("Hot Water", new String[] {"5xHot Water"}, 5);

        this.coffeeTypes = new Coffee[] {espresso, doubleEspresso, cappuccino, caffeLatte, mocha, americano, hotWater};
    }

    public void initiate() {
        this.printMainStream();
    }

    private void printMainStream() {
        
        

        System.out.print("Hoş geldiniz! Fiyat listemizi görmek için Enter tuşuna basınız. Eğer sipariş kodunu zaten biliyorsanız lütfen kodu giriniz: ");
        String line = sc.nextLine();

        if (line.isEmpty()) {
            defaultSelectScreen();
        } else {
            try {
                boolean result = checkInput(Integer.parseInt(line));
                if (result) {
                    coffeeTypes[Integer.parseInt(line) - 1].displayCoffeeDetails();
                    this.startLoadingAnimation();
                } else {
                    System.out.println("Kod bulunamadı. Fiyat listesi ekrana geliyor.");
                    defaultSelectScreen();
                }
            } catch (NumberFormatException e) {
                System.out.println("Kod bulunamadı. Fiyat listesi ekrana geliyor.");
                defaultSelectScreen();
            } 
        } 

        sc.close();
    }

    private void defaultSelectScreen() {
        System.out.println();
        for (int i = 0; i < this.coffeeTypes.length; i++) {
            System.out.println("%d. %s (%d TL)".formatted(i+1, this.coffeeTypes[i].getType(), this.coffeeTypes[i].getPrice()));
        }
        System.out.print("Lütfen sipariş etmek istediğiniz kahvenin kodunu giriniz: ");
        int choice = checkInput();
        coffeeTypes[choice - 1].displayCoffeeDetails();
        this.startLoadingAnimation();
    }

    private boolean checkInput(int number) {
        return number >= 1 && number <= 7;
    }
    
    private int checkInput() {
        Boolean flag = false;
        int inputInt = -1;
        while (!flag) { 
            try {
                String nextLine = sc.nextLine();
                if (nextLine.isEmpty()) {
                    System.out.println("Lütfen 1 ile 7 arasında bir tam sayı giriniz.");
                    continue;
                }
                inputInt = Integer.parseInt(nextLine);
                if (inputInt >= 1 && inputInt <= 7) {
                    flag = true;
                } else {
                    System.out.println("Lütfen 1 ile 7 arasında bir tam sayı giriniz.");
                    //sc.next();
                }
            } catch (NumberFormatException e) {
                System.out.println("Lütfen 1 ile 7 arasında bir tam sayı giriniz.");
                //sc.next();
            }
        }

        if (inputInt == -1) {
            throw new RuntimeException("Sistemde bir arıza oluştu. Lütfen daha sonra tekrar deneyiniz.");
        }

        return inputInt;
    }

    private void startLoadingAnimation() {
        String[] animation = { "|", "/", "-", "\\" };
        
        for (int i = 0; i < 50; i++) {
            System.out.print("\rSiparişiniz hazırlanıyor " + animation[i % animation.length]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.print("\rSiparişiniz hazır! Afiyet olsun.\n");
            }
        }

        System.out.print("\rSiparişiniz hazır! Afiyet olsun.\n");
    }
}