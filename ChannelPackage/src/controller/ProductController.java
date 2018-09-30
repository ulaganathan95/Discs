package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import bean.*;

import service.ProductService;
public class ProductController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ChannelPackage cp = new ChannelPackage();
		ProductService ps=new ProductService();
		RequestDispatcher rd=null;
		String action=request.getParameter("action");
		/*if(action.equals("Submit"))
	{
		ArrayList<category1> alc1=ps.getcat();
		request.setAttribute("catobj", alc1);
		request.getRequestDispatcher("jsp/channelPackage_copy.jsp").forward(request,response);
	}
	else*/ 
		if(action.equals("add"))
		{
			ArrayList<category1> alc1=ps.getcat();
			request.setAttribute("catobj", alc1);
			ArrayList<channel> chann = ps.fetchChannel();
			request.setAttribute("channDetails",chann);
			request.getRequestDispatcher("jsp/addChannelPackage.jsp").forward(request,response);
		}
		else if(action.equals("ADD"))
		{
			PrintWriter pw = response.getWriter();
			String PacName=request.getParameter("pname");
			String pcat[] = request.getParameterValues("pcat");
			Set<String> ss = new HashSet<String>();
			for(String pc:pcat)
			{
				ss.add(pc);
			}
			String PacChargingType=request.getParameter("pchartype");
			String PacTransmissionType=request.getParameter("ptranstype");
			String PacChannels=request.getParameter("pchan");
			double PacCost=Double.parseDouble(request.getParameter("pcost"));
			String PacFromDate=request.getParameter("pfdate");
			String PacToDate=request.getParameter("ptdate");
			String pacAdded=request.getParameter("padded");

			java.util.Date date1=null,date2=null;
			java.sql.Date date3=null,date4=null;

			try {
				date1 = new SimpleDateFormat("yyyy-MM-dd").parse(PacFromDate);
				date3 = new java.sql.Date(date1.getTime());
				date2 = new SimpleDateFormat("yyyy-MM-dd").parse(PacToDate);
				date4 = new java.sql.Date(date2.getTime());;

			} 

			catch (ParseException e) {
				e.printStackTrace();
			}
			cp.setPacFromDate(date3);
			cp.setPacToDate(date4);
			cp.setPacName(PacName);		
			cp.setPacCategory(ss);
			cp.setPacChargingType(PacChargingType);
			cp.setPacTransmissionType(PacTransmissionType);
			cp.setPacChannels(PacChannels);
			cp.setPacCost(PacCost);
			cp.setPacAdded(pacAdded);
			for(String se:cp.getPacCategory())
			{
				System.out.println(se);
			}
			System.out.println(cp.getPacAdded()+" "+cp.getPacCost()+" "+cp.getPacChannels()+" "+cp.getPacChargingType()+" "+cp.getPackId()+" "+cp.getPacName()+" "+cp.getPacTransmissionType());

			int channelid=ps.addchannel(cp);
			request.setAttribute("channelid",channelid);
			rd=request.getRequestDispatcher("jsp/success.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("view"))
		{
			PrintWriter pw=response.getWriter();
			ArrayList<ChannelPackage> alcp =ps.fetchDetails();
			request.setAttribute("cPac", alcp);
			ArrayList<ChannelPackage> alCat =ps.fetchCatDetails();
			request.setAttribute("Cat", alCat);
			request.getRequestDispatcher("jsp/viewChannelPackage.jsp").forward(request, response);
		}
		else if(action.equals("UPDATE"))
		{
			int num1 = Integer.parseInt(request.getParameter("id1"));
			ChannelPackage cpFetch = ps.FetchChaPacDet(num1);
			request.setAttribute("chanPack", cpFetch);
			System.out.println(cpFetch.getPacCategory());
			request.getRequestDispatcher("jsp/updateChannelPackage.jsp").forward(request,response);
		}
		else if(action.equals("DELETE"))
		{
			boolean flag=false;
			String[] id=request.getParameterValues("id1");
			int[] id1=new int[id.length];
		   for (int i=0;i<id1.length;i++)
		   {
			   id1[i]=Integer.parseInt(id[i]);
			  
		   }
		   ps.DeletechaPacDet(id1);
		   flag=true;
		  if(flag==true)
		  {
		    ArrayList<ChannelPackage> alcp =ps.fetchDetails();
			request.setAttribute("cPac", alcp);
			ArrayList<ChannelPackage> alCat =ps.fetchCatDetails();
			request.setAttribute("Cat", alCat);
			request.getRequestDispatcher("jsp/viewChannelPackage.jsp").forward(request, response);
			  
		  }
		}
	}
}

