package cn.com.taiji.jpahw;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
	@Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
    private Integer id; //id
    @Column(nullable = false, length = 20)
    private String pname;//姓名
    @OneToMany(mappedBy = "person",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    //级联保存、更新、删除、刷新;延迟加载。当删除用户，会级联删除该用户的所有文章
    //拥有mappedBy注解的实体类为关系被维护端
     //mappedBy="author"中的author是Article中的author属性
    private List<Friends> friendsList;//文章列表
    @Column(nullable = false, length = 1)
    private String psex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPsex() {
		return psex;
	}
	public void setPsex(String psex) {
		this.psex = psex;
	}
	public List<Friends> getFriendsList() {
		return friendsList;
	}
	public void setFriendsList(List<Friends> friendsList) {
		this.friendsList = friendsList;
	}

}
