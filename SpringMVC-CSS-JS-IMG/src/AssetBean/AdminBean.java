package AssetBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class AdminBean {
	@Id
	  @Column(name="Adminid")
	String Aid;
	@Column(name="Adminpwd")
	String Apwd;
	public String getAid() {
		return Aid;
	}
	public void setAid(String aid) {
		Aid = aid;
	}
	public String getApwd() {
		return Apwd;
	}
	public void setApwd(String apwd) {
		Apwd = apwd;
	}

}
