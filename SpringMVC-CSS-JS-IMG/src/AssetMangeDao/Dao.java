package AssetMangeDao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import AssetBean.AdminBean;



public class Dao {
	
	//by defualt insertion in admin table
	public Dao()
	{
		int x=0;
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		AdminBean a = new AdminBean();
		a.setAid("Admin");
		a.setApwd("system");
		Session ss= sf.openSession();
	    Transaction	 tt = ss.beginTransaction();
	    
    ss.saveOrUpdate(a);
	    
	     tt.commit();
	     ss.close();
	     
	}
	//admin login 
	public int  loginAdmin(String aname,String apwd)
	{
         SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session ss= sf.openSession();
		Criteria ct = ss.createCriteria(AdminBean.class);
		ArrayList<AdminBean> list = (ArrayList<AdminBean>)ct.list();
		ct.add(Restrictions.eq("Aid", aname));
		ct.add(Restrictions.eq("Apwd", apwd));
		int x=0;
		if(list.isEmpty())
			x=0;
		else
			x=1;
		return x;
	}
}


