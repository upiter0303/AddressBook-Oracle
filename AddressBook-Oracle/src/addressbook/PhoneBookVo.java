package addressbook;

public class PhoneBookVo {

	private Long id;
	private String name;
	private String hp;
	private String tel;
	
	
	public PhoneBookVo() {}
	
	public PhoneBookVo(String name, String hp, String tel) {
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}
	
	public PhoneBookVo(Long id, String name, String hp, String tel) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
