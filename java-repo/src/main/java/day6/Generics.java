package day6;

public class Generics {
	public static void main(String[] args) {
		// normal class
		MyInteger itg = new MyInteger(911);
		itg.print();
		MyDouble dbl = new MyDouble(9.11);
		dbl.print();
		// generic class
		MyTypeClass<String> stg = new MyTypeClass<String>("9/11");
		stg.print();
		MyTypeClass<Float> flt = new MyTypeClass<Float>((float) 9.11);
		flt.print();
		// bounded generic class
		MyNumberClass<Integer> itnm = new MyNumberClass<Integer>(9);
		System.out.println(itnm.squared());
		MyNumberClass<Double> dbnm = new MyNumberClass<Double>(1.1);
		System.out.println(dbnm.squared());
	}
}
