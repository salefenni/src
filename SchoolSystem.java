
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
			 // ��������������Ĳ�������ʽ�������ĵ�����
			if(stuType==1 && big>0) {
				System.out.println("������");
				big--;
			}
			else if(stuType==2 && medium>0) {
				System.out.println("�����а�");
				medium--;
			}
			else if(stuType==3 && small>0) {
				System.out.println("����С��");
				small--;
			}
				}

		public boolean print() {
			if(big==0 &&big<0) {
				System.out.println("��Ϊû��ʣ��Ĵ�����Ψһ1����������Ѿ���ռ����");
			}
		 if(medium==0) {
				System.out.println("��Ϊû��ʣ����а����Ψһ1���а������Ѿ���ռ����");
			}
			 if(small==0) {
				System.out.println("��Ϊû��ʣ���С�����Ψһ1��С�������Ѿ���ռ����");
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
