import java.util.*;
class MainG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f,g,h,i,j;
		Scanner cin = new Scanner (System.in);
		while(cin.hasNext()){
			a=cin.nextInt();
			b=cin.nextInt();
			c=cin.nextInt();
			d=cin.nextInt();
			e=cin.nextInt();
			f=cin.nextInt();
			g=cin.nextInt();
			h=cin.nextInt();
			i=cin.nextInt();
			j=cin.nextInt();
			int min;
			min=Math.min(Math.min(Math.min(Math.min(a, b), 
			        Math.min(c,d)),Math.min(e, f)),
			        Math.min(Math.min(g, h),Math.min(i, j)));
			System.out.println(min);
		}
		cin.close();
	}

}
