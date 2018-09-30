package service;
import dao.*;

import bean.ChannelPackage;
import bean.category1;
import bean.channel;

import java.util.*;
public class ProductService 
{
	ProductDao pd = new ProductDao();
	public ArrayList<category1> getcat()
	{
		ArrayList<category1> alc = pd.getCat();
		return alc;
	}
	public int addchannel(ChannelPackage cp) 
	{
		int channelid=pd.addchannel(cp);
		return channelid;	
	}
	public ArrayList<ChannelPackage> fetchDetails()
	{
		ArrayList<ChannelPackage> cpService = pd.fetchDetails();
		return cpService;
	}
	public ArrayList<ChannelPackage> fetchCatDetails()
	{
		ArrayList<ChannelPackage> catService = pd.fetchCatDetails();
		return catService;
	}
	public ArrayList<channel> fetchChannel() 
	{
		ArrayList<channel> channelService = pd.fetchChannel();
		return channelService;
	}
	public ChannelPackage FetchChaPacDet(int num1) 
	{
		ChannelPackage cpService = pd.FetchChaPacDet(num1);
		return cpService; 
	}
	public boolean DeletechaPacDet(int[] id)
	{
		return pd.DeletechaPacDet(id) ;
  	}
	}

