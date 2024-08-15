public class App{

	public static void main(String [] args) throws Exception{
		Btree a = new Btree();

		a.add(42);
		a.add(19);
		a.add(51);
		a.add(37);
		a.add(42);
		a.add(23);
		a.add(47);
		a.add(91);
		a.add(56);
		a.add(27);
		a.add(49);
		a.add(32);
		a.add(10);
		
		a.show();

		System.out.println(a.size());
		System.out.println(a.soma());
	}
}