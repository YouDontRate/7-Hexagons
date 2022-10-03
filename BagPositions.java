class BagPositions
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
   
//----------------------------------------------

   BagPositions()
   {
      makePositions();
   }// End constructor
   
//--------------------------------------------

   public int[][] getBagPositions(int position)
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

//----------------------------------------------

   private void makePositions()
   {
       /*
         The number ranges are very specific for the display. 
         Each value represents a row and column in the bag.
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
      
      position1[0][0] = 1;
      position1[0][1] = 6;
            
      position1[1][0] = 2;
      position1[1][1] = 10; 
           
      position1[2][0] = 4;
      position1[2][1] = 10;
            
      position1[3][0] = 3;
      position1[3][1] = 6; 
           
      position1[4][0] = 5;
      position1[4][1] = 6; 
           
      position1[5][0] = 4;
      position1[5][1] = 2; 
           
      position1[6][0] = 2;
      position1[6][1] = 2;
      
      
      position2[0][0] = 1;
      position2[0][1] = 19;
            
      position2[1][0] = 2;
      position2[1][1] = 23; 
           
      position2[2][0] = 4;
      position2[2][1] = 23;
            
      position2[3][0] = 3;
      position2[3][1] = 19; 
           
      position2[4][0] = 5;
      position2[4][1] = 19; 
           
      position2[5][0] = 4;
      position2[5][1] = 15; 
           
      position2[6][0] = 2;
      position2[6][1] = 15;
      
      
      position3[0][0] = 1;
      position3[0][1] = 32;
            
      position3[1][0] = 2;
      position3[1][1] = 36; 
           
      position3[2][0] = 4;
      position3[2][1] = 36;
            
      position3[3][0] = 3;
      position3[3][1] = 32; 
           
      position3[4][0] = 5;
      position3[4][1] = 32; 
           
      position3[5][0] = 4;
      position3[5][1] = 28; 
           
      position3[6][0] = 2;
      position3[6][1] = 28;
      
      
      position4[0][0] = 1;
      position4[0][1] = 45;
            
      position4[1][0] = 2;
      position4[1][1] = 49; 
           
      position4[2][0] = 4;
      position4[2][1] = 49;
            
      position4[3][0] = 3;
      position4[3][1] = 45; 
           
      position4[4][0] = 5;
      position4[4][1] = 45; 
           
      position4[5][0] = 4;
      position4[5][1] = 41; 
           
      position4[6][0] = 2;
      position4[6][1] = 41;
      
      
      position5[0][0] = 1;
      position5[0][1] = 58;
            
      position5[1][0] = 2;
      position5[1][1] = 62; 
           
      position5[2][0] = 4;
      position5[2][1] = 62;
            
      position5[3][0] = 3;
      position5[3][1] = 58; 
           
      position5[4][0] = 5;
      position5[4][1] = 58; 
           
      position5[5][0] = 4;
      position5[5][1] = 54; 
           
      position5[6][0] = 2;
      position5[6][1] = 54;
      
      
      position6[0][0] = 1;
      position6[0][1] = 71;
            
      position6[1][0] = 2;
      position6[1][1] = 75; 
           
      position6[2][0] = 4;
      position6[2][1] = 75;
            
      position6[3][0] = 3;
      position6[3][1] = 71; 
           
      position6[4][0] = 5;
      position6[4][1] = 71; 
           
      position6[5][0] = 4;
      position6[5][1] = 67; 
           
      position6[6][0] = 2;
      position6[6][1] = 67;
      
      
      position7[0][0] = 1;
      position7[0][1] = 84;
            
      position7[1][0] = 2;
      position7[1][1] = 88; 
           
      position7[2][0] = 4;
      position7[2][1] = 88;
            
      position7[3][0] = 3;
      position7[3][1] = 84; 
           
      position7[4][0] = 5;
      position7[4][1] = 84; 
           
      position7[5][0] = 4;
      position7[5][1] = 80; 
           
      position7[6][0] = 2;
      position7[6][1] = 80;  
   
   }// End method
   
   
   

}// End class


/*

pos1
   number1 = [1][6];
   number2 = [2][10];     
   number3 = [4][10];     
   center = [3][6];
   number4 = [5][6];     
   number5 = [4][2];   
   number6 = [2][2];    
   

pos2
   number1 = [1][19];
   number2 = [2][23];     
   number3 = [4][23];     
   center = [3][19];
   number4 = [5][19];     
   number5 = [4][15];   
   number6 = [2][15];

pos3
   number1 = [1][32];
   number2 = [2][36];     
   number3 = [4][36];     
   center = [3][32];
   number4 = [5][32];     
   number5 = [4][28];   
   number6 = [2][28];

pos4
   number1 = [1][45];
   number2 = [2][49];     
   number3 = [4][49];     
   center = [3][45];
   number4 = [5][45];     
   number5 = [4][41];   
   number6 = [2][41];

pos5
   number1 = [1][58];
   number2 = [2][62];     
   number3 = [4][62];     
   center = [3][58];
   number4 = [5][58];     
   number5 = [4][54];   
   number6 = [2][54];

pos6
   number1 = [1][71];
   number2 = [2][75];     
   number3 = [4][75];     
   center = [3][71];
   number4 = [5][71];     
   number5 = [4][67];   
   number6 = [2][67];

pos7   
   number1 = [1][84];
   number2 = [2][88];     
   number3 = [4][88];     
   center = [3][84];
   number4 = [5][84];     
   number5 = [4][80];   
   number6 = [2][80];


*/

