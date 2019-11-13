package Autobrumm;

public class Golf extends Auto{
	
	private int ges;

	Golf(int ges){
		this.ges=ges;
	}

	void fahren () {
		System.out.println("Ich fahre "+ges+"km/H");
	}
}
