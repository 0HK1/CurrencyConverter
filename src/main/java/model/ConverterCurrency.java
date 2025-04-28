package model;

public class ConverterCurrency {
	private GetCoinValue coinValue = new GetCoinValue();

	public Double ConverterEUAxBRL(Double value) {
		return ConverterAbstract(value, "USD", "BRL");
	}

	public Double ConverterBRLxEUA(Double value) {
		return ConverterAbstract(value, "BRL", "USD");
	}

	public Double ConverterBRLxARG(Double value) {
		return ConverterAbstract(value, "BRL", "ARS");
	}

	public Double ConverterBRLxEUR(Double value) {
		return ConverterAbstract(value, "BRL", "EUR");
	}

	public Double ConverterBRLxRUS(Double value) {
		return ConverterAbstract(value, "BRL", "RUB");
	}

	public Double ConverterBRLxCHI(Double value) {
		return ConverterAbstract(value, "BRL", "CNY");
	}

	public Double ConverterAbstract(Double value, String fromCode, String toCode) {
		return value / coinValue.GetValue(fromCode) * coinValue.GetValue(toCode);
	}
}
