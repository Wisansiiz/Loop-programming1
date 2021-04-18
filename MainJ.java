import java.util.Scanner;
class MainJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n,m;
		int min=10000;
		Scanner cin = new Scanner (System.in);
		n=cin.nextInt();
		while(i<=n&&cin.hasNext()){
			m=cin.nextInt();
			int l=1;
			while(l<=m&&cin.hasNext()){
				min=Math.min(min, cin.nextInt());
				l++;
			}
			System.out.println(min);
			i++;
		}
		cin.close();
	}

}