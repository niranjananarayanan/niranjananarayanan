package in.ac.aec.shb.controller;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.ac.aec.shb.dto.Admin;
import in.ac.aec.shb.dto.Booking;
import in.ac.aec.shb.dto.Status;
import in.ac.aec.shb.dto.Users;
import in.ac.aec.shb.service.ISeminarHallBookingService;
import in.ac.aec.shb.serviceFactory.SeminarHallBookingServiceFactory;

@WebServlet("/controller/*")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doProcess(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ISeminarHallBookingService seminarHallBookingService = SeminarHallBookingServiceFactory.getSeminarHallBookingService();
		
		RequestDispatcher rd= null;
		HttpSession session = request.getSession();
		Users user=null;
		Admin admin=null;
		Booking booking=null;
		Status Status=null;
		String status=null;

		System.out.println("Request URI :: " + request.getRequestURI());
		System.out.println("Path info   :: " + request.getPathInfo());
		
		if (request.getRequestURI().endsWith("registeruser")) 
		{
			request.setAttribute("email", request.getParameter("email"));
			rd = request.getRequestDispatcher("../userRegister.jsp");
			rd.forward(request, response);
			System.out.println("Request forwarded from register.html page to userRegister.jsp");
		}

		if (request.getRequestURI().endsWith("register"))
		{
			user = new Users();
			try 
			{
				Integer id= Integer.parseInt(request.getParameter("id"));
				String name=request.getParameter("name");
				String password=request.getParameter("password");
				String department = request.getParameter("department");
				String batch=request.getParameter("batch");
				String email=request.getParameter("email");
				
				System.out.println(id);
				System.out.println(name);
				System.out.println(department);
				System.out.println(batch);
				System.out.println(email);
				System.out.println(password);
				
				user.setId(id);
				user.setName(name);
				user.setDepartment(department);
				user.setBatch(batch);
				user.setEmail(email);
				user.setPassword(password);
				
				status = seminarHallBookingService.registerUser(user);
				System.out.println("From userregistration.jsp");
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
				
			if (status.equalsIgnoreCase("success")) 
			{
				rd = request.getRequestDispatcher("../success.html");
				rd.forward(request, response);
				System.out.println("From success.html");
			} 
			else if (status.equalsIgnoreCase("Failed"))
			{
				rd = request.getRequestDispatcher("../failed.html");
				rd.forward(request, response);
				System.out.println("From failed.html");
			}
			else
				System.out.println("Error");
		}
		
		if (request.getRequestURI().endsWith("login")) 
		{
			String mail = request.getParameter("mail");
			String password = request.getParameter("password");
			String userType = request.getParameter("userType");
			
			System.out.println(userType);
			System.out.println(mail);
			System.out.println(password);
			
			if (userType.equalsIgnoreCase("user")) 
			{
				if (seminarHallBookingService.verifyLogin(mail, password, userType)) 
				{
					session.setAttribute("mail", mail);
					System.out.println("Login Successful");
					String url = response.encodeURL("../userInterface.jsp");
					response.sendRedirect(url);
					System.out.println("From userInterface.jsp");
				} 
				else 
				{
					System.out.println("Login failed");
					rd = request.getRequestDispatcher("login.html");
					rd.forward(request, response);
				}
			} 
			else if (userType.equalsIgnoreCase("admin")) 
			{
				if (seminarHallBookingService.verifyLogin(mail, password, userType)) 
				{
					session.setAttribute("mail", mail);
					System.out.println("Login Successful");
					String url = response.encodeURL("../adminInterface.jsp");
					response.sendRedirect(url);
					System.out.println("From adminInterface.jsp");
				} 
				else 
				{
					System.out.println("Login failed");
					rd = request.getRequestDispatcher("login.html");
					rd.forward(request, response);
				}
			}
		}
		
		if (request.getRequestURI().endsWith("addbooking"))
		{
			booking = new Booking();
			try 
			{
				Integer bookingId=Integer.parseInt(request.getParameter("bookingId"));
				System.out.println(bookingId);
				
				Integer hallId=Integer.parseInt(request.getParameter("hallId"));
				System.out.println(hallId);
				
				String username=request.getParameter("username");
				System.out.println(username);
				
				String userEmail= request.getParameter("userEmail");
				System.out.println(userEmail);
				
				String department= request.getParameter("department");
				System.out.println(department);
				
				String bookingSlot= request.getParameter("bookingSlot");
				System.out.println(bookingSlot);
								
				String bookingDate=request.getParameter("bookingDate");
				System.out.println(bookingDate);
				
				String purpose=request.getParameter("purpose");
				System.out.println(purpose);
								
				SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date date= sdf.parse(bookingDate);
				System.out.println(date);
				
					booking.setBookingId(bookingId);
					booking.setHallId(hallId);
					booking.setUsername(username);
					booking.setDepartment(department);
					booking.setUserEmail(userEmail);
					booking.setPurpose(purpose);
					booking.setBookingSlot(bookingSlot);
					booking.setBookingDate(date);
				
				status = seminarHallBookingService.hallBooking(booking);
				System.out.println("From addbooking.jsp");
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			if (status.equalsIgnoreCase("success")) 
			{
				request.setAttribute("email", request.getParameter("email"));
				request.setAttribute("bookingId", request.getParameter("bookingId"));
				rd = request.getRequestDispatcher("../bookingsuccess.jsp");
				rd.forward(request, response);
				System.out.println("from success");
			} 
			else if (status.equalsIgnoreCase("Failed"))
			{
				request.setAttribute("email", request.getParameter("email"));
				request.setAttribute("bookingId", request.getParameter("bookingId"));
				rd = request.getRequestDispatcher("../bookingfailed.jsp");
				rd.forward(request, response);
				System.out.println("From failed");
			}
			else if (status.equalsIgnoreCase("error"))
			{
				rd = request.getRequestDispatcher("../bookingerror.html");
				rd.forward(request, response);
				System.out.println("Error");
			}				
		}
				
		if (request.getRequestURI().endsWith("cancelbooking"))
		{
			try 
			{
				Integer bookingId=Integer.parseInt(request.getParameter("bookingId"));
				System.out.println(bookingId);
				
				status = seminarHallBookingService.cancelBooking(bookingId);
				System.out.println("From cancelbooking.jsp");
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
				
			if (status.equalsIgnoreCase("success")) 
			{
				request.setAttribute("email", request.getParameter("email"));
				request.setAttribute("bookingId", request.getParameter("bookingId"));
				rd = request.getRequestDispatcher("../cancellationsuccess.jsp");
				rd.forward(request, response);
				System.out.println("from success");
			} 
			else if (status.equalsIgnoreCase("Failed"))
			{
				request.setAttribute("email", request.getParameter("email"));
				request.setAttribute("bookingId", request.getParameter("bookingId"));
				rd = request.getRequestDispatcher("../cancellationfailed.jsp");
				rd.forward(request, response);
				System.out.println("From failed");
			}
			else if (status.equalsIgnoreCase("error"))
			{
				rd = request.getRequestDispatcher("../cancelationerror.html");
				rd.forward(request, response);
				System.out.println("Error");
			}		
		}
		
		if (request.getRequestURI().endsWith("addstatus"))
		{
			Status = new Status();
			try 
			{
				Integer bookingId=Integer.parseInt(request.getParameter("bookingId"));
				System.out.println(bookingId);
				
				String userEmail= request.getParameter("userEmail");
				System.out.println(userEmail);
				
				String statuss=request.getParameter("status");
				System.out.println(statuss);
				
				Status.setUserEmail(userEmail);
				Status.setStatus(statuss);
				Status.setBookingId(bookingId);
				
				seminarHallBookingService.addStatus(Status);
				System.out.println("From addstatus");
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		if (request.getRequestURI().endsWith("viewbooking")) 
		{
			booking = new Booking();
			
			Integer bookingId=Integer.parseInt(request.getParameter("bookingId"));
			System.out.println(bookingId);
			
			booking = seminarHallBookingService.viewBooking(bookingId);

			Integer bookingId1=booking.getBookingId();
			System.out.println(bookingId1);
			
			Integer hallId=booking.getHallId();
			System.out.println(hallId);
			
			String username=booking.getUsername();
			System.out.println(username);
			
			String userEmail=booking.getUserEmail();
			System.out.println(userEmail);
			
			String department=booking.getDepartment();
			System.out.println(department);
			
			String bookingSlot= booking.getBookingSlot();
			System.out.println(bookingSlot);
							
			Serializable bookingDate=booking.getBookingDate();
			System.out.println(bookingDate);
			
			String purpose=booking.getPurpose();
			System.out.println(purpose);
			request.setAttribute("booking", booking);

			rd = request.getRequestDispatcher("../display.jsp");
			rd.forward(request, response);
			System.out.println("forwarded to display.jsp");
		}
		
		if (request.getRequestURI().endsWith("viewmyprofile")) 
		{
			user = new Users();
			
			Integer id=Integer.parseInt(request.getParameter("id"));
			System.out.println(id);
			
			user = seminarHallBookingService.viewMyProfile(id);
			request.setAttribute("user", user);

			rd = request.getRequestDispatcher("../displayprofile.jsp");
			rd.forward(request, response);
			System.out.println("forwarded to display.jsp");
		}
		
		if (request.getRequestURI().endsWith("viewmystatus")) 
		{
			Status = new Status();
			
			String mail = request.getParameter("mail");
			System.out.println(mail);
				
			Status = seminarHallBookingService.viewStatus(mail);
			request.setAttribute("Status", Status);

			rd = request.getRequestDispatcher("../displaystatus.jsp");
			rd.forward(request, response);
			System.out.println("forwarded to display.jsp");
		}
		
		if (request.getRequestURI().endsWith("viewmybookings")) 
		{
			booking = new Booking();

			String mail = request.getParameter("mail");
			System.out.println(mail);
			
			booking = seminarHallBookingService.viewMyBookings(mail);
			request.setAttribute("booking", booking);

			rd = request.getRequestDispatcher("../display.jsp");
			rd.forward(request, response);
			System.out.println("forwarded to display.jsp");
		}
	}
}
