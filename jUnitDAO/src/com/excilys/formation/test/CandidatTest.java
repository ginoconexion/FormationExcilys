package com.excilys.formation.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.excilys.formation.dao.Candidat;
import com.excilys.formation.dao.CandidatDAO;

public class CandidatTest {

	private Connection conn = null;
 	private Statement stmt = null;
 	private PreparedStatement pstmt = null;
 	private static CandidatDAO candidatDao = null;
	
	@BeforeClass
	public static void init(){
		candidatDao = new CandidatDAO();
		candidatDao.initConnection();
	}
	
	@AfterClass
	public static void close(){
		candidatDao.closeConnection();
	}
	@Test
	public void testInsertion() {
		 Candidat candidat = new Candidat();
		 candidat.setCodeObtenu(1);
		 Date ddn = new Date(1992, 3, 29);
		 candidat.setDdnCandidat(ddn);
		 candidat.setNomCandidat("GIRAULT");
		 candidat.setNumIdCandidat(51651);
		 candidatDao.creerCandidat(candidat);
	}
	
	@Test
	public void testGetCandidatByNom(){
		Candidat candidat = candidatDao.recupererCandidat("GIRAULT");
		assertEquals("GIRAULT", candidat.getNomCandidat());
	}

}
