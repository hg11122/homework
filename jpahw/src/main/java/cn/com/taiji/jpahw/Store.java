package cn.com.taiji.jpahw;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Store {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    @Column(nullable = false)
	    private String sname; //权限名
	    @ManyToMany(mappedBy = "storeList")
	    private List<Goods> goodsList;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public List<Goods> getGoodsList() {
			return goodsList;
		}
		public void setUserList(List<Goods> goodsList) {
			this.goodsList = goodsList;
		}

}
