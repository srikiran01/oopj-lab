package p2;
public class OtherPackage
	{
	public OtherPackage()
		{
		p1.Protection p = new p1.Protection();
		System.out.println("Other package constructor");
		System.out.println("n_pub="+p.n_pub);
		}
	}