
import java.util.ArrayList;
public class SchoolSystem implements ISignUp {
	private  int big;
    private   int medium;
    private   int small;
  
		public SchoolSystem(int big, int medium, int small) {//24562456
			this.big=big;
			this.medium=medium;
			this.small=small;
	}
		public void addStudent(int stuType) {
			 // 解析命令行输入的参数（格式），如文档描述
			if(stuType==1 && big>0) {
				System.out.println("加入大班");
				big--;
			}
			else if(stuType==2 && medium>0) {
				System.out.println("加入中班");
				medium--;
			}
			else if(stuType==3 && small>0) {
				System.out.println("加入小班");
				small--;
			}
				}

		public boolean print() {
			if(big==0 &&big<0) {
				System.out.println("因为没有剩余的大班名额，唯一1个大班名额已经被占据了");
			}
		 if(medium==0) {
				System.out.println("因为没有剩余的中班名额，唯一1个中班名额已经被占据了");
			}
			 if(small==0) {
				System.out.println("因为没有剩余的小班名额，唯一1个小班名额已经被占据了");
			}
			return false;
		}
		 
	

		public static void main(String[] args) throws Exception {
		        SchoolSystem sc = new SchoolSystem (1,1,0);
		       sc.addStudent(1);
		       sc.addStudent(2);
		       sc.addStudent(3);
		       sc.addStudent(1);
		       System.out.println(sc.print());
		}
	

}
