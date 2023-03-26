package in.ac.aec.shb.dao;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import in.ac.aec.shb.daoFactory.SeminarHallBookingDaoFactory;
import in.ac.aec.shb.dto.Booking;
import in.ac.aec.shb.dto.Status;
import in.ac.aec.shb.dto.Users;
import in.ac.aec.util.JdbcUtil;

public class SeminarHallBookingDaoImpl implements ISeminarHallBookingDao
{
	Connection connection=null;
	PreparedStatement statement=null;
	ResultSet resultset=null;
	Users user=null;
	Status status=null;
	Booking booking=null;
	
	@Override
	public String registerUser(Users user) 
	{
		String insertQuery = "INSERT INTO `userregistration` (`User_id`, `Username`, `Department`, `Batch`, `Email`, `Password`) VALUES (?,?,?,?,?,?)";
		System.out.println("From Service");
		try 
		{
			connection = JdbcUtil.getJdbcConnection();
								
			if (connection != null) 
			{
				System.out.println("Connection Estableshed");
				statement = (PreparedStatement) connection.prepareStatement(insertQuery);
				
				if (statement != null) 
				{
					statement.setInt(1, user.getId());
					statement.setString(2, user.getName());
					statement.setString(3, user.getDepartment());
					statement.setString(4, user.getBatch());
					statement.setString(5, user.getEmail());
					statement.setString(6, user.getPassword());
					System.out.println("Statement Estableshed");
					
					int rowsAffected = statement.executeUpdate();
					if (rowsAffected == 1) 
						return "success";
				}
			}
		} catch (SQLException | IOException e) 
		{
			e.printStackTrace();
			return "Technical Error";
		} 
		return "Failed";
	}

	@Override
	public boolean verifyLogin(String mail, String password, String userType) 
	{
		try 
		{
			connection = JdbcUtil.getJdbcConnection();
			
			if (connection != null) 
			{
				System.out.println("Connection Estableshed");
				if (userType.equalsIgnoreCase("User")) 
				{
					String selectQuery = "select Email,Password from userregistration where Email=? and Password=?";
					statement = (PreparedStatement) connection.prepareStatement(selectQuery);
					if (statement != null) 
					{
						System.out.println("Statement Estableshed");
						statement.setString(1, mail);
						statement.setString(2, password);
						resultset = statement.executeQuery();
						if(resultset!=null)
						{
							if (resultset.next()) 
							{
								System.out.println("Login details matched");
								return true;
							}
						}
					}
				} 
				else if (userType.equalsIgnoreCase("Admin")) 
				{
					String selectQuery = "select email,password from adminlogin where email=? and password=?";
					statement = (PreparedStatement) connection.prepareStatement(selectQuery);
					if (statement != null) 
					{
						System.out.println("Statement Estableshed");
						statement.setString(1, mail);
						statement.setString(2, password);
						resultset = statement.executeQuery();
						if(resultset!=null)
						{
							if (resultset.next()) 
							{
								System.out.println("Login details matched");
								return true;
							}
						}
					}
				}
			}
		} catch (SQLException | IOException e) 
		{
			return false;
		} 
		return false;
	}

	@Override
	public String hallBooking(Booking booking) 
	{
		System.out.println("From Service");
		java.sql.Date sqldate= null;
		String insertQuery = "INSERT INTO `seminarhallbooking` (`Booking_id`, `Hall_id`, `Department`, `Booking_date`, `Booking_slot`, `Username`, `User_email`, `purpose`) VALUES (?,?,?,?,?,?,?,?)";
		
		try{
			connection = JdbcUtil.getJdbcConnection();
								
			if (connection != null) 
			{
				System.out.println("Connection Estableshed");
				statement = (PreparedStatement) connection.prepareStatement(insertQuery);
									
				if (statement != null) 
				{		
					statement.setInt(1, booking.getBookingId());
					statement.setInt(2, booking.getHallId());
					statement.setString(3, booking.getDepartment());
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					System.out.println(booking.getBookingDate());
					long value = booking.getBookingDate().getTime();
					sqldate = new java.sql.Date(value);
					System.out.println(sqldate);
					statement.setDate(4, sqldate);
					statement.setString(5,booking.getBookingSlot());
					statement.setString(6, booking.getUsername());
					statement.setString(7, booking.getUserEmail());
					statement.setString(8, booking.getPurpose());
					System.out.println("Statement Estableshed");
					
					int rowsAffected = statement.executeUpdate();
					if (rowsAffected == 1) 
						return "success";
				}
			}
		} catch (SQLException | IOException e) 
		{
			e.printStackTrace();
			return "Error";
		} 
		return "Failed";
	}
		
	@Override
	public String cancelBooking(Integer bookingId) 
	{
		String deleteQuery = "DELETE FROM `seminarhallbooking` WHERE `Booking_id` = ?;";
		System.out.println("From Service");
		try 
		{
			connection = JdbcUtil.getJdbcConnection();
								
			if (connection != null) 
			{
				System.out.println("Connection Estableshed");
				statement = (PreparedStatement) connection.prepareStatement(deleteQuery);
				
				if (statement != null) 
				{
					statement.setInt(1, bookingId);
					
					System.out.println("Statement Estableshed");
					
					int rowsAffected = statement.executeUpdate();
					if (rowsAffected == 1) 
						return "success";
				}
			}
		} catch (SQLException | IOException e) 
		{
			return "Technical Error";
		} 
		return "Failed";
	}

	@Override
	public Booking viewBooking(Integer bookingId) 
	{
		String selectQuery = "SELECT Booking_id, Hall_id, Department, Booking_date, Booking_slot, Username, User_email, purpose FROM seminarhallbooking WHERE Booking_id = ?;";
		try 
		{
			connection = JdbcUtil.getJdbcConnection();
			
			if (connection != null) 
			{
				System.out.println("Connection Estableshed");
				statement = (PreparedStatement) connection.prepareStatement(selectQuery);
				System.out.println(selectQuery);
				if (statement != null) 
				{
					System.out.println(bookingId);
					statement.setInt(1, bookingId);
					System.out.println("Statement Estableshed");
					resultset = statement.executeQuery();
					if(resultset!=null)
					{
						if (resultset.next()) 
						{
							booking=new Booking();
							System.out.println("Got Resultset");
							System.out.println(resultset.getInt(1)+"\t"+resultset.getInt(2)+"\t"+resultset.getString(3)+"\t"+resultset.getDate(4)+"\t"+resultset.getString(5)+"\t"+resultset.getString(6)+"\t"+resultset.getString(7)+"\t"+resultset.getString(8));
							booking.setDepartment(resultset.getString(3));
							booking.setBookingId(resultset.getInt(1));
							booking.setHallId(resultset.getInt(2));
							booking.setBookingDate(resultset.getDate(4));
							booking.setBookingSlot(resultset.getString(5));
							booking.setUsername(resultset.getString(6));
							booking.setUserEmail(resultset.getString(7));
							booking.setPurpose(resultset.getString(8));
							
							return booking;
						}
					}
				}
			}
		}catch(SQLException | IOException e)
		{
			e.printStackTrace();
		}
		return booking;		
	}

	@Override
	public Users viewProfile(Integer id) 
	{
		String selectQuery = "select  User_id, Username, Department, Batch, Email  from userregistration where User_id=?;";
		try 
		{
			connection = JdbcUtil.getJdbcConnection();
			
			if (connection != null) 
			{
				System.out.println("Connection Estableshed");
				statement = (PreparedStatement) connection.prepareStatement(selectQuery);
				System.out.println(selectQuery);
				if (statement != null) 
				{
					System.out.println(id);
					statement.setInt(1, id);
					System.out.println("Statement Estableshed");
					resultset = statement.executeQuery();
					if(resultset!=null)
					{
						if (resultset.next()) 
						{
							user=new Users();
							System.out.println("Got Resultset");
							System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4)+"\t"+resultset.getString(5));
							user.setId(resultset.getInt(1));
							user.setName(resultset.getString(2));
							user.setDepartment(resultset.getString(3));
							user.setBatch(resultset.getString(4));
							user.setEmail(resultset.getString(5));
							return user;	
						}
					}
				}
			}
		}catch(SQLException | IOException e)
		{
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public void addStatus(Status status) 
	{
		String insertQuery = "INSERT INTO `seminarhallbooking`.`status` (`Booking_id`, `User_email`, `Status`) VALUES (?,?,?);";
		System.out.println("From Service");
		try 
		{
			connection = JdbcUtil.getJdbcConnection();
								
			if (connection != null) 
			{
				System.out.println("Connection Estableshed");
				statement = (PreparedStatement) connection.prepareStatement(insertQuery);
				
				if (statement != null) 
				{
					statement.setInt(1, status.getBookingId());
					statement.setString(2, status.getUserEmail());
					statement.setString(3,status.getStatus());
					System.out.println("Statement Estableshed");
					
					statement.executeUpdate();
				}
			}
		} catch (SQLException | IOException e) 
		{
			e.printStackTrace();
		} 
	}

	@Override
	public Status viewStatus(String mail) 
	{
		String selectQuery = "select  Booking_id, User_email, Status  from status where User_email=?;";
		try 
		{
			connection = JdbcUtil.getJdbcConnection();
			
			if (connection != null) 
			{
				System.out.println("Connection Estableshed");
				statement = (PreparedStatement) connection.prepareStatement(selectQuery);
				System.out.println(selectQuery);
				if (statement != null) 
				{
					System.out.println(mail);
					statement.setString(1, mail);
					System.out.println("Statement Estableshed");
					resultset = statement.executeQuery();
					if(resultset!=null)
					{
						if (resultset.next()) 
						{
							status=new Status();
							System.out.println("Got Resultset");
							System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3));
							status.setBookingId(resultset.getInt(1));
							status.setUserEmail(resultset.getString(2));
							status.setStatus(resultset.getString(3));
							return status;	
						}
					}
				}
			}
		}catch(SQLException | IOException e)
		{
			e.printStackTrace();
		}
		return status;		
	}
	
	@Override
	public Booking viewMyBookings(String mail) 
	{
		String selectQuery = "SELECT Booking_id, Hall_id, Department, Booking_date, Booking_slot, Username, User_email, purpose FROM seminarhallbooking WHERE User_email = ?;";
		try 
		{
			connection = JdbcUtil.getJdbcConnection();
			
			if (connection != null) 
			{
				System.out.println("Connection Estableshed");
				statement = (PreparedStatement) connection.prepareStatement(selectQuery);
				System.out.println(selectQuery);
				if (statement != null) 
				{
					System.out.println(mail);
					statement.setString(1, mail);
					System.out.println("Statement Estableshed");
					resultset = statement.executeQuery();
					if(resultset!=null)
					{
						if (resultset.next()) 
						{
							booking=new Booking();
							System.out.println("Got Resultset");
							System.out.println(resultset.getInt(1)+"\t"+resultset.getInt(2)+"\t"+resultset.getString(3)+"\t"+resultset.getDate(4)+"\t"+resultset.getString(5)+"\t"+resultset.getString(6)+"\t"+resultset.getString(7)+"\t"+resultset.getString(8));
							booking.setBookingId(resultset.getInt(1));
							booking.setHallId(resultset.getInt(2));
							booking.setDepartment(resultset.getString(3));
							booking.setBookingDate(resultset.getDate(4));
							booking.setBookingSlot(resultset.getString(5));
							booking.setUsername(resultset.getString(6));
							booking.setUserEmail(resultset.getString(7));
							booking.setPurpose(resultset.getString(8));
							return booking;
						}
					}
				}
			}
		}catch(SQLException | IOException e)
		{
			e.printStackTrace();
		}
		return booking;		
	}
	
	public Users viewMyProfile(String mail) 
	{
		String selectQuery = "select  User_id, Username, Department, Batch, Email  from userregistration where Email=?;";
		try 
		{
			connection = JdbcUtil.getJdbcConnection();
			
			if (connection != null) 
			{
				System.out.println("Connection Estableshed");
				statement = (PreparedStatement) connection.prepareStatement(selectQuery);
				System.out.println(selectQuery);
				if (statement != null) 
				{
					System.out.println(mail);
					statement.setString(1, mail);
					System.out.println("Statement Estableshed");
					resultset = statement.executeQuery();
					if(resultset!=null)
					{
						if (resultset.next()) 
						{
							user=new Users();
							System.out.println("Got Resultset");
							System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4)+"\t"+resultset.getString(5));
							user.setId(resultset.getInt(1));
							user.setName(resultset.getString(2));
							user.setDepartment(resultset.getString(3));
							user.setBatch(resultset.getString(4));
							user.setEmail(resultset.getString(5));
							return user;	
						}
					}
				}
			}
		}catch(SQLException | IOException e)
		{
			e.printStackTrace();
		}
		return user;
	}
}
