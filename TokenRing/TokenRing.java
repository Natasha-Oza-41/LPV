package TokenRing;

import java.util.Scanner;

public class TokenRing {
    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of nodes in the token ring : \n ");
        int n = sc.nextInt();

        int nodes[] = new int[n + 1];

        //Create Ring

        for (int i = 0 ; i < n ; i++){
            nodes[i] = i ;
        }
        nodes[n] = 0;

        //Display Ring

        for (int i = 0 ; i < n ; i++){
            System.out.println("\n" +nodes[i] + " --> \n");
        }
        System.out.println(nodes[n]);

        int choice = 1;
        while (choice == 1){

            System.out.println("Enter Sender Node Number: \n");
            int Sender = sc.nextInt();

            System.out.println("Enter Receiver Node Number: \n");
            int Receiver = sc.nextInt();

            System.out.println("Enter Data: \n");
            int Data = sc.nextInt();

            int token = Sender;

            //Token Passing 

            System.out.println("Token is passing :  \n");

            while(token != Receiver){
                System.out.println("Token is at Node \n" + token);
                token =(token + 1) % n;
            }

            //send data

            System.out.println("\n Sender " + Sender + " is sending data  " + Data + " to Receiver " + Receiver);

            System.out.println("\n Data " + Data + " is received at Node " + Receiver);

                System.out.println("\n Do you want to continue ? (0/1) : ");
                choice = sc.nextInt();

        }
    }
}