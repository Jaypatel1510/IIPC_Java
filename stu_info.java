package jay_pr_1;


public class stu_info {
	private String name;
	private int uid;
	private int mobile;
	private String email;
		
		public void getdata() {
		setName("jay");
		setUid(01);
		setMobile(9323546);
		setEmail("abc");
	}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getUid() {
			return uid;
		}

		public void setUid(int uid) {
			this.uid = uid;
		}

		public int getMobile() {
			return mobile;
		}

		public void setMobile(int mobile) {
			this.mobile = mobile;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		@Override
		public String toString() {
			return ("name = "+getName() +"   uid :"+ getUid());
		}
}
