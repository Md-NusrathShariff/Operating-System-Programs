import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give pages string: ");
        String s = sc.next();
        char[] arr = s.toCharArray();
        char[] FS = new char[3];

        int k = 0, pf = 0;
        for(int i = 0; i<arr.length; i++)
        {
            int count = 0;
            for(int j = 0; j<FS.length; j++)
            {
                if(arr[i]==FS[j]) count++;
            }
            if(count>0)
            {
                for(int l = 0; l<FS.length; l++) System.out.print(FS[l]+" ");
                System.out.println();
            }
            if(count==0)
            {
                FS[k] = arr[i];
                k++;
                if(k==(3)) k = 0;
                for(int l = 0; l<FS.length; l++) System.out.print(FS[l]+" ");
                System.out.println();
                pf++;
            }
        }
        System.out.println("Page faults count: "+(pf-3));
    }}
