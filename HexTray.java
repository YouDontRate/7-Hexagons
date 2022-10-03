class HexTray
{   
   private final int MAX_PIECES = 7;
   private Hexagon gamePiece1;
   private Hexagon gamePiece2;
   private Hexagon gamePiece3;
   private Hexagon gamePiece4;
   private Hexagon gamePiece5;
   private Hexagon gamePiece6;
   private Hexagon gamePiece7;
   private Hexagon[] hexList;
   
//--------------------------------

   HexTray()
   {
      initialize();
      
   }// End constructor
   
//-------------------------------------

   private void initialize()
   { 
      hexList = new Hexagon[MAX_PIECES];
           
      gamePiece1 = new Hexagon(1, 'A', '1', '2', '3', '4', '5', '6');      
      gamePiece2 = new Hexagon(2, 'B', '1', '6', '2', '4', '5', '3');    
      gamePiece3 = new Hexagon(3, 'C', '1', '6', '5', '4', '3', '2');    
      gamePiece4 = new Hexagon(4, 'D', '1', '4', '3', '6', '5', '2');     
      gamePiece5 = new Hexagon(5, 'E', '1', '6', '5', '3', '2', '4');   
      gamePiece6 = new Hexagon(6, 'F', '1', '6', '4', '2', '5', '3');    
      gamePiece7 = new Hexagon(7, 'G', '1', '4', '6', '2', '3', '5');      
      
   }// End method

//---------------------------------------

   public void addPieceToTray(char piece, int position)
   {       
   
      char temp;   
   
      makeList();
      
      for (int i = 0; i < MAX_PIECES; i++)
      {
        temp = hexList[i].getHexCode();

        if (piece == temp)
        {
            hexList[i].setTrayPosition(position);
            hexList[i].setPreviousPosition(position);
        }// End if        
         
       }// End loop      
   
   }// End method

//---------------------------------------

   public void removePieceFromTray(char piece)
   { 
   
      char temp;   
   
      makeList();
      
      for (int i = 0; i < MAX_PIECES; i++)
      {
        temp = hexList[i].getHexCode();

        if (piece == temp)
            hexList[i].setTrayPosition(0);

       }// End loop       
       
          
   }// End method

//---------------------------------------

   public Hexagon getGamePiece(int piece)
   {
      Hexagon temp = null;
      
      switch(piece)
      {
         case 1:
         {
            temp = gamePiece1;
            break;
         }// End Case
         
         case 2:
         {
            temp = gamePiece2;
            break;
         }// End Case
         
         case 3:
         {
            temp = gamePiece3;
            break;
         }// End Case
         
         case 4:
         {
            temp = gamePiece4;
            break;
         }// End Case
         
         case 5:
         {
            temp = gamePiece5;
            break;
         }// End Case
         
         case 6:
         {
            temp = gamePiece6;
            break;
         }// End Case
         
         case 7:
         {
            temp = gamePiece7;
            break;
         }// End Case         
         
      }// End switch   
         
      return temp;
      
   }// End method

//---------------------------------------

   public void rotatePieceClockWise(char piece)
   { 
      char temp;   
   
      makeList();
      
      for (int i = 0; i < MAX_PIECES; i++)
      {
        temp = hexList[i].getHexCode();

        if (piece == temp)
            hexList[i].rotateClockWise();

       }// End loop        
   
   }// End method

//---------------------------------------

   public void rotatePieceCounterClockWise(char piece)
   {       
      char temp;   
   
      makeList();
      
      for (int i = 0; i < MAX_PIECES; i++)
      {
        temp = hexList[i].getHexCode();

        if (piece == temp)
            hexList[i].rotateCounterClockWise();

       }// End loop        
   
   }// End method
   
//-----------------------------------------------------   
 
 /*
 
   public void checkMove(char hexagon, int moveLocation)
   {
      Hexagon temp;
      int trayPosition;     
      char hexCode;
      char[] numbers;
      
      
      makeList();
      
      
      for (int i = 0; i < MAX_PIECES; i++)
      {
         temp = hexList[i];
         
         hexCode = temp.getHexCode();
         
         if (hexCode == hexagon)
         {
         
            //for (int j = 0; j < )
         
         }// End if
         
         
      }// End loop
      
      
      switch(moveLocation)
      {
         case 1:
         {
            for (int i = 0; i < MAX_PIECES; i++)
            {
               temp = hexList[i];
               
               trayPosition = temp.getTrayPosition();
               
               if (trayPosition == 6)
               {
               
                  
               
               }// End if
               
               
            }// End loop
            
            
            
            break;
         }// End Case
         
         case 2:
         {
            
            break;
         }// End Case
         
         case 3:
         {
            
            break;
         }// End Case
         
         case 4:
         {
            
            break;
         }// End Case
         
         case 5:
         {
            
            break;
         }// End Case
         
         case 6:
         {
            
            break;
         }// End Case
         
         case 7:
         {
            
            break;
         }// End Case 
                 
         
      }// End switch
      
   
   
   }// End method

*/

//--------------------------------------

   private void makeList()
   {
      hexList[0] = gamePiece1;
      hexList[1] = gamePiece2;
      hexList[2] = gamePiece3;
      hexList[3] = gamePiece4;
      hexList[4] = gamePiece5;
      hexList[5] = gamePiece6;
      hexList[6] = gamePiece7;
   
   }// End method
   

}// End class
