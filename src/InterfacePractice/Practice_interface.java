package InterfacePractice;


interface employees{
	void employees_department();
	
}
class managers implements employees
{

	@Override
	public void employees_department() {
		System.out.println("Managers:\nAlan\nKelly\nAdam");
		
	}
	class dept_name{
		dept_name(){
			System.out.println("Name:HR department");
		}
	}
}
class developers implements employees{

	@Override
	public void employees_department() {
		System.out.println("Developers:\nArav\nFazil\nMukunth");
		
	}

}
public class Practice_interface {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		developers dev_obj = new developers();
		dev_obj.employees_department();
		managers man_obj = new managers();
		managers.dept_name dept= man_obj.new dept_name();

	}

}
