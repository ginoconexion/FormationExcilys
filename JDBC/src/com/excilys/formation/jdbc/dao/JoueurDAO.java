package com.excilys.formation.jdbc.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.excilys.formation.jdbc.entites.Joueur;

public class JoueurDAO {
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs =  null;
	
	public void init(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "test", "test");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
  public void register(Joueur joueur) {
		String sql = "INSERT INTO joueurs  (login, password, prenom, nom, dateNaissance, email, telephone) VALUES (?,  ?, ?, ?, ?, ?, ?) ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, joueur.getLogin());
			pstmt.setString(2, joueur.getPassword());
			pstmt.setString(3, joueur.getPrenom());
			pstmt.setString(4, joueur.getNom());
			pstmt.setDate(5, joueur.getDateNaissance());
			pstmt.setString(6, joueur.getEmail());
			pstmt.setString(7, joueur.getTelephone());
			pstmt.executeUpdate();
		} catch (SQLException e)  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
  public Joueur login(String login, String password){
	  String sql = "SELECT * FROM joueurs WHERE login = ? AND password = ?";
	  Joueur joueur = null;
	  try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, login);
		pstmt.setString(2, password);
		System.out.println(pstmt.toString());
		rs = pstmt.executeQuery();
		
		if(rs.first()){
			joueur = new Joueur();
			joueur.setId(rs.getInt("id"));
			joueur.setDateNaissance(rs.getDate("dateNaissance"));
			joueur.setEmail(rs.getString("email"));
			joueur.setLogin(rs.getString("login"));
			joueur.setNom(rs.getString("nom"));
			joueur.setPassword(rs.getString("password"));
			joueur.setPoste(rs.getString("poste"));
			joueur.setPrenom(rs.getString("prenom"));
			joueur.setTelephone(rs.getString("telephone"));
			
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return joueur;
  }
  
	
	
	public void close(){
		try {
			this.pstmt.close();
			this.conn.close();
			this.rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
