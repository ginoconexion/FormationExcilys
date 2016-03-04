package com.hibernate.mapping.object.genere;

public class ZoneRef {
	private int id;
	private int zoneDebut;
	private int zoneFin;
	private float prix;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getZoneDebut() {
		return zoneDebut;
	}
	public void setZoneDebut(int zoneDebut) {
		this.zoneDebut = zoneDebut;
	}
	public int getZoneFin() {
		return zoneFin;
	}
	public void setZoneFin(int zoneFin) {
		this.zoneFin = zoneFin;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
}
