class TrayPositions
{
   private final int POSITIONS = 7;
   private final int POSITION_LENGTH = 2;
   private int[][] position1;
   private int[][] position2;
   private int[][] position3;
   private int[][] position4;
   private int[][] position5;
   private int[][] position6;
   private int[][] position7;

//---------------------------------------

   TrayPositions()
   {
      setPositions();
      
   }// End constructor

//-------------------------------------------------------

   public int[][] getPositions(int position)
   {
      int[][] temp = null;
      
      switch(position)
      {
         case 1:
         {
            temp = position1;
            break;
         }// End Case
         
         case 2:
         {
            temp = position2;
            break;
         }// End Case
         
         case 3:
         {
            temp = position3;
            break;
         }// End Case
         
         case 4:
         {
            temp = position4;
            break;
         }// End Case
         
         case 5:
         {
            temp = position5;
            break;
         }// End Case
         
         case 6:
         {
            temp = position6;
            break;
         }// End Case
         
         case 7:
         {
            temp = position7;
            break;
         }// End Case
         
         
      }// End switch
      
      return temp;
      
   }// End method

//-------------------------------------------------------

   private void setPositions()
   {
   
      /*
         The number ranges are very specific for the display. 
         Each value represents a row and column on the tray.
         The row and column values are for each number in each hexagon and also the center value
         In V2 I will clean this method up and make it more readable.
      */   
   
      position1 = new int[POSITIONS][POSITION_LENGTH];
      position2 = new int[POSITIONS][POSITION_LENGTH];
      position3 = new int[POSITIONS][POSITION_LENGTH];
      position4 = new int[POSITIONS][POSITION_LENGTH];
      position5 = new int[POSITIONS][POSITION_LENGTH];
      position6 = new int[POSITIONS][POSITION_LENGTH];
      position7 = new int[POSITIONS][POSITION_LENGTH];
      
      position1[0][0] = 2;
      position1[0][1] = 21;
            
      position1[1][0] = 3;
      position1[1][1] = 25; 
           
      position1[2][0] = 5;
      position1[2][1] = 25;
            
      position1[3][0] = 4;
      position1[3][1] = 21; 
           
      position1[4][0] = 6;
      position1[4][1] = 21; 
           
      position1[5][0] = 5;
      position1[5][1] = 17; 
           
      position1[6][0] = 3;
      position1[6][1] = 17;
      
      
      position2[0][0] = 5;
      position2[0][1] = 31;
            
      position2[1][0] = 6;
      position2[1][1] = 35; 
           
      position2[2][0] = 8;
      position2[2][1] = 34;
            
      position2[3][0] = 6;
      position2[3][1] = 31; 
           
      position2[4][0] = 8;
      position2[4][1] = 31; 
           
      position2[5][0] = 8;
      position2[5][1] = 28; 
           
      position2[6][0] = 6;
      position2[6][1] = 27;
      
      
      position3[0][0] = 10;
      position3[0][1] = 31;
            
      position3[1][0] = 11;
      position3[1][1] = 35; 
           
      position3[2][0] = 13;
      position3[2][1] = 34;
            
      position3[3][0] = 11;
      position3[3][1] = 31; 
           
      position3[4][0] = 13;
      position3[4][1] = 31; 
           
      position3[5][0] = 13;
      position3[5][1] = 28; 
           
      position3[6][0] = 11;
      position3[6][1] = 27;
   
   
      position4[0][0] = 12;
      position4[0][1] = 21;
            
      position4[1][0] = 13;
      position4[1][1] = 25; 
           
      position4[2][0] = 15;
      position4[2][1] = 25;
            
      position4[3][0] = 14;
      position4[3][1] = 21; 
           
      position4[4][0] = 16;
      position4[4][1] = 21; 
           
      position4[5][0] = 15;
      position4[5][1] = 17; 
           
      position4[6][0] = 13;
      position4[6][1] = 17;
      
   
      position5[0][0] = 10;
      position5[0][1] = 11;
            
      position5[1][0] = 11;
      position5[1][1] = 15; 
           
      position5[2][0] = 13;
      position5[2][1] = 14;
            
      position5[3][0] = 11;
      position5[3][1] = 11; 
           
      position5[4][0] = 13;
      position5[4][1] = 11; 
           
      position5[5][0] = 13;
      position5[5][1] = 8;
   
      position5[6][0] = 11;
      position5[6][1] = 8;
    
      
      position6[0][0] = 5;
      position6[0][1] = 11;
            
      position6[1][0] = 6;
      position6[1][1] = 15; 
           
      position6[2][0] = 8;
      position6[2][1] = 14;
            
      position6[3][0] = 6;
      position6[3][1] = 11; 
           
      position6[4][0] = 8;
      position6[4][1] = 11; 
           
      position6[5][0] = 8;
      position6[5][1] = 8; 
           
      position6[6][0] = 6;
      position6[6][1] = 8;
   
   
      position7[0][0] = 7;
      position7[0][1] = 21;
            
      position7[1][0] = 8;
      position7[1][1] = 25; 
           
      position7[2][0] = 10;
      position7[2][1] = 25;
            
      position7[3][0] = 9;
      position7[3][1] = 21; 
           
      position7[4][0] = 11;
      position7[4][1] = 21; 
           
      position7[5][0] = 10;
      position7[5][1] = 17; 
           
      position7[6][0] = 8;
      position7[6][1] = 17;   
   
   }// End method



}// End class


/*
pos1
   number1 = [2][21];
   number2 = [3][25];     
   number3 = [5][25];     
   center = [4][21];
   number4 = [6][21];     
   number5 = [5][17];   
   number6 = [3][17];    
   

pos2
   number1 [5][31];
   number2 [6][35];     
   number3 [8][34];     
   center [6][31];
   number4 [8][31];     
   number5 [8][28];   
   number6 [6][27];

pos3
   number1 [10][31];
   number2 [11][35];     
   number3 [13][34];     
   center [11][31];
   number4 [13][31];     
   number5 [13][28];   
   number6 [11][27];

pos4
   number1 = [12][21];
   number2 = [13][25];     
   number3 = [15][25];     
   center = [14][21];
   number4 = [17][21];     
   number5 = [15][17];   
   number6 = [13][17];

pos5
   number1 = [10][11];
   number2 = [11][15];     
   number3 = [13][14];     
   center = [11][11];
   number4 = [13][11];     
   number5 = [13][8];   
   number6 = [11][8];

pos6
   number1 [5][11];
   number2 [6][15];     
   number3 [8][14];     
   center [6][11];
   number4 [8][11];     
   number5 [8][8];   
   number6 [6][8];

pos7   
   number1 = [7][21];
   number2 = [8][25];     
   number3 = [10][25];     
   center = [9][21];
   number4 = [11][21];     
   number5 = [10][17];   
   number6 = [8][17];

*/

