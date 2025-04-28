package model;

public class CryptToCurr {
    private GetCryptoValue cryptoValue = new GetCryptoValue();

    public Double ConverterETHxBRL(Double value) {
        return ConverterAbstract(value, "ethereum");
    }

    public Double ConverterUSDtxBRL(Double value) {
        return ConverterAbstract(value, "tether");
    }

    public Double ConverterBNBxBRL(Double value) {
        return ConverterAbstract(value, "binancecoin");
    }

    public Double ConverterSOLxBRL(Double value) {
        return ConverterAbstract(value, "solana");
    }

    public Double ConverterBTCxBRL(Double value) {
        return ConverterAbstract(value, "bitcoin");
    }

    public Double ConverterAbstract(Double value, String fromCode) {
        return value * cryptoValue.GetValue(fromCode); 
    }
}

