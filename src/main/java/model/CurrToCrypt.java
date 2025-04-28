package model;

import java.text.DecimalFormat;

public class CurrToCrypt {
    private GetCryptoValue cryptoValue = new GetCryptoValue();

    public Double ConverterBRLxETH(Double value) {
        return ConverterAbstract(value, "ethereum");
    }

    public Double ConverterBRLxUSDt(Double value) {
        return ConverterAbstract(value, "tether");
    }

    public Double ConverterBRLxBNB(Double value) {
        return ConverterAbstract(value, "binancecoin");
    }

    public Double ConverterBRLxSOL(Double value) {
        return ConverterAbstract(value, "solana");
    }

    public Double ConverterBRLxBTC(Double value) {
        return ConverterAbstract(value, "bitcoin");
    }

    public Double ConverterAbstract(Double value, String toCode) {
        double result = value / cryptoValue.GetValue(toCode);
        DecimalFormat df = new DecimalFormat("#.#######");
        String formattedResult = df.format(result);
        formattedResult = formattedResult.replace(",", ".");
        return Double.parseDouble(formattedResult);
    }
}
