package com.excilys.formation.dao;

//STEP 1. Import required packages
import java.sql.*;

public class CandidatDAO {
 // JDBC driver name and database URL
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql://localhost/test";

 //  Database credentials
 static final String USER = "test";
 static final String PASS = "test";
 
 	private Connection conn = null;
 	private Statement stmt = null;
 	private PreparedStatement pstmt = null;
 	
 	public void initConnection(){
 		
 		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");
		    conn = DriverManager.getConnection(DB_URL,USER,PASS);
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	
 	public void closeConnection(){
 		try {
			stmt.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 
 	
 	public boolean creerCandidat(Candidat candidat){
 		//STEP 4: Execute a query
	    System.out.println("Creating statement...");
	    boolean insertion = false;
	    try {
			stmt = conn.createStatement();
			String sql;
			
			//sql = "INSERT INTO candidat (IdCandidat, NomCandidat, NumIdCandidat, ddnCandidat, codeObtenu) VALUES ('1', '"+candidat.getNomCandidat()+"','"+ candidat.getNumIdCandidat() +"', '"+ candidat.getDdnCandidat().toString() +"', '"+1+"')";
		    sql = "INSERT INTO candidat (IdCandidat, NomCandidat, NumIdCandidat, ddnCandidat, codeObtenu) VALUES (?, ?,  ?, ?, ?)";
		    pstmt = conn.prepareStatement(sql);
		    pstmt.setInt(1, 2);
		    pstmt.setString(2, candidat.getNomCandidat());
		    pstmt.setInt(3, candidat.getNumIdCandidat());
		    pstmt.setDate(4, candidat.getDdnCandidat());
		    pstmt.setInt(5, candidat.getCodeObtenu());
		    insertion = pstmt.execute();
		    //stmt.executeUpdate(sql);
		  //STEP 6: Clean-up environment
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return insertion;
 	}
	public Candidat recupererCandidat(String nom){
		   
		 Candidat candidat  = null;
		  //STEP 4: Execute a query
		    System.out.println("Creating statement...");
		    try {
				stmt = conn.createStatement();
				String sql;
				
			    sql = "SELECT IdCandidat, NomCandidat, NumIdCandidat, ddnCandidat, codeObtenu FROM candidat WHERE NomCandidat = ?";
			    pstmt = conn.prepareStatement(sql);
			    pstmt.setString(1, nom);
			    ResultSet rs = pstmt.executeQuery();
			    
			    //ResultSet rs = stmt.executeQuery(sql);
			    //STEP 5: Extract data from result set
			    rs.next();
			    
			    //while(rs.next()){
			    	System.out.println(rs.toString());
			       //Retrieve by column name
			       int id  = rs.getInt("IdCandidat");
			       int numId = rs.getInt("NumIdCandidat");
			       String nomCandidat = rs.getString("NomCandidat");
			       int codeObtenu = rs.getInt("codeObtenu");
			       Date date = rs.getDate("ddnCandidat");
			       //Display values
			       candidat = new Candidat();
			       candidat.setCodeObtenu(codeObtenu);
			       candidat.setDdnCandidat(date);
			       candidat.setNumIdCandidat(numId);
			       candidat.setId(id);
			       candidat.setNomCandidat(nomCandidat);
			       
			       
			       System.out.print("id: " + id);
			       System.out.print(", numId: " + numId);
			       System.out.print(", nomCandidat: " + nomCandidat);
			       System.out.println(", date: " + date);
			    //}
			  //STEP 6: Clean-up environment
			    rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    

			return candidat;
			/*
		finally{
		    //finally block used to close resources
		   */
	}  
 
 
 public static void main(String[] args) {
	 
	 CandidatDAO candidatDao = new CandidatDAO();
	 candidatDao.initConnection();
	 candidatDao.recupererCandidat("BRET");
	 
	 Candidat candidat = new Candidat();
	 candidat.setCodeObtenu(1);
	 Date ddn = new Date(1992, 3, 29);
	 candidat.setDdnCandidat(ddn);
	 candidat.setNomCandidat("GIRAULT");
	 candidat.setNumIdCandidat(51651);
	 candidatDao.creerCandidat(candidat);
	 candidatDao.closeConnection();
 }
 
 
}//end FirstExample
