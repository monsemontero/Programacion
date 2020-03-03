
public class Operacion{
	public static void test (int x, int y){
		int a[]=new int[x];
		for (int i=0; i<y;i++){
			a[i]=i;
			int r=a[i]/0;
		}
	}
	public static void main(String args[]){
		test (10,25);
	}
}