package com.exemple.monprojet;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App app = new App();
    	System.out.println(app.getPropriete("mapropriete"));
    }
    
    public String  getPropriete(String nom){
    	String prop = null;
    	try {
			Configuration config = new PropertiesConfiguration("monprojet.properties");
			prop = config.getString(nom);
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return prop;
    }
}
