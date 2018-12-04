package cn.com.taiji.jpahw;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Children {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "cname", nullable = true, length = 20)
	private String cname;
	@Column(name = "csex", nullable = true, length = 1)
	private String csex;
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "pname_id", referencedColumnName = "id") 
	private Parents pname;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSex() {
		return csex;
	}

	public void setSex(String csex) {
		this.csex = csex;
	}


	public Parents getPname() {
		return pname;
	}

	public void setPname(Parents pname) {
		this.pname = pname;
	}

}
