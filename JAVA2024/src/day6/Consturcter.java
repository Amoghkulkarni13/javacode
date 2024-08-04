package day6;

public class Consturcter {

	
	int x,y;
	Consturcter(){   ///default constructer
		x=20;
		y=30;
	}
		
		
	Consturcter(int a,int b){  ///paramterized consturcter
			
			x=a;
			y=b;
		}
		
		int sum() {
			
			return x+y;
		}
		
		
		
		
	
	public static void main (String a[]) {
		
		Consturcter c=new Consturcter();
		System.out.println(c.sum());
		
		Consturcter cn=new Consturcter(100,200);
		System.out.println(cn.sum());
		
}


	
	
	
}
