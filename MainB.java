import java.util.*;
class MainB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f,g,h,i,j;
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){
			int m,s;
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
			m=Math.max(Math.max(Math.max(Math.max(a, b), 
			Math.max(c,d)),Math.max(e, f)),
			Math.max(Math.max(g, h),Math.max(i, j)));
			if(m==a)a=Math.min(Math.min(Math.min(Math.min(a, b), 
			        Math.min(c,d)),Math.min(e, f)),
			        Math.min(Math.min(g, h),Math.min(i, j)));
			if(m==b)b=Math.min(Math.min(Math.min(Math.min(a, b), 
					Math.min(c,d)),Math.min(e, f)),
					Math.min(Math.min(g, h),Math.min(i, j)));
			if(m==c)c=Math.min(Math.min(Math.min(Math.min(a, b), 
					Math.min(c,d)),Math.min(e, f)),
					Math.min(Math.min(g, h),Math.min(i, j)));
			if(m==d)d=Math.min(Math.min(Math.min(Math.min(a, b), 
					Math.min(c,d)),Math.min(e, f)),
					Math.min(Math.min(g, h),Math.min(i, j)));
			if(m==e)e=Math.min(Math.min(Math.min(Math.min(a, b), 
					Math.min(c,d)),Math.min(e, f)),
					Math.min(Math.min(g, h),Math.min(i, j)));
			if(m==f)f=Math.min(Math.min(Math.min(Math.min(a, b), 
					Math.min(c,d)),Math.min(e, f)),
					Math.min(Math.min(g, h),Math.min(i, j)));
			if(m==g)g=Math.min(Math.min(Math.min(Math.min(a, b), 
					Math.min(c,d)),Math.min(e, f)),
					Math.min(Math.min(g, h),Math.min(i, j)));
			if(m==h)h=Math.min(Math.min(Math.min(Math.min(a, b), 
					Math.min(c,d)),Math.min(e, f)),
					Math.min(Math.min(g, h),Math.min(i, j)));
			if(m==i)i=Math.min(Math.min(Math.min(Math.min(a, b), 
					Math.min(c,d)),Math.min(e, f)),
					Math.min(Math.min(g, h),Math.min(i, j)));
			if(m==j)j=Math.min(Math.min(Math.min(Math.min(a, b), 
					Math.min(c,d)),Math.min(e, f)),
					Math.min(Math.min(g, h),Math.min(i, j)));
			s=Math.max(Math.max(Math.max(Math.max(a, b), 
					Math.max(c,d)),Math.max(e, f)),
					Math.max(Math.max(g, h),Math.max(i, j)));
			System.out.println(m+" "+s);
		}
cin.close();
	}

}
