import java.util.Scanner;

class Controller
{  
   private HexTray gameTray;
   private Display myDisplay;
   
//-------------------------------------

   Controller()
   {
      gameTray = new HexTray();
      myDisplay = new Display();
   
   }// End controller
   
//---------------------------------------------

   public void startGame()
   {
      String dummy;
      char userInput;
      char hexagon;
      int trayLocation;
      Scanner keyboard = new Scanner(System.in);
      
      myDisplay.showTray(gameTray);
      myDisplay.showBag(gameTray);
      
      System.out.println();
      System.out.println();
      
      menu();
      System.out.print("Make a selection or press 0 to exit >> ");
      userInput = keyboard.nextLine().charAt(0);
      
      while (userInput != '0')
      {
         
         switch(userInput)
         {
            case '1':
            {
               System.out.print("Enter the letter of the hexagon >> ");
               hexagon = keyboard.nextLine().charAt(0);
               
               System.out.print("Enter the tray position >> ");
               trayLocation = keyboard.nextInt();
               
               dummy = keyboard.nextLine();
               
               gameTray.addPieceToTray(hexagon, trayLocation);
               
               break;
            }// End Case
            
            case '2':
            {
               System.out.print("Enter the letter of the hexagon >> ");
               hexagon = keyboard.nextLine().charAt(0);
               
               gameTray.removePieceFromTray(hexagon);
               
               break;
            }// End Case
            
            case '3':
            {
               System.out.print("Enter the letter of the hexagon >> ");
               hexagon = keyboard.nextLine().charAt(0);
               
               gameTray.rotatePieceClockWise(hexagon);
               
               break;
            }// End Case
            
            case '4':
            {
               System.out.print("Enter the letter of the hexagon >> ");
               hexagon = keyboard.nextLine().charAt(0);
               
               gameTray.rotatePieceCounterClockWise(hexagon);
               
               break;
            }// End Case
            
            default:
            {
               System.out.println("Invalid choice");
            }
         
         
         }// End switch
         
         myDisplay.showTray(gameTray);
         myDisplay.showBag(gameTray);
         
         System.out.println();
         System.out.println();         
         
         menu();
         System.out.print("Make a selection or press 0 to exit >> ");
         userInput = keyboard.nextLine().charAt(0);        
      
      }// End while     
   
   }// End method
   
//---------------------------------------

   private void menu()
   {
      System.out.println("Press 1 to add a hexagon to the tray");
      System.out.println("Press 2 to remove a hexagon from the tray");
      System.out.println("Press 3 to rotate a hexagon clockwise");
      System.out.println("Press 4 to rotate a hexagon counter clockwise");
   
   }// End method




}// End class
