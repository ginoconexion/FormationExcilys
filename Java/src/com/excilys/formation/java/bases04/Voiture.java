package com.excilys.formation.java.bases04;

public class Voiture {
	public enum ECarburant { SANS_PLOMB_98, SANS_PLOMB_95, DIESEL, GPL };
	private final ECarburant carburant;
	static float prixSP98 ;
	static float prixSP95;
	static float prixDiesel;
	static float prixGPL;
	public static int NOMBRE_ROUES = 4;
	
	
	public Voiture(ECarburant carburant) {
		this.carburant = carburant;
	}
	
	public Voiture(ECarburant carburant, float ...fs) {
		this.carburant = carburant;
		Voiture.prixSP98 = fs[0];
		Voiture.prixSP95 = fs[1];
		Voiture.prixDiesel = fs[2];
		Voiture.prixGPL = fs[3];
	}
	


	public ECarburant getCarburant() {
		return carburant;
	}


	public static void setPrixSP98(float prixSP98) {
		Voiture.prixSP98 = prixSP98;
	}


	public static void setPrixSP95(float prixSP95) {
		Voiture.prixSP95 = prixSP95;
	}


	public static void setPrixDiesel(float prixDiesel) {
		Voiture.prixDiesel = prixDiesel;
	}


	public static void setPrixGPL(float prixGPL) {
		Voiture.prixGPL = prixGPL;
	}
	
	public static void setNOMBRE_ROUES(int nOMBRE_ROUES) {
		NOMBRE_ROUES = nOMBRE_ROUES;
	}
	
	public static void service(){
		Voiture v1 = new Voiture(ECarburant.SANS_PLOMB_95, 0.9f, 0.8f, 1.0f, 1.1f);
		Voiture v2 = new Voiture(ECarburant.SANS_PLOMB_98);
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		
		Voiture v3 = new Voiture(ECarburant.DIESEL, 1.1f, 1.2f, 1.3f, 1.4f);
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		
		
	}

	@Override
	public String toString() {
		return "Voiture [carburant=" + carburant + " prixSP98= "+ prixSP98 +" prixSP95= "+ prixSP95 +" prixDiesel= "+ prixDiesel +" prixGPL= "+ prixGPL + "]";
	}
	
	public float getPrixCarburant(){
		switch (carburant) {
		case SANS_PLOMB_95:
			return prixSP95;
		case SANS_PLOMB_98:
			return prixSP98;
		case DIESEL:
			return prixDiesel;
		case GPL:
			return prixGPL;
		default:
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		service();
	}

	
	
	
	
}
