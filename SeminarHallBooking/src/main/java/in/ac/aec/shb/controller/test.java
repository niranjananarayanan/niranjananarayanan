package in.ac.aec.shb.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import in.ac.aec.util.JdbcUtil;

public class test {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection connection= JdbcUtil.getJdbcConnection();
		if(connection!=null)
			System.out.println("Connection established");
	}

}
