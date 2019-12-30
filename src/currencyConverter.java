public class currencyConverter {
    double[] exchangeRates;

    void setExchangeRates(double[] rates) {
        exchangeRates = rates;
    }

    void updateExchangeRates(int arrayIndex, double newVal) {
        exchangeRates[arrayIndex] = newVal;
    }

    double getExchangeRates(int arrayIndex) {
        return exchangeRates[arrayIndex];
    }

    double computeTransferRate(int arrayIndex, double amount) {
        return amount * getExchangeRates(arrayIndex);
    }

    void printCurrencies(){
        System.out.println("rupee "+exchangeRates[0]);
        System.out.println("dirham "+exchangeRates[1]);
        System.out.println("real "+exchangeRates[2]);
        System.out.println("chilean_peso "+exchangeRates[3]);
        System.out.println("mexican_peso "+exchangeRates[4]);
        System.out.println("_yen "+exchangeRates[5]);
        System.out.println("$australian "+exchangeRates[exchangeRates.length-1]);

    }

    public static void main (String [] args){
        currencyConverter cc = new currencyConverter();
        //Jan 1st
        double[] rates = {63.0,3.0,3.0,595.0,18.0,107.0,2.0};
        cc.setExchangeRates(rates);
        cc.printCurrencies();

        rates = new double[]{65.0,5.0,3.0,595.0,18.0,107.0,2.0};
        cc.setExchangeRates(rates);
        cc.printCurrencies();
        cc.updateExchangeRates(0,66.0
        );
        cc.printCurrencies();
        double amount = cc.computeTransferRate(0, 1000);
        System.out.println("\nTransferred amount: " + amount);
    }
}
