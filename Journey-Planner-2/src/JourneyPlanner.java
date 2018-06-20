import java.io.*;        
import java.util.Scanner;
import java.io.FileReader;


public class JourneyPlanner {
	   public static void main(String args[]) throws IOException
	   {
		   
	int choice = '0';
	char quit = 'n';
	String input;
	Scanner scan = new Scanner(System.in);
	
	while (quit != 'y') {
	String mainMenu = ("Main Menu"
			+ "\n [1] View Journey Data"
			+ "\n [2] Identify Suitable Journeys"
			+ "\n [3] Quit \n");
	
	
	System.out.println(mainMenu);		
	
	choice = scan.nextInt();
	System.out.println("\n");
	
	
	
	
	switch (choice)  {

	
	case 1:
		Scanner inFile = new Scanner(new FileReader("input.txt"));
        while(inFile.hasNext())
        {
        	String a = inFile.nextLine();
        	System.out.println(a);
        	
        	}
        
        System.out.println("\n");
        System.out.println("\n");
        break;
        
        
	case 2:
		
		Scanner S = new Scanner(System.in);
		
		
		int mins;
		int hr;
		int totalmins;
		int changes;
		int totalInputHr;
		

		System.out.println("Please enter a destination");
		String location = S.nextLine();


		System.out.println("Please enter a max time period in HH:MM format.");
		String time = S.next ();
		
		
		int colon = time.indexOf(':');
		
	
		hr = Integer.parseInt(time.substring(0, colon));
		mins = Integer.parseInt(time.substring(colon + 1, time.length()));
		
		System.out.println("Please enter a max number of changes.");		
		changes = S.nextInt();
		
		totalmins = hr * 60 + mins;
		
		System.out.println("\nSpecify Destination:  " + location);
		System.out.println("Specify Max Time (HH:MM):  " + time);
		System.out.println("Specify Max changes:  " + changes);
		
		
		final Scanner INPUT = new Scanner(new FileReader("input.txt"));
		System.out.println();
		
		String locate;
		String locate2;
		
		locate = INPUT.nextLine();  
		int inputchange = INPUT.nextInt();
		int inputmins = INPUT.nextInt();
		int inputmins2 = INPUT.nextInt();
		locate2 = INPUT.nextLine();
		int inputchange2 = INPUT.nextInt();
		int inputmins3 = INPUT.nextInt();
		
		
		int t = inputmins + inputmins2;
		
		
		
        if ((t > totalmins) || ((inputchange > changes)) && (locate.equals("York"))) {
            System.out.format("Time: %02d:%02d, Changes: %d = Unsuitable \n", (t / 60), (t % 60), inputchange);
        }
        else {
        	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        	String lineFromInput = in.readLine();
        	 PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        	  out.println(lineFromInput);
            System.out.format("Time: %02d:%02d, Changes: %d = Suitable \n", (t / 60), (t % 60), inputchange);
            
            
        if ((inputmins3 > totalmins) || ((inputchange2 > changes)) && (locate2.equals("Alnwick"))) {
            System.out.format("Time: %02d:%02d, Changes: %d = Unsuitable \n", (inputmins3 / 60), (inputmins3 % 60), inputchange2);
        }
            out.close();
        }
     
        System.out.println("\n");
        System.out.println("\n");
	default:
    break; 
		

	  case 3:
		  
          System.out.println("Quitting.");
          System.exit(0);
          break;
	}}}}
		

		
		

	
	
	   

