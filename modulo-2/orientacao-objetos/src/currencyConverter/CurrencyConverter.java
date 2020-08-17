package currencyConverter;

public class CurrencyConverter {

	public static double quotation;
	public static double dollarValue;
	public static final double IOF = 0.06;
	
	public static double calc() {
		return quotation * dollarValue * (1+IOF);
	}
	
	@Override
	public String toString() {
		return "Montante a ser pago em reais: "+calc();
	}
	
}
