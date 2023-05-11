import java.util.*;
class RoundRobin{


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("[?]Enter number of processos :");
		int numOfProcess=sc.nextInt();
		String[] id=new String[numOfProcess];
		int[] burstTime=new int[numOfProcess];
		int[] ct=new int[numOfProcess];
		int[] tat=new int[numOfProcess];
		int[] wt=new int[numOfProcess];
		


		for(int i=0;i<numOfProcess;i++){
			sc.nextLine();
			System.out.println("-------------Process "+(i+1)+"------------");
			System.out.print("[?]Process Id :");
			id[i]=sc.nextLine();
			System.out.print("[?]Burst time :");
			runTime[i]=sc.nextInt();
		}

		while(!completed){
			
		}

		
	}
}