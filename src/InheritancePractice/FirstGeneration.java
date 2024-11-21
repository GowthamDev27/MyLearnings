package InheritancePractice;

class SecondGen{
	
	void names(){
		System.out.println("SecondGen Names:abs,ads,afs");
	}
	
}

class ThirdGen extends SecondGen{
	void ThirdGenNames(){
		
		System.out.println("ThirdGen Names:bbs,bds,bfs");
	}
}
class FourthGen extends ThirdGen{
	void namesofgen() {
		System.out.println("Hello");
	}
}
public class FirstGeneration {

	public static void main(String[] args) {
		System.out.println("FirstGen Names:cbs,cds,cfs");
		FourthGen obj = new FourthGen();
		obj.namesofgen();
		obj.names();
		obj.ThirdGenNames();
		
	}

}
