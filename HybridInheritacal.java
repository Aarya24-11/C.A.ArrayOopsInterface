package OOPsConsept;

class a
{
	void a()
	{
		System.out.println("class a method " +20);
	}
}

class b extends a
{
	void b()
	{
		System.out.println("===============================");
		System.out.println("class b method" +30);
	}
}

interface c
{
	void c();
}

class d extends b implements c
{
	 
	@Override
	public void c()
	{
		System.out.println("===============================");
		System.out.println("interface method" +50);
	}
}

public class HybridInheritacal {

	public static void main(String[] args) {
		d obj=new d();
		obj.a();
		obj.b();
		obj.c();

	}

}
