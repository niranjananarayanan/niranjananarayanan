package in.ac.aec.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {

		static
		{
			try	
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver Class loading");
			} catch (ClassNotFoundException ce) 
			{
				ce.printStackTrace();
			}
		}
		
		public static Connection getJdbcConnection() throws SQLException, IOException
		{
			Connection connection= null;
			
			System.out.println("Connection object initiating");
			
			String fileLoc = "H:\\Project\\CollegeSeminarHallBookings\\src\\main\\java\\in\\ac\\aec\\properties\\application.properties";
			FileInputStream fis = new FileInputStream(fileLoc);
			System.out.println(fileLoc);
			Properties properties = new Properties();
			properties.load(fis);

			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			
			System.out.println(url);
			System.out.println(user);
			System.out.println(password);
			
			connection=DriverManager.getConnection(url,user,password);
			
			return connection;
		}		
			
}
