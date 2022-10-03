class Display
{
   private final int MAX_GAME_PIECES = 7;
   private final int MAX_NUMBERS = 6;
   private final int MAX_ROWS = 19;
   private final int MAX_COLUMNS = 41;
   private final int BAG_LENGTH = 91;
   private final int CENTER = 3;   
   private char[][] tray; 
   private char[][] bag;     
   
//-----------------------------------------

   Display()
   {
      createTray();
      createBag();      
      
   }// End constructor

//-----------------------------------------

   public void showTray(HexTray gameTray)
   {
      Hexagon temp;
      int trayPosition;
      int previousPosition;
      
      for(int i = 0; i < MAX_GAME_PIECES; i++)
      {         
         temp = gameTray.getGamePiece(i+1);         
         trayPosition = temp.getTrayPosition();
         previousPosition = temp.getPreviousPosition();
         
         if (trayPosition == 0 && previousPosition != 0)
            removePiece(temp);         
         
      }// End for loop      
           
      tray[4][21] = '1';
      tray[6][31] = '2';
      tray[11][31] = '3';      
      tray[14][21] = '4';                
      tray[11][11] = '5';          
      tray[6][11] = '6';  
      tray[9][21] = '7';     
      
      for(int i = 0; i < MAX_GAME_PIECES; i++)
      {         
         temp = gameTray.getGamePiece(i+1);         
         trayPosition = temp.getTrayPosition();
         
         if (trayPosition != 0)
            addPiece(temp);         
         
      }// End for loop       
   
      for(int i = 0; i < MAX_ROWS; i++)
      {
         System.out.println();
         
         for(int j = 0; j < MAX_COLUMNS; j++)         
            System.out.print(tray[i][j]);         
      
      }// End outer loop       
      
   }// End method
   
//-------------------------------------------------------

   public void showBag(HexTray gameTray)
   {      
      Hexagon temp;
      int trayPosition;
      
      for(int i = 0; i < MAX_GAME_PIECES; i++)
      {         
         temp = gameTray.getGamePiece(i+1);         
         trayPosition = temp.getTrayPosition();        
         
         if (trayPosition != 0)
            removeFromBag(temp);         
         
      }// End for loop     
      
      bag[3][6] = '1';
      bag[3][19] = '2';     
      bag[3][32] = '3';     
      bag[3][45] = '4';
      bag[3][58] = '5';     
      bag[3][71] = '6';   
      bag[3][84] = '7';          
      
      for(int i = 0; i < MAX_GAME_PIECES; i++)
      {         
         temp = gameTray.getGamePiece(i+1);         
         trayPosition = temp.getTrayPosition();        
         
         if (trayPosition == 0)
            addToBag(temp);         
         
      }// End for loop       
      
      for(int i = 0; i < MAX_NUMBERS; i++)
      {
         System.out.println();
         
         for(int j = 0; j < BAG_LENGTH; j++)         
            System.out.print(bag[i][j]);         
      
      }// End outer loop      
      
   }// End method

//------------------------------------------------

   private void addToBag(Hexagon piece)
   {      
      int bagPosition = 0;
      int row;
      int column;
      char[] numbers;
      int[][] tempPositions;
      BagPositions bagPositions;
      
      numbers = new char[MAX_GAME_PIECES];
      bagPositions = new BagPositions();      
      
      bagPosition = piece.getBagPosition();
      
      tempPositions = bagPositions.getBagPositions(bagPosition);                  
      
      for(int i = 0; i < MAX_GAME_PIECES; i++)
      {
         row = tempPositions[i][0];
         column = tempPositions[i][1];   
         
         if (i == CENTER)         
            numbers[i] = piece.getHexCode();
         
         else
            numbers[i] = piece.getNumber(i);        
         
         bag[row][column] = numbers[i];
         
      }// End loop        
   
   }// End method

//------------------------------------------------

   private void removeFromBag(Hexagon piece)
   {
      char[] numbers;      
      int bagPosition;
      int row;
      int column;
      int[][] tempPositions;
      BagPositions bagPositions;
      
      numbers = new char[MAX_GAME_PIECES];
      bagPositions = new BagPositions();
      
      bagPosition = piece.getBagPosition();
      
      tempPositions = bagPositions.getBagPositions(bagPosition);                  
      
      for(int i = 0; i < MAX_GAME_PIECES; i++)
      {
         row = tempPositions[i][0];
         column = tempPositions[i][1];                 
         
         bag[row][column] = numbers[i];
         
      }// End loop     
   
   }// End method

//-------------------------------------------

   private void addPiece(Hexagon piece)
   {           
      int trayPosition;
      int row;
      int column;
      char[] numbers;
      int[][] tempPositions;
      TrayPositions numberLocations;
      
      numbers = new char[MAX_GAME_PIECES];
      numberLocations = new TrayPositions();
      
      trayPosition = piece.getTrayPosition();
      
      tempPositions = numberLocations.getPositions(trayPosition);                  
      
      for(int i = 0; i < MAX_GAME_PIECES; i++)
      {
         row = tempPositions[i][0];
         column = tempPositions[i][1];   
         
         if (i == CENTER)         
            numbers[i] = piece.getHexCode();
         
         else
            numbers[i] = piece.getNumber(i);        
         
         tray[row][column] = numbers[i];
         
      }// End loop        
   
   }// End method

//-------------------------------------------------------

   private void removePiece(Hexagon piece)
   {
      char[] numbers;      
      int trayPosition;
      int row;
      int column;
      int[][] tempPositions;
      TrayPositions numberLocations;
      
      numbers = new char[MAX_GAME_PIECES];
      numberLocations = new TrayPositions();
      
      trayPosition = piece.getPreviousPosition();
      
      tempPositions = numberLocations.getPositions(trayPosition);                  
      
      for(int i = 0; i < MAX_GAME_PIECES; i++)
      {
         row = tempPositions[i][0];
         column = tempPositions[i][1];                 
         
         tray[row][column] = numbers[i];
         
      }// End loop     
   
   }// End method

//-------------------------------------------------------

   private void createBag()
   {
      /*
         The number ranges are very specific for the display. 
         Each foor loop assigns a char value to an index in the array for the display.         
         In V2 I will clean this method up and make it more readable.
      */   
   
      bag = new char[MAX_NUMBERS][BAG_LENGTH];
      
      for(int j = 3; j < 10; j++)         
         bag[0][j] = '_';
      
      for(int j = 3; j < 10; j++)         
         bag[5][j] = '_';
         
      for(int j = 16; j < 23; j++)         
         bag[0][j] = '_';
      
      for(int j = 16; j < 23; j++)         
         bag[5][j] = '_';
         
      for(int j = 29; j < 36; j++)         
         bag[0][j] = '_';
      
      for(int j = 29; j < 36; j++)         
         bag[5][j] = '_';
      
      for(int j = 42; j < 49; j++)         
         bag[0][j] = '_';
      
      for(int j = 42; j < 49; j++)         
         bag[5][j] = '_';
      
      for(int j = 55; j < 62; j++)         
         bag[0][j] = '_';
      
      for(int j = 55; j < 62; j++)         
         bag[5][j] = '_';
      
      for(int j = 68; j < 75; j++)         
         bag[0][j] = '_';
      
      for(int j = 68; j < 75; j++)         
         bag[5][j] = '_';
      
      for(int j = 81; j < 88; j++)         
         bag[0][j] = '_';
      
      for(int j = 81; j < 88; j++)         
         bag[5][j] = '_';   
      
      
      bag[1][2] = '/';
      bag[2][1] = '/';
      bag[3][0] = '(';
      bag[4][1] = '\\';
      bag[5][2] = '\\';      
      
      bag[1][10] = '\\';
      bag[2][11] = '\\';
      bag[3][12] = ')';
      bag[4][11] = '/';
      bag[5][10] = '/';
      
      
      bag[1][15] = '/';
      bag[2][14] = '/';
      bag[3][13] = '(';
      bag[4][14] = '\\';
      bag[5][15] = '\\';
      
      bag[1][23] = '\\';
      bag[2][24] = '\\';
      bag[3][25] = ')';
      bag[4][24] = '/';
      bag[5][23] = '/';
      
      
      bag[1][28] = '/';
      bag[2][27] = '/';
      bag[3][26] = '(';
      bag[4][27] = '\\';
      bag[5][28] = '\\';
      
      bag[1][36] = '\\';
      bag[2][37] = '\\';
      bag[3][38] = ')';
      bag[4][37] = '/';
      bag[5][36] = '/';
      
      
      bag[1][41] = '/';
      bag[2][40] = '/';
      bag[3][39] = '(';
      bag[4][40] = '\\';
      bag[5][41] = '\\';
      
      bag[1][49] = '\\';
      bag[2][50] = '\\';
      bag[3][51] = ')';
      bag[4][50] = '/';
      bag[5][49] = '/';
      
      
      bag[1][54] = '/';
      bag[2][53] = '/';
      bag[3][52] = '(';
      bag[4][53] = '\\';
      bag[5][54] = '\\';
      
      bag[1][62] = '\\';
      bag[2][63] = '\\';
      bag[3][64] = ')';
      bag[4][63] = '/';
      bag[5][62] = '/';
      
      
      bag[1][67] = '/';
      bag[2][66] = '/';
      bag[3][65] = '(';
      bag[4][66] = '\\';
      bag[5][67] = '\\';
      
      bag[1][75] = '\\';
      bag[2][76] = '\\';
      bag[3][77] = ')';
      bag[4][76] = '/';
      bag[5][75] = '/';
      
      
      bag[1][80] = '/';
      bag[2][79] = '/';
      bag[3][78] = '(';
      bag[4][79] = '\\';
      bag[5][80] = '\\';
      
      bag[1][88] = '\\';
      bag[2][89] = '\\';
      bag[3][90] = ')';
      bag[4][89] = '/';
      bag[5][88] = '/';
      
      
   }// End method      

//-----------------------------------------------------

   private void createTray()
   {
      
      /*
         The number ranges are very specific for the display. 
         Each foor loop assigns a char value to an index in the array for the display.
         The value 39 on line 269 is the ascii value for an apostrophe
         In V2 I will clean this method up and make it more readable.
      */
      
      
      tray = new char[MAX_ROWS][MAX_COLUMNS];            
              
      for(int j = 9; j < 33; j++)         
         tray[0][j] = '=';
         
      for(int j = 18; j < 25; j++)         
         tray[1][j] = '_';
         
      for(int j = 8; j < 15; j++)         
         tray[4][j] = '-';
      
      for(int j = 28; j < 35; j++)         
         tray[4][j] = '-';
      
      for(int j = 18; j < 25; j++)         
         tray[6][j] = '_';
      
      for(int j = 8; j < 15; j++)         
         tray[9][j] = '-';
      
      for(int j = 28; j < 35; j++)         
         tray[9][j] = '-';
      
      for(int j = 18; j < 25; j++)         
         tray[11][j] = '_';
      
      for(int j = 8; j < 15; j++)         
         tray[14][j] = '-';
      
      for(int j = 28; j < 35; j++)         
         tray[14][j] = '-';
      
      for(int j = 18; j < 25; j++)         
         tray[16][j] = '_';
      
      for(int j = 9; j < 33; j++)         
         tray[18][j] = '=';      
         
      tray[1][7] = '/';  
      tray[1][34] = '\\';   
      
      tray[2][6] = '/';  
      tray[2][17] = '/';
      tray[2][25] = '\\';  
      tray[2][35] = '\\';
      
      tray[3][5] = '/';  
      tray[3][16] = '/';
      tray[3][26] = '\\';  
      tray[3][36] = '\\';
      
      tray[4][4] = '/';  
      tray[4][7] = ',';
      tray[4][15] = '(';
      tray[4][27] = ')';
      tray[4][35] = '.';
      tray[4][37] = '\\';
      
      tray[5][3] = '/';  
      tray[5][6] = '/';
      tray[5][16] = '\\';
      tray[5][26] = '/';
      tray[5][36] = '\\';
      tray[5][38] = '\\';
      
      tray[6][2] = '/';  
      tray[6][5] = '/';
      tray[6][17] = '\\';
      tray[6][25] = '/';
      tray[6][37] = '\\';
      tray[6][39] = '\\';
      
      tray[7][1] = '|';  
      tray[7][5] = '\\';
      tray[7][17] = '/';
      tray[7][25] = '\\';
      tray[7][37] = '/';
      tray[7][40] = '|';
      
      tray[8][1] = '|';  
      tray[8][6] = '\\';
      tray[8][16] = '/';
      tray[8][26] = '\\';
      tray[8][36] = '/';
      tray[8][40] = '|';
      
      tray[9][1] = '|';  
      tray[9][7] = ')';
      tray[9][15] = '(';
      tray[9][27] = ')';
      tray[9][35] = '(';
      tray[9][40] = '|';
      
      tray[10][1] = '|';  
      tray[10][6] = '/';
      tray[10][16] = '\\';
      tray[10][26] = '/';
      tray[10][36] = '\\';
      tray[10][40] = '|';
      
      tray[11][1] = '|';  
      tray[11][5] = '/';
      tray[11][17] = '\\';
      tray[11][25] = '/';
      tray[11][37] = '\\';
      tray[11][40] = '|';
      
      tray[12][2] = '\\';  
      tray[12][5] = '\\';
      tray[12][17] = '/';
      tray[12][25] = '\\';
      tray[12][37] = '/';
      tray[12][39] = '/';
      
      tray[13][3] = '\\';  
      tray[13][6] = '\\';
      tray[13][16] = '/';
      tray[13][26] = '\\';
      tray[13][36] = '/';
      tray[13][38] = '/';
      
      tray[14][4] = '\\';  
      tray[14][7] = '`';
      tray[14][15] = '(';
      tray[14][27] = ')';
      tray[14][35] = 39;       // 39 is the ascii value for an apostrophe.
      tray[14][37] = '/';
      
      tray[15][5] = '\\';  
      tray[15][16] = '\\';
      tray[15][26] = '/';  
      tray[15][36] = '/';
      
      tray[16][6] = '\\';  
      tray[16][17] = '\\';
      tray[16][25] = '/';  
      tray[16][35] = '/';
      
      tray[17][7] = '\\';  
      tray[17][34] = '/';      
   
   }// End method




}// End class

