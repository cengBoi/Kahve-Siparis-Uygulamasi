import java.util.Arrays;

class Coffee {
    private final String type;
    private final String[] ingredients;
    private final int price;
    private final String details;

    public Coffee(String type, String[] ingredients, int price) {
        this.type = type;
        this.ingredients = ingredients;
        this.price = price;
        String[] copyIngredients = ingredients.clone();
        int arrayLen = copyIngredients.length;
        for (int i = 0; i < arrayLen; i++) {
            copyIngredients[i] = String.join(" doz ", copyIngredients[i].split("x")).toLowerCase();
        }
        this.details = arrayLen > 1 ? String.join(", ", Arrays.copyOf(copyIngredients, arrayLen - 1)) + " ve " + copyIngredients[arrayLen - 1] : copyIngredients[0];
    }

    public void displayCoffeeDetails() {
        System.out.println("\n%s seçtiniz. Bu içeceğimiz %s içermektedir.".formatted(type, details));
    }

    public String getType() {
        return this.type;
    }

    public int getPrice() {
        return this.price;
    }
}
