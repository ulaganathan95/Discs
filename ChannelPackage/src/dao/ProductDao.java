package dao;
import bean.ChannelPackage;
import bean.channel;

import bean.category1;
import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductDao 
{
	public ArrayList<category1> getCat()
	{
		Configuration cfg= new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		String sql="from category1";
		Query query = session.createQuery(sql);
		@SuppressWarnings("unchecked")
		ArrayList<category1> alc= (ArrayList<category1>) query.list();
		System.out.println("Success in retrieving");
		session.close();
		factory.close();
		return alc;
	}
	public int addchannel(ChannelPackage cp)
	{
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		int channelid=(Integer)session.save(cp);
		tx.commit();
		session.close();
		sf.close();
		return channelid;
	}
	public ArrayList<ChannelPackage> fetchDetails() 
	{
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String sql = "from ChannelPackage";
		Query query = session.createQuery(sql);
		@SuppressWarnings("unchecked")
		ArrayList<ChannelPackage> cpDao=(ArrayList<ChannelPackage>) query.list();
		session.close();
		sf.close();
		return cpDao;
	}
	public ArrayList<ChannelPackage> fetchCatDetails()
	{
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String sql = "from category1";
		Query query = session.createQuery(sql);
		@SuppressWarnings("unchecked")
		ArrayList<ChannelPackage> catDao=(ArrayList<ChannelPackage>) query.list();
		session.close();
		sf.close();
		return catDao;
	}
	public ArrayList<channel> fetchChannel()
	{
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		String sql = "from channel";
		Query query = session.createQuery(sql);
		@SuppressWarnings("unchecked")
		ArrayList<channel> channelDao=(ArrayList<channel>) query.list();
		session.close();
		sf.close();
		return channelDao;
	}
	public ChannelPackage FetchChaPacDet(int num1) 
	{
		Configuration cfg= new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object obj = (Object) session.load(ChannelPackage.class, new Integer(num1));
		ChannelPackage chanPac = (ChannelPackage) obj;
		return chanPac;
	}
	public boolean  DeletechaPacDet(int[] id)
	{
		boolean flag=false;
		Configuration cfg= new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		for(int i:id){
			
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Object obj=(Object)session.load(ChannelPackage.class, new Integer(i));
		ChannelPackage cp=(ChannelPackage) obj;
		session.delete(cp);	
		tx.commit();
		session.close();
		
		}
		factory.close();
		return flag;

	}
}
