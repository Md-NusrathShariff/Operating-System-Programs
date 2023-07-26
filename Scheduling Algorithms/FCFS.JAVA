import java.util.Scanner;
public class FCFS
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total process: ");
        int n = sc.nextInt();
        int[] P = new int[n];
        for(int i = 0; i<n; i++)
        {
            System.out.print("P"+(i+1)+" Burst time: ");
            P[i] = sc.nextInt();
        }

        //waiting time
        int wait=0;
        int[] w = new int[n];
        for(int i = 0; i<n-1; i++)
        {
            wait = wait + P[i];
            w[i+1] = wait;
        }

        //Turnaround time
        int turn = 0;
        int[] t = new int[n];
        for(int i = 0; i<n; i++)
        {
            turn = turn + P[i];
            t[i] = turn;
        }

        System.out.println("Process "+ "Burst-Time "+" Waiting-Time "+" Turnaround-Time");
        for(int i  =0; i<n; i++)System.out.println("P"+(i+1)+"\t\t\t"+P[i]+"\t\t\t"+w[i]+"\t\t\t\t"+t[i]);

        //Printing AWT, ATAT
        wait = 0; turn = 0;
        for(int i = 0; i<n; i++) wait = wait + w[i];
        for(int i = 0; i<n; i++) turn = wait+ t[i];
        System.out.println("Average waiting time: "+(wait/n));
        System.out.println("Average Turn around time: "+(float)(turn/n));
    }}
