class CoffeeHandler {
    private final Coffee[] coffeeTypes;

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
}