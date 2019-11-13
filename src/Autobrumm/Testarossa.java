package Autobrumm;

public class Testarossa extends Auto{
	
	private int ges;

	Testarossa(int ges){
		this.ges=ges;
	}

	void fahren () {
		System.out.println("Ich fahre "+ges+"km/H");
	}
}
