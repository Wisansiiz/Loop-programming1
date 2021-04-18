import java.util.*;
class MainH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){
			n=cin.nextInt();
			int end;
			end=n%7;
			if(end==0)end=7;
			System.out.println(end);
		}
       cin.close();
	}

}
