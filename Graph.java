//package GraphStuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Graph {

    public static void main(String args[]) throws FileNotFoundException {

        if(args.length== 1){
            int count=0;
            File graphInput = new File(args[0]);

            Scanner scan = new Scanner(graphInput);



            if(!scan.hasNextLine()){
                System.out.println("empty file");
                return;
            }
                String line = scan.nextLine();
                String[] spaces = line.split(" ");
                int[][] graph = new int[spaces.length][spaces.length];
                for(int x=0;x<spaces.length;x++){
                    graph[x][0]=Integer.parseInt(spaces[x]);
                }
                count=1;


            while(scan.hasNextLine()){
                 line = scan.nextLine();
                 spaces = line.split(" ");
                for(int x=0;x<spaces.length;x++){
                    graph[x][count]=Integer.parseInt(spaces[x]);
                }
                count++;
            }
           for(int x=0;x<5;x++){
               System.out.print("[");
               for(int y=0;y<5;y++){
                   System.out.print(graph[x][y]);
                   if(y!=4){
                       System.out.print(",");
                   }
               }
               System.out.print("]");
               System.out.println();

           }
        }





    }
}
